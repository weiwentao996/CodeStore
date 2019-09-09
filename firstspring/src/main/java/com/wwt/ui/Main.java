package com.wwt.ui;

import com.wwt.service.WwtService;
import com.wwt.service.impl.WwtServiceImpl;
import com.wwt.service.impl.WwtServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        WwtService wwtService = ac.getBean("wwts", WwtService.class);
        WwtService wwtService2 = ac.getBean("wwts2", WwtService.class);
        wwtService.fun();
        wwtService2.fun();
    }
}
