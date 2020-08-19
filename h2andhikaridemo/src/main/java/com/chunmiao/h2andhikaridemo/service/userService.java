package com.chunmiao.h2andhikaridemo.service;

import com.chunmiao.h2andhikaridemo.dao.userDao;
import com.chunmiao.h2andhikaridemo.domain.user;
import com.chunmiao.h2andhikaridemo.domain.user1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userDao userDao;

    public List<user> getAll(){
        return userDao.findAll();
    }
}
