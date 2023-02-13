package com.epam.javacc.microservices.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("one-client")
public interface UseFeignClient {

    @RequestMapping("/greeting")
    String greetingFromFeign();

    @RequestMapping("/list")
    List<String> listFromFeign();
}

