package com.wwt.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 简单的测试框架
 * 当主方法发执行后，会自动执行被检测的方法，判断方法是否有异常
 */
public class CheckTest {
    public static void main(String[] args) throws IOException {
        MeathTest m = new MeathTest();
        int num = 0;
        Class clz = m.getClass();
        Method[] methods = clz.getMethods();
        BufferedWriter bw = new BufferedWriter(new FileWriter("BUG.txt"));
        for (Method me : methods) {
            if (me.isAnnotationPresent(Check.class)) {
                try {

                    me.invoke(m);
                } catch (Exception e) {
                    num++;
                    bw.write(me.getName() + "方法发生了异常");
                    bw.newLine();
                    bw.write("异常名称：" +  e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现" + num + "次异常");
        bw.flush();
        bw.close();



    }

}
