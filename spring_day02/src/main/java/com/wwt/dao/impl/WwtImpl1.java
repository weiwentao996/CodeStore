package com.wwt.dao.impl;

import com.wwt.dao.IWwt;
import org.springframework.stereotype.Repository;

@Repository("wwtdao1")
public class WwtImpl1 implements IWwt {
    public void fun() {

        System.out.println("我是魏文涛1");
    }
}
