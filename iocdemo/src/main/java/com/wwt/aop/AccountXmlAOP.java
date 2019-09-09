package com.wwt.aop;

import com.wwt.service.IAccountService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utils.TransactionManager;

public class AccountXmlAOP {

    @Autowired
    private TransactionManager txManager;
    @Autowired
    private IAccountService accountService;

    public final void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
    public Object  aroundPrintLog(ProceedingJoinPoint joinPoint){
        Object retValue = null;
        Object[] args = joinPoint.getArgs();
        try {
            txManager.beginTransaction();
            joinPoint.proceed(args);
            txManager.commit();
            return retValue;

        } catch (Throwable throwable) {
            txManager.rollback();
            throwable.printStackTrace();
            throw new RuntimeException();
        }finally {
            txManager.release();
        }
    }
}
