package com.hero.dao;

import com.hero.pojo.Hero;

import java.util.List;

public interface HeroDao {
   List<Hero>  queryAllHero();
   int insertHero(Hero hero);
}
