package com.supervise.controller;

import com.alibaba.fastjson.JSONObject;
import com.supervise.api.CourseService;
import com.supervise.api.UserService;
import com.supervise.model.Course;
import com.supervise.util.CommonUtil;
import com.supervise.util.StringUtil;
import com.supervise.util.SystemCode;
import com.supervise.util.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/14 0014.
 */
@Controller
@RequestMapping("/courseController")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/getUndergraduateCourse")
    @ResponseBody
    public JSONObject getUndergraduateCourse(HttpServletRequest request){
        Course course =new Course();
        course.setAcademy(StringUtil.getLegalString(request.getParameter("academy")));
        course.setTeacher(StringUtil.getLegalString(request.getParameter("teacher")));
        course.setCourseNumber(StringUtil.getLegalString((request.getParameter("courseNumber"))));
        course.setCourseName(StringUtil.getLegalString((request.getParameter("courseName"))));
        int page=1;
        String pageStr=request.getParameter("page");
        if(pageStr!=null&&pageStr.trim().length()>0){
            page=Integer.valueOf(pageStr);
        }
        List<Course> courseList=courseService.getUndergraduateCourse(course,(page-1)*SystemConfig.pageSize, SystemConfig.pageSize);
        return CommonUtil.constructHtmlResponse(SystemCode._SYSTEM_SUCCESS.code,SystemCode._SYSTEM_SUCCESS.desc,courseList);
    }

    @RequestMapping("/getUndergraduateCourseById")
    @ResponseBody
    public JSONObject getUndergraduateCourseById(int id) {
        Course course = courseService.getUndergraduateCourseById(id);
        if (course != null) {
            return CommonUtil.constructHtmlResponse(SystemCode._SYSTEM_SUCCESS.code, SystemCode._SYSTEM_SUCCESS.desc, course);
        }else{
            return CommonUtil.constructHtmlResponse(SystemCode._SYSTEM_RESULT_NULL.code, SystemCode._SYSTEM_RESULT_NULL.desc, null);
        }
    }


}
