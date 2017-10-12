package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuerhu on 2017/10/10.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User getUserById(Long id) {
        return this.userMapper.getUserById(id);
    }

}
