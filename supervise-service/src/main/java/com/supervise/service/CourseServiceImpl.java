package com.supervise.service;

import com.supervise.api.CourseService;
import com.supervise.dao.CourseMapper;
import com.supervise.model.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/14 0014.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> getUndergraduateCourse(Course course, Integer page, Integer pageSize) {
        return courseMapper.query(course,page,pageSize);
    }

    @Override
    public Course getUndergraduateCourseById(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
