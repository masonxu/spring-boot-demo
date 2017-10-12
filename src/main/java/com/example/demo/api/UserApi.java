package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuerhu on 2017/10/10.
 */
@RestController
@RequestMapping(value = "/users")
public class UserApi {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{userId}")
    public User getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return user;
    }
}
