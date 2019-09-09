package com.wwt.ui;

import com.wwt.dao.IWwt;
import com.wwt.service.WwtService;
import com.wwt.service.impl.WwtServiceImpl;
import com.wwt.service.impl.WwtServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            Connection conn2 = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lol", "root", "123456");

            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/lol", "root", "123456");
            System.out.println(conn);
            System.out.println(conn2);
            conn.close();
            conn2.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
