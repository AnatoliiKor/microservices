package com.epam.javacc.microservices.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @GetMapping
    public String getAnswer(){
        return "Answer from 'TWO' microservice";
    }
}
