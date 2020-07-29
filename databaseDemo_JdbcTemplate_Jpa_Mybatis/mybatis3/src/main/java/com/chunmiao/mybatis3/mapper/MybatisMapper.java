package com.chunmiao.mybatis3.mapper;

import com.chunmiao.mybatis3.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MybatisMapper {
    public List<User> queryAll();

    public User queryById(int id);

    public Long addUser(User user);

    public Long deleteUser(int id);

    public Long updateUser(User user);


}
