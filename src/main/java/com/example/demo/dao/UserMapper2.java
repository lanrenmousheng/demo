package com.example.demo.dao;

import com.example.demo.bean.User;


public interface UserMapper2 {
    User get(String name, String password);
}
