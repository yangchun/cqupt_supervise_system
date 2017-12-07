package com.supervise.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.supervise.api.UserService;
import com.supervise.model.User;
import com.supervise.util.CommonUtil;
import com.supervise.util.SystemCode;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Random;


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
    public JSONObject getUserName(HttpServletResponse response){
        System.out.println("====================");
        String name=userService.getUserName(1);
        JSONObject obj=CommonUtil.constructResponseJSON(1,"成功！",name);
        return obj;
    }

    @RequestMapping("/getCookies")
    public String getCookies(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        //注意：判断null,否则空指针
        if(cookies!=null){
            //遍历
            System.out.println("cookies size="+cookies.length);
            for(Cookie c:cookies){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+"="+value);
            }
        }else{
            System.out.println("没有接收cookie数据");
        }
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public  JSONObject login(HttpServletResponse res,String userName,String passWord){
        if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(passWord)){
            return CommonUtil.constructResponse(SystemCode._USER_LOGIN_ERROR.code,SystemCode._USER_LOGIN_ERROR.desc,null);
        }
        User user=userService.isLogin(userName,passWord);
        if(user==null){
            return CommonUtil.constructResponse(SystemCode._USER_LOGIN_ERROR.code,SystemCode._USER_LOGIN_ERROR.desc,null);
        }
        String token = "";
        token = Jwts.builder().setId(String.valueOf(user.getId())).setSubject(user.getUsername()).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "base64EncodedSecretKey").compact();
        JSONObject jo=new JSONObject();
        jo.put("token",token);
        Cookie cookie = new Cookie("token",token);
        cookie.setPath("/");//默认就是web项目的地址
        //2.2.设置Cookie的有效时间
        cookie.setMaxAge(3000);
        res.addCookie(cookie);

        return CommonUtil.constructResponse(1,"成功！",jo);
    }


    @RequestMapping("addUser")
    @ResponseBody
    public JSONObject addUser(){
        User u=new User();
        u.setId(2);
        u.setUsername("test");
        userService.addUser(u);
        return CommonUtil.constructResponse(1,"成功！",null);
    }





}
