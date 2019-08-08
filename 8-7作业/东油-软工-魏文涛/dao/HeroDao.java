package com.train.day20.dao;

import com.train.day20.pojo.Hero;

import java.util.List;

public interface HeroDao {
    List<Hero> findAll();
    List<Hero> findBySnameLike(String sname);
    Hero findById(int id);
    List<Hero> findHeroByPage(int currPage, int pageSize);
    int insertHero(Hero hero);
    int updateHero(Hero hero);
    int deleteHero(int id);

}
