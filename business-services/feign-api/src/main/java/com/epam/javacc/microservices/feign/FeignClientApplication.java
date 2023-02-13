package com.epam.javacc.microservices.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
public class FeignClientApplication {
    @Autowired
    private UseFeignClient feignClient;

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", feignClient.greetingFromFeign());
        return "greeting-view";
    }

    @RequestMapping("/get-list")
    public String getList(Model model) {
        model.addAttribute("list", String.join(", ", feignClient.listFromFeign()));
        return "greeting-view";
    }
}
