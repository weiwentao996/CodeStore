package com.train.day20.dao;

import com.train.day20.base.BaseDaoImpl;
import com.train.day20.pojo.Course;

import java.util.List;

public class CourseDaoImpl extends BaseDaoImpl implements CourseDao {
    @Override
    public List<Course> findAll() {
        String sql = "select * from course";
        return executeQuery(sql, Course.class);
    }

    @Override
    public List<Course> findCourseBySno(String sno) {
        String sql = "select sc.cno,cname,cpno,Ccredit from sc,course where sc.cno = course.cno and sc.sno = ?";
        return executeQuery(sql,Course.class,sno);
    }
}
