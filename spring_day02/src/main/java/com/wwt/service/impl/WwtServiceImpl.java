package com.wwt.service.impl;

import com.wwt.dao.IWwt;
import com.wwt.service.WwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.misc.Contended;

import java.util.Date;

@Service("wwt")
public class WwtServiceImpl implements WwtService {
    @Autowired
    IWwt wwtdao;

    public WwtServiceImpl() {

        System.out.println("Service层初始化成功");
    }

    public void fun() {
        System.out.println("Service层方法调用成功");
        wwtdao.fun();

    }
}
