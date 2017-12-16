package com.supervise.util;

/**
 * Created by Administrator on 2017/11/15 0015.
 */
public class SystemCode {

    //系统请求成功1开头
    public static SystemCode _SYSTEM_SUCCESS=new SystemCode(1,"请求成功！");

    //系统级别错误10000开头
    public static SystemCode _SYSTEM_ERROR=new SystemCode(10000,"系统未知错误！");
    public static SystemCode _SYSTEM_RESULT_NULL=new SystemCode(10001,"请求结果为空！");//系统错误
    //用户级别错误20000开头
    public static SystemCode _USER_LOGIN_ERROR=new SystemCode(20000,"请输入正确的用户名和密码！");  //系统错误
    public static SystemCode _PARAM_ERROR=new SystemCode(20001,"请输入正确的参数！");










    public final int code;
    public final String desc;
    public SystemCode(int code, String desc){
        this.desc = desc;
        this.code = code;
    }

}
