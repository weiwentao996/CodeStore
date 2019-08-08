package com.train.day20.base;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 获取链接是从连接池获取，那么再获取链接之前，连接池必须要事先创建
 * 连接池，初始化几次？-》1次
 */
public class JdbcConnectionPoolUtil {
    private JdbcConnectionPoolUtil() {

    }
    private static ComboPooledDataSource comboPooledDataSource = null;
    private static JdbcConnectionPoolUtil jdbcConnectionPoolUtil = null;


    public static JdbcConnectionPoolUtil getInstance() {
        if (null == jdbcConnectionPoolUtil) {
            jdbcConnectionPoolUtil = new JdbcConnectionPoolUtil();
        }
        return jdbcConnectionPoolUtil;
    }

    public static void initDatabaseConnectionPool(){

        Properties properties = new Properties();
        try {
            // 输入流
            InputStream is = new FileInputStream("src/jdbc.properties");
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        comboPooledDataSource = new ComboPooledDataSource();
        try {
            comboPooledDataSource.setDriverClass(properties.getProperty("driverClass"));
            System.out.println(properties.getProperty("driverClass"));
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        comboPooledDataSource.setJdbcUrl(properties.getProperty("url"));
        comboPooledDataSource.setUser(properties.getProperty("username"));
        comboPooledDataSource.setPassword(properties.getProperty("password"));
        comboPooledDataSource.setMinPoolSize(Integer.parseInt(properties.getProperty("c3p0.minPoolSize")));
        comboPooledDataSource.setMaxPoolSize(Integer.parseInt(properties.getProperty("c3p0.maxPoolSize")));
        comboPooledDataSource.setInitialPoolSize(Integer.parseInt(properties.getProperty("c3p0.initPoolSize")));
        comboPooledDataSource.setAcquireIncrement(Integer.parseInt(properties.getProperty("c3p0.acquireIncrement")));

    }

    public Connection getConnection(){
        if(null != comboPooledDataSource){
            try {
                Connection connection = comboPooledDataSource.getConnection();
                System.out.println("获得链接"+connection.toString());
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程池没有获得链接");
        return null;
    }
    public void closeAll(ResultSet rs, Statement statement, Connection connection){
        closeResource(rs);
        closeResource(statement);
        // connection如果是连接池的连接，表示释放这个连接让其回到连接池
        closeResource(connection);
    }

    public void closeResource(AutoCloseable autoCloseable) {
        if (null != autoCloseable) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
