package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        String message = "hello world";
        return message;
    }

    @GetMapping("/japan")
    public Object japan() {
        String responseJapan = "ようこそ　日本へ";
        return responseJapan;


    }

    @GetMapping("/china")
    public Object china() {
        String responseChina = "ようこそ　中国へ";
        return responseChina;
    }

    @GetMapping("/time")
    public Object japanTime() {
        LocalDateTime nowDate = LocalDateTime.now();

        DateTimeFormatter Time =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日");
        String formatNowDate = Time.format(nowDate);
        return formatNowDate;
    }


}



