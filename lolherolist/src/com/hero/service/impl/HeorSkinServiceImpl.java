package com.hero.service.impl;

import com.hero.mapper.HeroMapper;
import com.hero.mapper.HeroSkinMapper;
import com.hero.pojo.Hero;
import com.hero.pojo.HeroSkin;
import com.hero.pojo.HeroSkinExample;
import com.hero.service.HeroSkinService;
import com.hero.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HeorSkinServiceImpl implements HeroSkinService {
    @Override
    public List<HeroSkin> findHeroSkisByUkName(String ukName) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();

            HeroSkinMapper heroSkinMapper = sqlSession.getMapper(HeroSkinMapper.class);

            HeroSkinExample heroSkinExample = new HeroSkinExample();

            HeroSkinExample.Criteria criteria = heroSkinExample.createCriteria();
            criteria.andUkNameLike(ukName);
            List<HeroSkin> heroSkinList = heroSkinMapper.selectByExample(heroSkinExample);
            System.out.println(heroSkinList.toString());
            return heroSkinList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
        return null;
    }
}
