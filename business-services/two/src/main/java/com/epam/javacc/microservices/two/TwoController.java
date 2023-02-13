package com.epam.javacc.microservices.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TwoController {

    @GetMapping
    String getAnswer();
}
