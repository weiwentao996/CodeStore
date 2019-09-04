package com.hero.mapper;


import com.hero.pojo.HeroSkin;
import com.hero.pojo.HeroSkinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeroSkinMapper {
    int countByExample(HeroSkinExample example);

    int deleteByExample(HeroSkinExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HeroSkin record);

    int insertSelective(HeroSkin record);

    List<HeroSkin> selectByExample(HeroSkinExample example);

    HeroSkin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HeroSkin record, @Param("example") HeroSkinExample example);

    int updateByExample(@Param("record") HeroSkin record, @Param("example") HeroSkinExample example);

    int updateByPrimaryKeySelective(HeroSkin record);

    int updateByPrimaryKey(HeroSkin record);
}