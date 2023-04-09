package com.example.Spring_Boot_RESTful_API.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting() {
        return "Hello, I'm using spring boot!";
    }
}
