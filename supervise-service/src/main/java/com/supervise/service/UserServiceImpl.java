package com.supervise.service;

import com.supervise.api.UserService;
import com.supervise.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/19 0019.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public String getUserName(int id) {
        return userMapper.selectByPrimaryKey(id).getUsername();
    }
}
