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
    public String addUser(User user){
        templateService.addUser(user);
        String s = "保存:" + user.toString();
        return s;
    }

    @RequestMapping("/deleteUser")
    public String deleteUserById(@RequestParam int id){
        templateService.deleteUserById(id);
        String s = "删除：" + id;
        return s;
    }

    @RequestMapping("/queryAll")
    public List<User> queryAllList(){
        List<User> users = templateService.queryAllList();
        return users;
    }

    @RequestMapping("/queryById")
    public User queryById(@RequestParam int id){
        return templateService.queryById(id);
    }

    @RequestMapping("/updateUser")
    public User update(User user){
        User user1 = templateService.queryById(user.getId());
        if (user.getName() != null) {
            user1.setName(user.getName());
        }
        if (user.getPassword() != null) {
            user1.setPassword(user.getPassword());
        }
        if (user.getUsername() != null) {
            user1.setUsername(user.getUsername());
        }
        templateService.updateUser(user1);
        return user1;
    }
}
