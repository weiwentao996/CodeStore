package com.easylife.main;

import com.easylife.mapper.TEmployeeMapper;
import com.easylife.mapper.TEmployeeTaskMapper;
import com.easylife.pojo.TEmployee;
import com.easylife.pojo.TEmployeeExample;
import com.easylife.util.SqlSessionFactoryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class main {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            TEmployeeMapper tEmployeeMapper = sqlSession.getMapper(TEmployeeMapper.class);


            // .....Example 用于条件设置，没有给Example设置值，表示查询所有
//            List<TEmployee> employeeList = tEmployeeMapper.selectByExample(null);
            TEmployeeExample tEmployeeExample = new TEmployeeExample();
            // Criteria设置条件
//            TEmployeeExample.Criteria criteria = tEmployeeExample.createCriteria();
//            criteria.andRealNameLike("%zh%");
//            criteria.andMobileLike("11%");

            // 设置分页参数
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
            empList.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
    }
}
