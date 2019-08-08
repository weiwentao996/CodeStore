package com.train.day19.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    private  static final JdbcUtil JDBC_UTIL= new JdbcUtil();
    private JdbcUtil(){

    }
    public static JdbcUtil getInstance(){
        return  JDBC_UTIL;
    }

    /**
     * 创建链接
     * @return 返回新建链接对象
     */
    public Connection getConnection() {
        Properties pro = new Properties();
        Connection connection = null;
        try {
            //读取配置文件信息
            FileInputStream fis = new FileInputStream("src/jdbc.properties");
            pro.load(fis);
            fis.close();
            String driverClass = pro.getProperty("driverClass");
            String url = pro.getProperty("url");
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");
            //创建链接
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url,username,password);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭链接公共方法
     * @param autoCloseable
     */
    public void closeAll(AutoCloseable autoCloseable){
        if(null != autoCloseable){
            try {
                autoCloseable.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

