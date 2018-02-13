package com.springboot.service.impl;

import com.springboot.mapper.UserMapper;
import com.springboot.model.Person;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guhao on 2018/2/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

    public void insertUser(Person person) {
         userMapper.insertUser(person);
    }

    public void updateUser(Person person) {
        userMapper.updateUser(person);
    }

    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}
