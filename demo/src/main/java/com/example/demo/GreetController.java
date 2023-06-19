package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {

    @PostMapping("/greet")
    public String greet(@RequestBody String message) {
        return "Received message: " + message;
    }

}