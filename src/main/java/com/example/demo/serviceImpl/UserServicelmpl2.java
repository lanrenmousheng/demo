package com.example.demo.serviceImpl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserMapper2;
import com.example.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl2 implements UserService2 {
    @Autowired(required=false)
    private UserMapper2 userMapper2;
    @Override
    public User login(String name, String password) {

        return userMapper2.get(name,password);
    }
}
