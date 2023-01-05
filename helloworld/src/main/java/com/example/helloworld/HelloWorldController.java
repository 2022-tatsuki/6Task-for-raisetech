package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {
    @Autowired

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }


    @GetMapping("/time")
    public Object japanTime() {
        LocalDateTime nowDate = LocalDateTime.now();

        DateTimeFormatter Time =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日");
        return Time.format(nowDate);
    }


    @GetMapping("/greeting")
    public String response(@RequestParam(value = "country", defaultValue = "japan") String country) {

        return Service.worldGreeting(country);
    }

}



