package com.chunmiao.mybatis3.controller;

import com.chunmiao.mybatis3.entity.User;
import com.chunmiao.mybatis3.service.mybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mybatisController {
    @Autowired
    mybatisService ms;

    @RequestMapping("/queryById")
    public User getUserById(@RequestParam int id){
        return ms.queryById(id);
    }

    @RequestMapping("/queryAll")
    public List<User> queryAll(){
        return ms.queryAll();
    }

    @RequestMapping("/addUser")
    public Long addUser(User user){
        return ms.addUser(user);
    }

    @RequestMapping("/deleteUser")
    public Long deleteUser(int id){
        return ms.deleteUser(id);
    }

    @RequestMapping("/updateUser")
    public Long updateUser(User user) {
        return ms.updateUser(user);
    }

}
