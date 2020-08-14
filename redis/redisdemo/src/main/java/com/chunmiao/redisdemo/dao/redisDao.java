package com.chunmiao.redisdemo.dao;

import com.chunmiao.redisdemo.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface redisDao extends JpaRepository<user, Integer> {
}
