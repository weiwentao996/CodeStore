package com.hero.service;

import com.hero.pojo.HeroSkin;

import java.util.List;

public interface HeroSkinService {
    List<HeroSkin> findHeroSkisByUkName(String ukName);
}
