package com.supervise.controller;

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

    @RequestMapping("/test")
    public void getTest(HttpServletRequest request,HttpServletResponse response){
        String userName=request.getParameter("username");
        String passWord=request.getParameter("password");
        System.out.println(userName+" = "+passWord);
        User u=new User();
        u.setUsername(userName);
        u.setPassword(passWord);
        //1.创建Cookie对象
        String token="yangchun"+String.valueOf(new Random().nextInt());
        Cookie cookie = new Cookie("userId",token);
        //2.设置Cookie参数
        //2.1.设置Cookie的有效路径
        cookie.setPath("/");//默认就是web项目的地址
        //2.2.设置Cookie的有效时间
        cookie.setMaxAge(2000);//该cookie只存活20秒，从最后不调该cookie开始计算
        cookie.setMaxAge(-1);//该cookie保存在浏览器内存中，关闭浏览器则销毁该cookie
        cookie.setMaxAge(0);//删除根该cookie同名的cookie
        response.addHeader("token","11111111111111111");
        response.addCookie(cookie);
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
        System.out.println("userName="+userName+"======"+passWord);
        String token = "";
        token = Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "base64EncodedSecretKey").compact();
        JSONObject jo=new JSONObject();
        jo.put("token",token);
        res.addHeader("Authorization",token);
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
