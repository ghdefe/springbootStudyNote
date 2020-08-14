package com.chunmiao.clientdemoforeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hello {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(){
        return "hello" + ".这是生产者发出的服务";
    }

    @RequestMapping("/helloService")
    public Object heeloService(){
        return discoveryClient.getServices().toString();
    }


}
