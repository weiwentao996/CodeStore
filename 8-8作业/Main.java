package com.train.day21mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final boolean IS_OUTPUT_LOGGER = false;

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
//            List<Role> roleList = roleMapper.findAllRole();
//            if (null != roleList){
//                roleList.forEach(System.out::println);
//            }
            //Role role = roleMapper.findRoleById(2);
      /*      Role role1 = new Role();
            role1.setRoleName("榜一大哥");
            role1.setNote("连夜跑路");*/
/*            role1.setId(5);
            int count = roleMapper.updateRole(role1);*/
           //int count =  roleMapper.insertRole(role1);
            int count = roleMapper.deleteRoleById(6);
            sqlSession.commit();
            System.out.println("删除的条数" + count);
        } catch (Exception e) {

        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }


    }

}
