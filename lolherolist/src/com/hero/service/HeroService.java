package com.hero.service;

import com.hero.pojo.Hero;
import java.util.List;

/**
 * 业务逻辑层：控制业务逻辑
 */
public interface HeroService {

    /**
     * 查询所有的英雄信息
     * @return
     */
    List<Hero> findAllHero();
    int insertHero(Hero hero);
    Hero findHeroByUKName(String ukName);
}
