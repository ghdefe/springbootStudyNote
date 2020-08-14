package com.chunmiao.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "PRODUCT")
public interface ProductFeignClient {

    @PostMapping("/product/hello")
    String hello();
}
