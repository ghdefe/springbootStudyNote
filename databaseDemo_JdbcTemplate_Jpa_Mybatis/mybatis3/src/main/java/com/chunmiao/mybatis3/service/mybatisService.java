package com.chunmiao.mybatis3.service;

import com.chunmiao.mybatis3.mapper.MybatisMapper;
import com.chunmiao.mybatis3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mybatisService {
    @Autowired
    MybatisMapper md;


    public User queryById(int id) {
        return md.queryById(id);
    }

    public List<User> queryAll() {
        return md.queryAll();
    }

    public Long addUser(User user) {
        return md.addUser(user);
    }

    public Long deleteUser(int id) {
        return md.deleteUser(id);
    }

    public Long updateUser(User user) {
        return md.updateUser(user);
    }
}
