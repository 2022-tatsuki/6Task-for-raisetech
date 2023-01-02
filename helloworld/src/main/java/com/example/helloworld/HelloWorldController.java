package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        String message = "hello world";
        return message;
    }

   @GetMapping("/greeting")
   public String worldGreeting(
           @RequestParam(name="country",value ="country",defaultValue = "none",required = false)String country)
    {
        String greeting="Hello world";

        if (Objects.equals(country,"japan")){
            greeting="こんにちわ";
        }else if (Objects.equals(country,"us")){
            greeting="hello";
        }else if (Objects.equals(country,"france")){
            greeting="Bonjour";
        }else if (Objects.equals(country,"italy")){
            greeting="Ciao";
        }
        return greeting;
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



