package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/name")
    public String getName(){
        return"bander";
    }@GetMapping("/age")
    public String getAge(){
        return"20";
    }@GetMapping("/check/status")
    public String checkstaus(){
        return"Everything OK";
    }@GetMapping("/helath")
    public String getHelath(){
        return"Server health is up and running";
    }
}
