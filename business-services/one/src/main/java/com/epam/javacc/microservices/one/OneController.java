package com.epam.javacc.microservices.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface OneController {

    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/list")
    List <String> getList();

}
