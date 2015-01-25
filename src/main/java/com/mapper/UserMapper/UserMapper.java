package com.mapper.UserMapper;

import com.entity.User;
import com.mapper.SqlMapper.SqlMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository(value = "userMapper")
@Transactional
public interface UserMapper  extends SqlMapper {
    Integer create(User user);

    Integer delete(Integer id);

    Integer modify(User user);

    User findById(Integer id);

    User findByUser(User user);

    List<User> findAll();

    List<User> findAll(User user);

    Integer count();
}
