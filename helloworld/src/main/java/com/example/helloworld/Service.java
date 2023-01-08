package com.example.helloworld;


@org.springframework.stereotype.Service
public class Service {

    public String worldGreeting(String country) {
        return switch (country) {
            case "japan" -> "こんにちわ！";
            case "us" -> "Hello!";
            case "italy" -> "Ciao!";
            case "france" -> "Bonjour!";
            default -> "Hello World!";
        };
    }


}



