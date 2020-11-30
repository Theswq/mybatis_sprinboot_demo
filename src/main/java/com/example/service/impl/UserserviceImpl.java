package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice {


    @Autowired
    UserMapper userMapper;



    public List<User> getAllUsers(){
            return userMapper.getAllUsers();
    }
}
