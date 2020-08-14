package com.chunmiao.eurekademo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemo4Application.class, args);
    }

}
