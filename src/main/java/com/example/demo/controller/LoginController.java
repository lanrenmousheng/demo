package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @PostMapping("search")
    public String get_info(int id){
        System.out.println(id);
        UserBean userBean = userService.search(id);
        System.out.println(userBean.getInfo());
        return "/html/test";
    }


}
