package com.train.day19.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 模拟餐厅销售食品事件
 */
public class Cafeteria {
    public static void main(String[] args) {
        //分别出售 1，2，3 号食品 5，15，10份
        sellFood("1", 5);
        sellFood("2", 15);
        sellFood("3", 10);
    }

    /**
     * 出售食品
     *
     * @param fno 出售的食品号
     * @param num 出售的食品数量
     */
    public static void sellFood(String fno, int num) {
        Connection connection = JdbcUtil.getInstance().getConnection();
        PreparedStatement preparedStatement = null;
        try {
            //将销售账单插入道 sellfood表
            connection.setAutoCommit(false);
            String sqlBuy = "insert into sellfood values(null,?,?)";
            preparedStatement = connection.prepareStatement(sqlBuy);
            preparedStatement.setObject(1, fno);
            preparedStatement.setObject(2, num);
            preparedStatement.executeUpdate();
            //更新foodlist表中食品数量
            String sqlSell = "update  foodlist set  fnumber = fnumber - ?  where fno = ?";
            preparedStatement = connection.prepareStatement(sqlSell);
            preparedStatement.setObject(2, fno);
            preparedStatement.setObject(1, num);
            preparedStatement.executeUpdate();
            //提交事务
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭相关链接
            JdbcUtil.getInstance().closeAll(preparedStatement);
            JdbcUtil.getInstance().closeAll(connection);
        }


    }


}
