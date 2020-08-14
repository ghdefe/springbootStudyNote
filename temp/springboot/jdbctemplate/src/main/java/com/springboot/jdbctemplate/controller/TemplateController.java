package com.springboot.jdbctemplate.controller;

import com.springboot.jdbctemplate.service.TemplateService;
import com.springboot.jdbctemplate.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemplateController {

    @Autowired
    private TemplateService templateService;
    //增删查改

    @RequestMapping("/addUser")
    public String addUser(@RequestParam String name, String username, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setUsername(username);
        templateService.addUser(user);
        String s = "保存:" + user.toString();
        return s;
    }

    @RequestMapping("/deleteUserById")
    public String deleteUserById(@RequestParam int id) {
        templateService.deleteUserById(id);
        String s = "删除：" + id;
        return s;
    }

    @RequestMapping("/queryAllList")
    public List<User> queryAllList() {
        List<User> users = templateService.queryAllList();
        return users;
    }

    @RequestMapping("/queryById")
    public User queryById(@RequestParam int id) {
        return templateService.queryById(id);
    }

    @RequestMapping("/update")
    public User update(@RequestParam String name, String username, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setUsername(username);

        templateService.updateUser(user);
        return user;
    }
}
