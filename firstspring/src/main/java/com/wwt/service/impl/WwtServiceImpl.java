package com.wwt.service.impl;

import com.wwt.service.WwtService;

import java.util.Date;

public class WwtServiceImpl implements WwtService {
    private String name;
    private Integer age;
    private Date birthday;
    public WwtServiceImpl(String name,Integer age,Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        System.out.println("Service层创建成功");
    }

    public void fun() {
        System.out.println("Service层方法执行");
        System.out.println(name);
        System.out.println(age);
        System.out.println(birthday);
    }
}
