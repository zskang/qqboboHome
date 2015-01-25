package com.service.impl;

import com.service.UserService;
import com.entity.User;
import com.mapper.UserMapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/1/3.
 */

@Repository(value = "userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public Integer count() {
        return userMapper.count();
    }

    public Integer create(User user) {
        return userMapper.create(user);
    }

    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public List<User> findAll(User user) {
        return userMapper.findAll(user);
    }

    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    public User findByUser(User user) {
        return userMapper.findByUser(user);
    }

    public Integer modify(User user) {
        return userMapper.modify(user);
    }

}
