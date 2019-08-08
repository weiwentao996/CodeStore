package com.train.day20.main;

import com.train.day20.dao.*;
import com.train.day20.pojo.Course;
import com.train.day20.pojo.Hero;
import com.train.day20.pojo.StuCourseGrade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HeroDao heroDao = new HeroDaoImpl();
        List<Hero> list = heroDao.findAll();
        list.forEach(System.out::println);
        Hero hero = heroDao.findById(1);
        System.out.println(hero);
        CourseDao courseDao = new CourseDaoImpl();
        List<Course> courseList = courseDao.findAll();
        courseList.forEach(System.out::println);
    /*    StuCourseGradeDao stuCourseGradeDao = new StuCourseGradeDaoImpl();
        List<StuCourseGrade> list = stuCourseGradeDao.findAll();
        list.forEach(System.out::println);*/
    }
}
