package com.springboot.jdbctemplate.dao;

import com.springboot.jdbctemplate.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class TemplateDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(User user) {
        String sql = "insert into user (username,password,name) values (?,?,?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getName());
    }

    public void deleteUserById(int userId) {
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql, userId);
    }

    public List<User> queryAllList() {
        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    public User queryById(int id) {
        String sql = "select * from user where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return (User) jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    public void updateUser(User user) {
    }
}
