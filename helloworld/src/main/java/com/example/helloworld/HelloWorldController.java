package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        String message = "hello world";
        return message;
    }

    @GetMapping("/japan")
    public String japan() {
        String response = "ようこそ　日本へ";
        return response;
    }
}
