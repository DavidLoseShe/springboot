package com.springboot.service;

import com.springboot.model.Person;

/**
 * Created by guhao on 2018/2/13.
 */
public interface UserService {
    Person selectUser(int id);
    void insertUser(Person person);
    void updateUser(Person person);
    void deleteUser(int id);

}