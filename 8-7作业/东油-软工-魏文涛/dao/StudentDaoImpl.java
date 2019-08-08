package com.train.day20.dao;

import com.train.day20.base.BaseDaoImpl;
import com.train.day20.base.JdbcUtil;
import com.train.day20.pojo.Course;
import com.train.day20.pojo.Student;

import java.sql.Connection;
import java.util.List;

public class StudentDaoImpl extends BaseDaoImpl  implements StudentDao {
    @Override
    public Student findByIdStudentCourseInfo(String sno) {
        Connection connection = JdbcUtil.getInstance().getConnection();
        String sql = "select * from student where sno = ?";
       List<Student> studentList = executeQuery(sql,Student.class,sno);
       if (null != studentList && !studentList.isEmpty()){
           Student student = studentList.get(0);
           CourseDao courseDao = new CourseDaoImpl();
           List<Course> courseList = courseDao.findCourseBySno(sno);
           if (null != courseList && !courseList.isEmpty()){
               student.setListInfo(courseList);
           }
           return student;
       }
        return null;
    }
}
