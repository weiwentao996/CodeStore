package com.wwt.dao.impl;

import com.wwt.dao.IWwt;
import org.springframework.stereotype.Repository;

@Repository("wwtdao")
public class WwtImpl implements IWwt {
    public void fun() {
        System.out.println("我是魏文涛");
    }
}
