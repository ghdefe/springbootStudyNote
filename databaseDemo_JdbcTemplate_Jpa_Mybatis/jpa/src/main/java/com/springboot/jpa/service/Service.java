package com.springboot.jpa.service;

import com.springboot.jpa.dao.Dao;
import com.springboot.jpa.entity.user;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Dao dao;


    public user save(user user) {
        return dao.save(user);
    }

    public user update(user user) {
        user user1 = dao.findById(user.getId()).get();
        if (user.getName() != null) {
            user1.setName(user.getName());
        }
        if (user.getPassword() != null) {
            user1.setPassword(user.getPassword());
        }
        if (user.getUsername() != null) {
            user1.setUsername(user.getUsername());
        }
        save(user1);
        return user1;
    }

    public void deleteById(int id) {
        dao.deleteById(id);
    }

    public List<user> findAll() {
        return dao.findAll();
    }

    public user findById(int id) {
        return dao.findById(id).get();
    }
}
