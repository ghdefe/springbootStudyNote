package com.chunmiao.redisdemo.service;

import com.chunmiao.redisdemo.dao.redisDao;
import com.chunmiao.redisdemo.domain.user;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.util.internal.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class redisService {
    @Autowired
    private redisDao redisDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

//    /**
//     * 直接存入对象到redis中
//     * @return
//     */
//    public List<user> getAll() {
//        BoundValueOperations<String, Object> ops = redisTemplate.boundValueOps("user");
//        Object s =  ops.get();
//        if (s == null){
//            List<user> all = redisDao.findAll();
//            ops.set(all);
//            System.out.println("从数据库拿数据");
//            return all;
//        }else {
//            System.out.println("从redis拿数据");
//            return (List<user>) s;
//        }
//    }

    /**
     * 使用redis，并使用jackson转化为json数据后再存入redis。其实也可以不用转化的
     * @return
     */
    public List<user> getAll() {
        BoundValueOperations<String, Object> ops = redisTemplate.boundValueOps("user");
        Object s =  ops.get();
        if (s == null){
            // redis中没有，从数据库拿数据
            List<user> all = redisDao.findAll();
            // 往redis存值
            String s1 = null;
            try {
                s1 = objectMapper.writeValueAsString(all);
                System.out.println("JSON:" + s1);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            ops.set(s1);
            System.out.println("从数据库拿数据");

            return all;
        } else {
            // 直接从redis中拿
            System.out.println("从redis拿数据");
            List<user> list = null;
            try {
                list = objectMapper.readValue((String) s, List.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return list;
        }
    }

}
