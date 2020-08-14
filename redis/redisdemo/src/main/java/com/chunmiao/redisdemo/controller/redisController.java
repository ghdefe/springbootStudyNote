package com.chunmiao.redisdemo.controller;

import com.chunmiao.redisdemo.dao.redisDao;
import com.chunmiao.redisdemo.domain.user;
import com.chunmiao.redisdemo.service.redisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class redisController {
    @Autowired
    private redisService redisService;

    @RequestMapping("/getAll")
    public List<user> getAll(){
        return redisService.getAll();
    }
}
