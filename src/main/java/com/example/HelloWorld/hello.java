package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {
    @GetMapping("/hello")
    public String hello() {
        return "HELLO WORLD";
    }


    @GetMapping("/student")
    public student getstudentdetails() {

        return new student(100, "peter", "england");
    }
}


