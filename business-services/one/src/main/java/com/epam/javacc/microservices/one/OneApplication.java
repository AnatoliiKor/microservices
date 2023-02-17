package com.epam.javacc.microservices.one;

import com.netflix.discovery.EurekaClient;
import com.netflix.servo.monitor.BasicCounter;
import com.netflix.servo.monitor.Counter;
import com.netflix.servo.monitor.MonitorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class OneApplication implements OneController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	Counter counter = new BasicCounter(MonitorConfig.builder("counter").build());

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

	@Override
	public String greeting(){
		counter.increment();
		return String.format("Hello from '%s'! Number of requests to greeting service is %d",
				eurekaClient.getApplication(appName).getName(), counter.getValue().intValue());
	}

	@Override
	public List<String> getList() {
		return new ArrayList<>(Arrays.asList("first", "second", "third"));
	}
}
