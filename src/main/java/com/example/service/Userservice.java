package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Userservice {

    //获取所有的用户表信息
    List<User> getAllUsers();

    void  InsertUser(User user);
    void  updateUser( String a );
}
