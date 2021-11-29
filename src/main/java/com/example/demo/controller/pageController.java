package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class pageController {
    @Autowired
    UserService2 userService2;
    @PostMapping("test")
    @ResponseBody
    public String login(String name,String password){
        User user=userService2.login(name, password);
        if(user!=null){
            return "success";
        }else {
            return "error";
        }

    }

}
