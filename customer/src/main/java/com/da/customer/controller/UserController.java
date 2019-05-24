package com.da.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.da.common.domin.User;
import com.da.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User getUser(){
        System.out.println("customer getUser() | hashCode" + userService.hashCode());
        return userService.findUser();
    }

}
