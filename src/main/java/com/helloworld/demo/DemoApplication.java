package com.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.boot.autoconfigure.*;

//@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {
/*
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
