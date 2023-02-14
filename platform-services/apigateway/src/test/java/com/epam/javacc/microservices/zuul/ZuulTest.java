package com.epam.javacc.microservices.zuul;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZuulTest {

    @Test
    public void whenSendRequestToFooResource_thenOK() {
        Response response = RestAssured.get("http://localhost:8080/two/1");

        assertEquals(200, response.getStatusCode());
    }
}