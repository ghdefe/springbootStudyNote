package com.chunmiao.eurekademo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemo3Application.class, args);
    }

}
