package com.chunmiao.redisdemo;

import com.chunmiao.redisdemo.domain.user;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test1 {

    @Test
    public void demo1(){
        ObjectMapper objectMapper = new ObjectMapper();
        user user = new user();
        user.setId(1);
        user.setName("hehe");
        user.setPassword("123");
        user.setUsername("呵呵");
        System.out.println(user);
        try {
            String s = objectMapper.writeValueAsString((Object) user);
            System.out.println("JSON字符串： " + s);
            user user1 = objectMapper.readValue(s, user.class);
            System.out.println("JSON转换回来的user对象： " + user1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
