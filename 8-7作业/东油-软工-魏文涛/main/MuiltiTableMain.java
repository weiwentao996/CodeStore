package com.train.day20.main;

import com.train.day20.dao.StudentDao;
import com.train.day20.dao.StudentDaoImpl;
import com.train.day20.pojo.Student;

public class MuiltiTableMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Student student = studentDao.findByIdStudentCourseInfo("200215122");
        System.out.println(student.toString());

    }

}
