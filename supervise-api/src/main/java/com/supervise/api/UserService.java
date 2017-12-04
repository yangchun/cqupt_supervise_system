package com.supervise.api;

import com.supervise.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/10/19 0019.
 */
public interface UserService {

    public String getUserName(int id);

    User isLogin(String username,String password);

    List<User> query(User u);

    int addUser(User u);




}
