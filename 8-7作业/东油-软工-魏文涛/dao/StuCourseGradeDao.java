package com.train.day20.dao;

import com.train.day20.pojo.StuCourseGrade;

import java.util.List;

/**
 * 需要从三张表中查找数据
 */
public interface StuCourseGradeDao {
    List<StuCourseGrade> findAll();

}
