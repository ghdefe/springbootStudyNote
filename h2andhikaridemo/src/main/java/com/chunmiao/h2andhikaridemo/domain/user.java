package com.chunmiao.h2andhikaridemo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
public class user {

    @Id
    @Column(name = "USE_ID")
    private Integer  id;

    @Column(name = "USE_NAME")
    private String name;

    @Column(name = "USE_SEX")
    private String sex;

    @Column(name = "USE_AGE")
    private String age;

    @Column(name = "Use_ID_NO")
    private String no;

    @Column(name = "USE_PHONE_NUM")
    private String phonenumber;

    @Column(name = "USE_EMAIL")
    private String email;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    @Column(name = "USE_STATE")
    private String state;


}
