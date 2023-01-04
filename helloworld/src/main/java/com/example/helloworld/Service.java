package com.example.helloworld;


import org.springframework.web.bind.annotation.RequestParam;


public class Service {

    public static String worldGreeting(@RequestParam(value = "country", defaultValue = "japan") String country) {
        String greeting = switch (country) {
            case "japan" -> "こんにちわ！";
            case "us" -> "Hello!";
            case "italy" -> "Ciao!";
            case "france" -> "Bonjour!";
            default -> "Hello World!";
        };
        return greeting;
    }


}



