package com.train.day20.base;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDaoImpl implements BaseDao {
    @Override
    public List executeQuery(String sql, Class clz, Object... objects) {
        JdbcConnectionPoolUtil.initDatabaseConnectionPool();
        Connection connection = JdbcConnectionPoolUtil.getInstance().getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            if (null != objects) {
                for (int i = 1; i <= objects.length; i++) {
                    preparedStatement.setObject(i, objects[i - 1]);
                }
            }
            rs = preparedStatement.executeQuery();
            return dealResultSet(rs, clz);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcConnectionPoolUtil.getInstance().closeAll(rs, preparedStatement, connection);
        }

        return null;
    }

    @Override
    public List executeQuery(String sql, String clzPath, Object... objects) {
        Connection connection = JdbcConnectionPoolUtil.getInstance().getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            if (null != objects) {
                for (int i = 1; i <= objects.length; i++) {
                    preparedStatement.setObject(i, objects[i - 1]);
                }
            }
            rs = preparedStatement.executeQuery();
            Class clz = Class.forName(clzPath);
            return dealResultSet(rs, clz);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JdbcConnectionPoolUtil.getInstance().closeAll(rs, preparedStatement, connection);
        }
        return null;
    }

    @Override
    public int executeUpdate(String sql, Object... objects) {
        // 获取连接
        Connection connection = JdbcConnectionPoolUtil.getInstance().getConnection();
        // 声明语句对象
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            if (null != objects) {
                // i遍历从0开始
                for (int i = 0; i < objects.length; i++) {
                    // 参数设置，索引从1开始
                    preparedStatement.setObject(i + 1, objects[i]);
                }
            }
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List dealResultSet(ResultSet resultSet, Class clz) {
        //通过反射创建实例
        try {
            //通过反射获取clz所有的属性，如id，sname，ssex
            Field[] fields = clz.getDeclaredFields();
            //使用set方法设置值
            //metadata ->元数据
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //获取resultSet查询的数据公有多少列
            int columnCount = resultSetMetaData.getColumnCount();
            List list = new ArrayList();
            while (resultSet.next()) {
                //表与实体类映射时，1.类的属性要与列名相同(第一种情况) 2.userOrder属性 对应的数据库列名为user_order(第二种情况)
                Object object = clz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列的值
                    Object columnValue = resultSet.getObject(i + 1);
                    if (null != columnValue) {
                        //获取列的名称
                        String clumnName = resultSetMetaData.getColumnName(i + 1).toLowerCase().replaceAll("_", "");

                        for (int j = 0; j < fields.length; j++) {
                            //获取类的属性名
                            String name = fields[j].getName();
                            if (name.toLowerCase().equals(clumnName)) {
                                //列名与属性名相同，调用set方法将列值设置到对应的属性中
                                //根据名称获取其set方法
                                PropertyDescriptor pd = new PropertyDescriptor(name, clz);
                                //获得写方法-》即set方法，pd.getReadMethod
                                Method wM = pd.getWriteMethod();
                                //调用set方法设置值
                                //因为set方法中，参数的类型是确定的不是object，如setName参数
                                //参数为String类型，如果使用Object类型传递进去，会报参数不匹配异常，所以此处要
                                //对数据类型进行对应的转换
                                //获取属性类型->获取类型名称，如String，Integer
                                String typeName = fields[j].getType().getSimpleName();
                                if (typeName.equals("Integer")) {
                                    //隐含问题：1 如果数据库中声明为 int unsigned ->
                                    //columnValue通过java获取后是Long类型的
                                    //不带unsigned，是Integer类型
                                    if (columnValue.getClass().getSimpleName().equals("Long")) {
                                        wM.invoke(object, ((Long) columnValue).intValue());
                                    } else {
                                        wM.invoke(object, (Integer) columnValue);
                                    }

                                } else if (typeName.equals("String")) {
                                    //如果数据库中是varchar类型，但是保存的是数值，获取到
                                    //之后是Interger类型
                                    //所以这个地方使用toString进行转换，不管是什么类型，都会变成字符串
                                    wM.invoke(object, columnValue.toString());
                                } else if (typeName.equals("Date")) {
                                }
                                break;
                            }
                        }
                    }
                }
                list.add(object);
            }
            return list;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
