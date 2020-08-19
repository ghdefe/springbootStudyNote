package com.chunmiao.h2andhikaridemo.controller;

import com.chunmiao.h2andhikaridemo.dao.userDao;
import com.chunmiao.h2andhikaridemo.domain.user;
import com.chunmiao.h2andhikaridemo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import javax.websocket.server.PathParam;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@RestController
public class userController {
    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    @Autowired
    private userService userService;

    @Autowired
    private userDao userDao;

    @RequestMapping("/getAll")
    public List<user> getAll(){
        return userService.getAll();
    }

    @RequestMapping("/deleteAll")
    public void deleteAll(){
        userDao.deleteAll();
    }

    @RequestMapping("/getByAge/{age}")
    public user getByAge(@PathVariable String age){
        return userDao.findByAge(age);
    }

    @RequestMapping("/getByName/{name}")
    public user getByName(@PathVariable String name){
        return userDao.findByName(name);
    }

    @RequestMapping("/getBySex/{sex}")
    public List<user> getBySex(@PathVariable String sex) throws SQLException {
        System.out.println("热部署测试，热部署需要重启idea才能生效");
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select * from user";
        boolean execute = statement.execute(sql);
        return userDao.findAllBySex(sex);
    }

}
