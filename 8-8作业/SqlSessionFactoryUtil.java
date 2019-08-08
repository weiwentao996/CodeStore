package com.train.day21mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {

    private static final Class<SqlSessionFactory> LOCK = SqlSessionFactory.class;
    /**
     * SqlSession工厂类变量，只需要有一个就行了
     */
    static SqlSessionFactory sqlSessionFactory = null;

    public static void initFactory() {

        if (null == sqlSessionFactory) {
            createFactory();
        }
    }

    public static void createFactory() {
        synchronized (LOCK) {
            if (null != sqlSessionFactory) {
                return;
            }
            String path = "mybatis-config.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(path);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    //SqlSessionFactory -> SqlSession -> 相当于数据库中的Connection
    public static SqlSession getSqlSession() {
        initFactory();
        return sqlSessionFactory.openSession();
    }

}
