package com.example.mapper.third;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThirdMapper {
     List<User>  getAllUsers();
     void InsertUser(User user); //不能加param
     void updateUser(@Param("a") String a);
}
