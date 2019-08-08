package com.train.day20.dao;

import com.train.day20.base.BaseDaoImpl;
import com.train.day20.pojo.StuCourseGrade;

import java.util.List;

public class StuCourseGradeDaoImpl extends BaseDaoImpl implements StuCourseGradeDao {
    @Override
    public List<StuCourseGrade> findAll() {
        String sql = "select s.sno,sname,cname,grade from course c,student s,sc where s.sno = sc.sno and sc.cno = c.cno ";
        return executeQuery(sql,StuCourseGrade.class);
    }
}
