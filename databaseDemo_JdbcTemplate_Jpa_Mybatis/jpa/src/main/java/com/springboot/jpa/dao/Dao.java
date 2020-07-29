package com.springboot.jpa.dao;

import com.springboot.jpa.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<user, Integer> {

}
