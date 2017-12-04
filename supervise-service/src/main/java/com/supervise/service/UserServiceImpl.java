package com.supervise.service;

import com.supervise.api.UserService;
import com.supervise.dao.UserMapper;
import com.supervise.model.User;
import com.supervise.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/10/19 0019.
 */
@Transactional(propagation = Propagation.REQUIRED,rollbackFor={RuntimeException.class, Exception.class})
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public String getUserName(int id) {
        User u=new User();
        u.setStatus(1);
        List<User> users=userMapper.query(u);
        for(User uu:users){
            System.out.println(uu.toString());
        }
        System.out.println("========");
        return userMapper.selectByPrimaryKey(id).getUsername();
    }


    @Override
   public User isLogin(String username, String password) {
        User u=new User();
        u.setUsername(username);
        u.setPassword(password);
        List<User> users=userMapper.query(u);
        if(users!=null&& users.size() == 1){
            return users.get(0);
        }
        return null;
    }



    @Override
    public List<User> query(User u) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor={RuntimeException.class, Exception.class})
    public int addUser(User u)  {

            userMapper.updateByPrimaryKey(u);
            userMapper.insert(u);

        return 0;
    }



}
