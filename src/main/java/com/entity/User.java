package com.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/1/3.
 */
@Repository(value = "user")
public class User implements Serializable {

    private Integer id;
    private String name;
    private String pass;
    private Integer age;

    public User() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}