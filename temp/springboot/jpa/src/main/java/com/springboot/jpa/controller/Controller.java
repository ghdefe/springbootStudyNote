package com.springboot.jpa.controller;

import com.springboot.jpa.entity.user;
import com.springboot.jpa.service.Service;
import com.springboot.jpa.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;

    //增删改查
    @PostMapping("/addUser")
    public CommonResult addUser(user user) {
        CommonResult result = new CommonResult();
        try {
            result.setData(service.save(user));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    @PostMapping("/DeleteUser")
    public CommonResult DeleteUser(@RequestParam int id) {
        CommonResult result = new CommonResult();
        try {
            service.deleteById(id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    @PostMapping("/updateUser")
    public CommonResult updateUser(user user) {
        CommonResult result = new CommonResult();
        try {
            result.setData(service.update(user));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    @PostMapping("/queryAll")
    public CommonResult queryAll() {
        CommonResult result = new CommonResult();
        try {
            List<user> users = service.findAll();
            result.setData(users);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    @PostMapping("/queryById")
    public CommonResult queryById(int id) {
        CommonResult result = new CommonResult();
        try {
            user u = service.findById(id);
            result.setData(u);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }


}
