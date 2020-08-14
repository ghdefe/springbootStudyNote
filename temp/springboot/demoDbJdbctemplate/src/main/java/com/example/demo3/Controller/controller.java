package com.example.demo3.Controller;

import com.example.demo3.Module.module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/he")
public class controller {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String helloSpringboot() {
        return "hello Springboot!";
    }

    @RequestMapping("/dbtest")
    public String dbTest() {
        String sql = "select * from user where id = 2";
        RowMapper<module> rowMapper = new BeanPropertyRowMapper<>(module.class);
        module module = jdbcTemplate.queryForObject(sql, rowMapper);
        return module.toString();
    }

    @RequestMapping("/dbtests")
    public String dbTests() {
        String sql = "select * from user";
        RowMapper<module> rowMapper = new BeanPropertyRowMapper<>(module.class);
        List<module> query = jdbcTemplate.query(sql, rowMapper);
        StringBuffer stringBuffer = new StringBuffer();
        for (module module : query) {
            stringBuffer.append(module.toString());
            stringBuffer.append("\n");
        }
        String s = new String(stringBuffer);
        System.out.println(s);
        return s;


    }
}
