package com.train.day20.dao;

import com.train.day20.pojo.Student;

import java.util.List;

public interface StudentDao {
    Student findByIdStudentCourseInfo(String sno);
}
