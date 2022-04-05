package com.greatlearning.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Great Learning Spring Boot and Spring Security Graded Coding Assignment 6</h1>";
    }

}
