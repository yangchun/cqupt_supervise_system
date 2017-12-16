package com.supervise.api;

import com.supervise.model.Course;

import java.util.List;

/**
 * Created by Administrator on 2017/12/14 0014.
 */
public interface CourseService {

    List<Course> getUndergraduateCourse(Course course,Integer page,Integer pageSize);

    Course getUndergraduateCourseById(int id);
}
