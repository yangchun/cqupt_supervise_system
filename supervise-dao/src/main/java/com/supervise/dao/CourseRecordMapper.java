package com.supervise.dao;

import com.supervise.model.CourseRecord;

public interface CourseRecordMapper {
    int insert(CourseRecord record);

    int insertSelective(CourseRecord record);
}