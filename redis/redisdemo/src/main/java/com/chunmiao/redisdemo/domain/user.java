package com.chunmiao.redisdemo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class user implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String password;

    private String username;

}
