//package com.wwt.factory;
//
//import com.wwt.pojo.Account;
//import com.wwt.service.IAccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import utils.TransactionManager;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
////@Component
//public class BeanFactory {
//    @Autowired
//    @Qualifier(value = "defaultServive")
//    private IAccountService accountService;
//
//    @Autowired
//    private TransactionManager txManager;
//
//    public final void setAccountService(IAccountService accountService) {
//        this.accountService = accountService;
//    }
//
//
//
//    @Bean(name = "creatProxy")
//    public  IAccountService getAccountService() {
//        System.out.println("我在执行代理对象的创建");
//       return  (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
//                accountService.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        Object rtValue = null;
//                        try {
//                            txManager.beginTransaction();
//                            rtValue = method.invoke(accountService, args);
//                            txManager.commit();
//                            return rtValue;
//                        } catch (Exception e) {
//                            txManager.rollback();
//                            e.printStackTrace();
//                            throw new RuntimeException(e);
//                        } finally {
//                            txManager.release();
//                        }
//                    }
//                }
//        );
//    }
//}
