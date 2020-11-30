package com.example.controller;

import com.example.entity.User;
import com.example.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    Userservice userservice;


    @RequestMapping("/getAllUsers")
    public String getAllUsers(){

        return userservice.getAllUsers().toString();
    }

    @RequestMapping("/insertUser")
    public void InsertUser(){
        User user = new User();
        user.setUserId("ss");
        user.setUsername("ss");
        user.setUserPassword("ss");
        userservice.InsertUser(user);
    }

    @RequestMapping("/updateUser")
    public void updateUser(String a){
        LOGGER.info("hello " +a );
        userservice.updateUser(a);
    }


}
