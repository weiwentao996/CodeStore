package com.train.day19.homework;
/**
 * 2.根据昨天练习的表，完成名称或其他字段模糊查找
 *
 * ​                  方法名，如：findByUserNameLike(String userName)
 *
 * 3.根据昨天练习的表，完成根据某个字段进行排序（降序）的操作
 *
 * ​                 方法名，如：findOrderByUserName()
 *
 * 4.根据昨天练习的表，完成根据某个字段模糊查找并排序（升序），然后分页获取第二页数据的操作（每页显示2条）
 *
 * ​                方法名，如：findByUserNameLikeOrderLimit(String userName，int currPage, int pageSize)
 *
 * userName:用户名
 *
 * currPage:当前页
 *
 * pageSize:每页显示的数量
 */


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HeroFind implements HeroFindable{

    public static void main(String[] args) {
        HeroFind hf = new HeroFind();
        System.out.println(hf.findOrderByUserName().toString());
        System.out.println(hf.findByUserNameLike("%美%").toString());
        System.out.println(hf.findByUserNameLikeOrderLimit("%美%",2,2));
    }
    /**
     * 根据名字模糊查询
     * @param sname 名字包含字段
     * @return
     */
    @Override
    public  List<Hero> findByUserNameLike(String sname) {
        String sql = "select * from hero where sname like ?";
        return findHero(sql,sname);
    }

    /**
     * 查询列表并且降序排序
     * @return
     */
    @Override
    public List<Hero> findOrderByUserName() {
        String sql = "select * from hero order by sname desc";
        return findHero(sql);
    }
    /**
     *模糊查询并且分页
     * @param sname 英雄名
     * @param currPage 当前页
     * @param pageSize 每页显示的数量
     * @return
     */
    @Override
    public List<Hero> findByUserNameLikeOrderLimit(String sname, int currPage, int pageSize) {
        String sql = "select * from hero where sname like ?  limit ?,?";
        return findHero(sql,sname,pageSize*(currPage-1),pageSize);
    }
    /**
     * 抽象查询方法
     * @param sql
     * @param objs
     * @return
     */
    public List<Hero> findHero(String sql,Object... objs){
        Connection connection = JdbcUtil.getInstance().getConnection();
        List<Hero> heroList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i <= objs.length; i ++ ) {
                preparedStatement.setObject(i, objs[i-1]);
            }
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                Hero hero = new Hero();
                hero.setSno(rs.getString("sno"));
                hero.setSname(rs.getString("sname"));
                hero.setSsex(rs.getString("ssex"));
                hero.setSage(rs.getInt("sage"));
                heroList.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeAll(rs);
            JdbcUtil.getInstance().closeAll(preparedStatement);
            JdbcUtil.getInstance().closeAll(connection);
        }
        return heroList;
    }
}
