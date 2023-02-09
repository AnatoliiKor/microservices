package com.epam.javacc.microservices.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @GetMapping
    public String getAnswer(){
        return "Answer from 'ONE' microservice";
    }
}
