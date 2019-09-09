package com.wwt.cglib;

import com.wwt.proxy.IProducer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个消费者
 */
public class Client {
    public static void main(final String[] args) {
        final Producer producer = new Producer();
        /**
         * 动态代理：
         *      特点：字节码随用随创建，随用随加载
         *      作用：不修改源码的基础上对方法增强
         *      分类：
         *           基于接口的动态代理
         *           基于子类的动态代理
         *       基于接口的动态代理：
         *           涉及的类：Proxy
         *           提供者：JDK官方
         *       如何创建代理对象：
         *           使用Proxy类中的newProxyInstance方法
         *       创建代理对象的要求：
         *           被代理类最少实现一个接口,如果没有则不能够使用
         *       newProxyInstance方法的参数：
         *           ClassLoader:类加载器
         *               他是用于加载代理对象字节码的。和被代理对象使用相同的类加载器。固定写法。
         *           Class[]：字节码数组
         *               他是用于让代理对象和被代理对象又相同方法。固定写法。
         *           InvocationHandler：用于提供增强的代码
         *               他是让我们写入和代理。我们一般都是写一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
         *               此接口的实现类都是谁用谁写。
         *         基于子类的动态代理：
         *             涉及的类：Enhancer
         *             提供者：第三方cglib类库
         *         如何创建代理对象：
         *             使用Enhancer类中的create方法
         *         创建代理对象的要求：
         *             被代理类不能是最终类
         *          create方法的参数：
         *              Class：字节码文件
         *                  他是用于指定被代理对象的字节码
         *              Class[]：字节码数组
         *                  他是用于让代理对象和被代理对象有相同方法。固定写法。
         *              InvocationHandler:用于提供增强的代码
         *                  他是让我们写入和代理。我们一般都是写一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
         *                  此接口的实现类都是谁用谁写。
         *
         *
         *
         *
         */
        Producer proxyProducer = (Producer) Enhancer.create(producer.getClass(), new InvocationHandler() {
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                Object returnV = null;
                Float money = (Float) objects[0];
                if ("saleProduct".equals(method.getName())) {
                    returnV = method.invoke(producer, money * 0.7f);
                }
                return returnV;
            }
        });
        proxyProducer.saleProduct(2000f);
    }

}
