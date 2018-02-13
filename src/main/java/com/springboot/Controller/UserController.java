package com.springboot.Controller;

import com.springboot.model.Person;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guhao on 2018/2/13.
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public Person selectUser (@PathVariable int id){
        return userService.selectUser(id);
    }
    @RequestMapping("/addUser")
    public void insertUser(Person person){
         userService.insertUser(person);
    }
    @RequestMapping("/modifyUser")
    public void updateUser(Person person){
         userService.updateUser(person);
    }
    @RequestMapping("/subUser/{id}")
    public void deleteUser(@PathVariable int id){
         userService.deleteUser(id);
    }
}
