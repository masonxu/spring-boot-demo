package com.example.demo.mapper;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by xuerhu on 2017/10/10.
 */
@Repository
public interface UserMapper {
    User getUserById(Long id);
}
