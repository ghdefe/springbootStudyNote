package com.chunmiao.h2andhikaridemo.dao;

import com.chunmiao.h2andhikaridemo.domain.user;
import com.chunmiao.h2andhikaridemo.domain.user1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

@Repository
public interface userDao extends JpaRepository<user,Integer> {

    public user findByAge(String age);

    public user findByName(String name);

    public List<user> findAllBySex(String sex);
}
