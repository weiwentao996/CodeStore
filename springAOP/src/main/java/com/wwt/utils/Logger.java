package com.wwt.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
public class Logger {
    /**
     * 用于打印日志：计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void beforePrintLog() {
        System.out.println("Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    public void afterReturningPrintLog() {
        System.out.println("Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }

    public void afterThrowingPrintLog() {
        System.out.println("Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    public void afterPrintLog() {
        System.out.println("Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

    public Object aroundPrintLog(ProceedingJoinPoint joinPoint) {
        Object retValue = null;
        Object[] args = joinPoint.getArgs();//获得方法执行所需的参数
        try {
            System.out.println("前置通知");
            retValue = joinPoint.proceed(args);
            System.out.println("后置通知");
            return retValue;
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
            throw  new RuntimeException();
        }finally {
            System.out.println("最终通知");
        }


    }
}
