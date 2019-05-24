package com.da.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.da.common.domin.User;
import com.da.common.service.UserService;
import com.da.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getUser(1l);
    }
}
