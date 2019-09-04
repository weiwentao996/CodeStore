package com.hero.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hero.mapper.HeroMapper;
import com.hero.pojo.Hero;
import com.hero.pojo.HeroExample;
import com.hero.service.HeroService;
import com.hero.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 关于英雄的业务逻辑处理，主要完成dao层的调用
 */
public class HeroServiceImpl implements HeroService {
    @Override
    public List<Hero> findAllHero() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            List<Hero> heroList = heroMapper.selectByExample(null);
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
        int i = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            i = heroMapper.insert(hero);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
        return i;
    }

    @Override
    public Hero findHeroByUKName(String ukName) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            List<Hero>  hero = null;
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            HeroExample heroSkinExample = new HeroExample();
            HeroExample.Criteria criteria = heroSkinExample.createCriteria();
            criteria.andUkNameLike(ukName);
            hero = heroMapper.selectByExample(heroSkinExample);
            return hero.get(0);
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
