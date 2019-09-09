package com.wwt.service.impl;

import com.wwt.service.IAccountService;

public class AccountServiceImpl implements IAccountService  {
    public void saveAccount() {
        System.out.println("执行了保存操作！");
    }

    public void updateAccount(int i){
        System.out.println("执行了更新操作，id为" + i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
