package com.train.day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HeroOperator implements HeroOperatable {

    @Override
    public List<Hero> findAllHero() {
        Connection connection = JdbcUtil.getInstance().getConnection();
        String sql = "select * from hero";
        Statement statement = null;
        ResultSet rs = null;
        List<Hero> heroList = new ArrayList<>();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                Hero hero = new Hero();
                hero.setSno(rs.getString(2));
                hero.setSname(rs.getString(3));
                hero.setSsex(rs.getString(4));
                hero.setSage(5);
                heroList.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.getInstance().closeAll(rs);
            JdbcUtil.getInstance().closeAll(statement);
            JdbcUtil.getInstance().closeAll(connection);
        }
        return heroList;
    }


    @Override
    public int updateHeroById(Hero hero) {
        int changeRows = 0;
        Connection connection = JdbcUtil.getInstance().getConnection();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("update hero set sname = '");
        stringBuffer.append(hero.getSname());
        stringBuffer.append(",','");
        stringBuffer.append(hero.getSsex());
        stringBuffer.append("',sage =");
        stringBuffer.append(hero.getSage());
        stringBuffer.append(" where sno = '");
        stringBuffer.append(hero.getSno());
        stringBuffer.append("'");
        Statement statement = null;
        try {
            statement = connection.createStatement();
            changeRows = statement.executeUpdate(stringBuffer.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeAll(statement);
            JdbcUtil.getInstance().closeAll(connection);
        }
        return changeRows;
    }

    @Override
    public int insertHero(Hero hero) {
        Connection connection = JdbcUtil.getInstance().getConnection();
        Statement statement = null;
        int changeRows = 0;
        try {
            statement = connection.createStatement();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("insert into hero values(null,");
            stringBuffer.append("'");
            stringBuffer.append(hero.getSno());
            stringBuffer.append("','");
            stringBuffer.append(hero.getSname());
            stringBuffer.append("','");
            stringBuffer.append(hero.getSsex());
            stringBuffer.append("',");
            stringBuffer.append(hero.getSage());
            stringBuffer.append(")");
            System.out.println(stringBuffer.toString());
            changeRows = statement.executeUpdate(stringBuffer.toString());
            return changeRows;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.getInstance().closeAll(statement);
            JdbcUtil.getInstance().closeAll(connection);
        }
        return changeRows;
    }

    @Override
    public int deleteHeroById(int id) {
        int changeRows = 0;
        Connection connection = JdbcUtil.getInstance().getConnection();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("delete from hero where id = ");
        stringBuffer.append(id);
        Statement statement = null;
        try {
            statement = connection.createStatement();
            changeRows = statement.executeUpdate(stringBuffer.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeAll(statement);
            JdbcUtil.getInstance().closeAll(connection);
        }
        return changeRows;
    }


}
