package com.supervise.controller;

import com.supervise.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/10/19 0019.
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName(){
        return userService.getUserName(1);
    }

    @RequestMapping("/test")
    public String getTest(){
        System.out.println("asdasd");
        return "test";
    }

    @RequestMapping("/getCookies")
    public String getCookies(HttpServletRequest request,HttpServletResponse response){
        Cookie ck=new Cookie("token","123456");
        ck.setPath("/");
        ck.setSecure(true);
        response.addCookie(ck);
        return "index";
    }



}
