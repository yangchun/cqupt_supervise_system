package com.supervise.util;

/**
 * Created by Administrator on 2017/12/15 0015.
 */
public class StringUtil {

    public static String getLegalString(String param){
        if(param==null||"".equals(param)){
            return null;
        }
        if(param.trim().length()==0){
            return null;
        }
        return param;
    }




}
