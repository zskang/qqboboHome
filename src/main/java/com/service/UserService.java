package com.service;

import com.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2015/1/3.
 */
@Repository(value = "userService")
public interface UserService {

    Integer create(User user);

    Integer delete(Integer id);

    Integer modify(User user);

    User findById(Integer id);

    User findByUser(User user);

    List<User> findAll();

    List<User> findAll(User user);

    Integer count();
}
