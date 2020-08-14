package com.springboot.jdbctemplate.service;

import com.springboot.jdbctemplate.dao.TemplateDao;
import com.springboot.jdbctemplate.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class TemplateService {
    @Autowired
    private TemplateDao templateDao;
    //增删查改

    public void addUser(User user) {
        templateDao.addUser(user);
    }

    public void deleteUserById(int userId) {
        templateDao.deleteUserById(userId);
    }

    public List<User> queryAllList() {
        return templateDao.queryAllList();
    }

    public User queryById(int id) {
        return templateDao.queryById(id);
    }

    public void updateUser(User user) {
        templateDao.updateUser(user);
    }
}
