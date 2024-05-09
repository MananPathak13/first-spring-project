package com.firstproject.first_spring_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
    @RequestMapping("/hello")

    public String hello() {
        return "Hello World!";
    }
}
