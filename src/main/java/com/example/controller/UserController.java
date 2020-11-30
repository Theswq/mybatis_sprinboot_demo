package com.example.controller;

import com.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    Userservice userservice;


    @RequestMapping("/getAllUsers")
    public String getAllUsers(){

        return userservice.getAllUsers().toString();
    }
}
