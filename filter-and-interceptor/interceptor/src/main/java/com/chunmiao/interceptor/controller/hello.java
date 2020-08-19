package com.chunmiao.interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/")
    String blank(){
        System.out.println("test");
        return "控制层消息";
    }
}
