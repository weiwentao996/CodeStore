package com.hero.mapper;

import com.hero.pojo.Hero;
import com.hero.pojo.HeroExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeroMapper {
    int countByExample(HeroExample example);

    int deleteByExample(HeroExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hero record);

    int insertSelective(Hero record);

    List<Hero> selectAllHero();

    List<Hero> selectByExample(HeroExample example);

    Hero selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByExample(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByPrimaryKeySelective(Hero record);

    int updateByPrimaryKey(Hero record);
}