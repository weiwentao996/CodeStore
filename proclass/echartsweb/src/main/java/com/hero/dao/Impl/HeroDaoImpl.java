package com.hero.dao.Impl;

import com.hero.dao.HeroDao;
import com.hero.mapper.HeroMapper;
import com.hero.pojo.Hero;
import com.hero.pojo.HeroExample;
import com.hero.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HeroDaoImpl implements HeroDao {
    @Override
    public List<Hero> queryAllHero() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            System.out.println(sqlSession+"已经获取到");
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            // .....Example 用于条件设置，没有给Example设置值，表示查询所有
//            List<TEmployee> employeeList = tEmployeeMapper.selectByExample(null);
            //TEmployeeExample tEmployeeExample = new TEmployeeExample();
            HeroExample heroExample = new HeroExample();
            // Criteria设置条件
//            TEmployeeExample.Criteria criteria = tEmployeeExample.createCriteria();
//            criteria.andRealNameLike("%zh%");
//            criteria.andMobileLike("11%");

           /* // 设置分页参数
            PageHelper.startPage(2, 2);
            // 执行查询
//            List<TEmployee> employeeList = tEmployeeMapper.selectByExample(tEmployeeExample);
            // 查询所有
            List<TEmployee> employeeList = tEmployeeMapper.selectByExample(null);
            // PageInfo 包装查询结果
            PageInfo<TEmployee> pageInfo = new PageInfo<>(employeeList);
            // 获取查询的总条数
            System.out.println(pageInfo.getTotal());
            // 查询的当前页数据信息
            List<TEmployee> empList = pageInfo.getList();
            empList.forEach(System.out::println);*/
           List<Hero> heroList = heroMapper.selectAllHero();
           return heroList;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
        return null;
    }

    @Override
    public int insertHero(Hero hero) {
        SqlSession sqlSession = null;
        int i = 0;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            i = heroMapper.insert(hero);
            sqlSession.commit();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
        return 0;
    }
}
