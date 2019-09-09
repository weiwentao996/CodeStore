package com.wwt.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
@Component("logger")
@Aspect
public class Logger {
    @Pointcut("execution(* com.wwt.service.impl.*.*(..))")
    private void prc(){

    }

    /**
     * 用于打印日志：计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    @Before("prc()")
    public void beforePrintLog() {
        System.out.println("Logger类中的beforePrintLog方法开始记录日志了。。。");
    }

    @AfterReturning("prc()")
    public void afterReturningPrintLog() {
        System.out.println("Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }

    @AfterThrowing("prc()")
    public void afterThrowingPrintLog() {
        System.out.println("Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    @After("prc()")
    public void afterPrintLog() {
        System.out.println("Logger类中的afterPrintLog方法开始记录日志了。。。");
    }

  //  @Around("prc()")
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
            throw new RuntimeException();
        } finally {
            System.out.println("最终通知");
        }


    }
}
