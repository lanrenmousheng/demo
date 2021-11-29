package com.example.demo.serviceImpl;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public UserBean search(int id) {

        return userMapper.get(id);
    }

}
