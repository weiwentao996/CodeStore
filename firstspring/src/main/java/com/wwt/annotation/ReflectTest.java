package com.wwt.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "com.wwt.annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        Class demo1Class = Class.forName(an.className());
        Object obj= demo1Class.newInstance();
        Method method = demo1Class.getMethod(an.methodName());
        method.invoke(obj);

    }
}
