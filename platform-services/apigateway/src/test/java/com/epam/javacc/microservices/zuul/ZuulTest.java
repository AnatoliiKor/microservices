package com.epam.javacc.microservices.zuul;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZuulTest {

    @Disabled
    @Test
    public void whenSendRequestToFooResource_thenOK() {
        Response response = RestAssured.get("http://localhost:8062/two/1");

        assertEquals(200, response.getStatusCode());
    }
}
