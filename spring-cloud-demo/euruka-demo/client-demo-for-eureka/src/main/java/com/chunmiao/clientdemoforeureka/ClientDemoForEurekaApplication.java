package com.chunmiao.clientdemoforeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这是生产者
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientDemoForEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientDemoForEurekaApplication.class, args);
    }

}
