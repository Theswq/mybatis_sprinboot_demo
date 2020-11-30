package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    //实现类注入即可
public class UserserviceImpl implements Userservice {


    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers(){
            return userMapper.getAllUsers();
    }

    public void  InsertUser(User user)
    {
        userMapper.InsertUser(user);
    }

    public void  updateUser( String a ){
        userMapper.updateUser(a);
    }

}
