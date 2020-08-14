package com.example.demo3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/hello")
    public String helloSpringboot() {
        return "hello Springboot!";
    }
}
