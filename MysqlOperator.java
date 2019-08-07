package com.train.day18;

import java.sql.*;

public class MysqlOperator {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "123456");
            statement = connection.createStatement();
            String sql = "select * from hero";
            rs = statement.executeQuery(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(null != rs){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != statement){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
           if (null != connection){
               try {
                   connection.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }

        }

    }
}
