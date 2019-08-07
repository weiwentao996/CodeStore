package com.train.Demo;


import java.sql.*;

public class DemoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接 jdbc:mysql://localhost:3306/train?user=root&password=&useUnicode=true&characterEncoding=gbk&autoReconnect=true&failOverReadOnly=false
        //如果想要链接其他人的数据库，只要在同一个局域网内部，将localhost换成其他ip
        //user：用户名
        //password：密码
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "123456");
        //输出链接对象，只要不为null，就表示可以正常获取数据库链接
        System.out.println(connection);

        //获取用于执行sql语句的语句对象（Statement）
        Statement statement = connection.createStatement();
        String sql = "select * from hero";
        //执行查询后会返回结果集对象，resultset，该对象用完后必须要关闭
        ResultSet rs = statement.executeQuery(sql);
       //遍历resultset，获取的数据
        while (rs.next()){//rs.next()每执行一次，就会切换到下一行。
            //依此获取每一行每一列的数据
            //列索引从1开始
            System.out.print(rs.getInt(1) + ",");
            System.out.print(rs.getString(2) + ",");
            System.out.print(rs.getString(3) + ",");
            System.out.print(rs.getString("ssex") + ",");
            System.out.println(rs.getInt(5));
        }
        //后打开 先关闭
        rs.close();
        statement.close();
        connection.close();

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/train","root","123456");
        System.out.println(connection1);
        String sql1 = "select * from student";
        Statement statement1 = connection1.createStatement();
        ResultSet rs1 = statement1.executeQuery(sql1);
        while (rs1.next()){
            System.out.print(rs1.getInt(1) + ",");
            System.out.print(rs1.getString(2) + ",");
            System.out.print(rs1.getString(3) + ",");
            System.out.println(rs1.getString(4) + ",");

        }
        rs1.close();
        statement1.close();
        connection1.close();
    }
}
