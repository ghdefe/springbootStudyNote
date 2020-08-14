package com.chunmiao.consumer.controller;

import com.chunmiao.consumer.client.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consumerController {
    @Autowired
    private ProductFeignClient productFeignClient;

    @RequestMapping("/hello")
    String hello(){
        return "我是消费者，我正在调用生产者方法：\n" + productFeignClient.hello();
    }
}
