package com.epam.javacc.microservices.two;

import com.netflix.discovery.EurekaClient;
import com.netflix.servo.monitor.BasicTimer;
import com.netflix.servo.monitor.MonitorConfig;
import com.netflix.servo.monitor.Stopwatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import static java.util.concurrent.TimeUnit.SECONDS;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class TwoApplication implements TwoController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	private final BasicTimer timer = new BasicTimer(MonitorConfig.builder("timer").build(), SECONDS);

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(TwoApplication.class, args);
	}

	@Override
	public String getAnswer(){
		Stopwatch stopwatch = timer.start();
		try {
			SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.err.println("InterruptedException");
		}
		timer.record(2, SECONDS);
		stopwatch.stop();
		return String.format("Hello from '%s'! Timer of requests to greeting service is %d",
				eurekaClient.getApplication(appName).getName(), timer.getTotalTime().intValue());
	}

}
