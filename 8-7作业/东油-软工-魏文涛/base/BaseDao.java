package com.train.day20.base;

import java.util.List;

/**
 * DAO  Data access object 数据访问对象
 */
public interface BaseDao {
    /**
     * 执行的查询操作
     * @param sql 待执行的sql
     * @param clz 返回的List对象类型
     * @param objects sql的参数
     * @return 查询到的数据集合
     */
    List executeQuery(String sql,Class clz,Object... objects);

    /**
     *
     * @param sql
     * @param clzPath Class.forName("...")类的全路径，返回的对象类的全路径
     * @param objects
     * @return 查询到的数据集合
     */
    List executeQuery(String sql,String clzPath,Object... objects);

    /**
     * 执行的增删改操作
     * @param sql 待执行的sql
     * @param objects sql的参数
     * @return 受影响的行数
     */
    int executeUpdate(String sql,Object... objects);
}
