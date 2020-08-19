package com.chunmiao.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloDocker {
    @RequestMapping("/")
    public String index(){
        return "hello Docker!";
    }
}
