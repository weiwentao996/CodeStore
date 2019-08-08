package com.train.day20.dao;

import com.train.day20.pojo.Course;

import java.util.List;

public interface CourseDao {
    /**
     * 查询所有课程
     * @return
     */
    List<Course> findAll();
    List<Course> findCourseBySno(String sno);
}
