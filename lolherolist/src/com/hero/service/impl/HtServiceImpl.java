package com.hero.service.impl;

import com.hero.mapper.HtMapper;
import com.hero.pojo.Ht;
import com.hero.service.HtService;
import com.hero.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HtServiceImpl implements HtService {
    @Override
    public List<Ht> findAllHt() {
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtil.getSqlSession();

            HtMapper heroMapper = sqlSession.getMapper(HtMapper.class);
            List<Ht> htList = heroMapper.selectByExample(null);
            return htList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null != sqlSession){
                sqlSession.close();
            }
        }
        return null;
    }
}
