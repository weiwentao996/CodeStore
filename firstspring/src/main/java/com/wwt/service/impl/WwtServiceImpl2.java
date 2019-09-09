package com.wwt.service.impl;

import com.wwt.service.WwtService;

import java.util.Date;

public class WwtServiceImpl2 implements WwtService {
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void fun() {
        System.out.println("Service层方法执行");
        System.out.println(name);
        System.out.println(age);
        System.out.println(birthday);
    }
}
