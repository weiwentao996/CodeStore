package com.hero.mapper;


import com.hero.pojo.HeroType;
import com.hero.pojo.HeroTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeroTypeMapper {
    int countByExample(HeroTypeExample example);

    int deleteByExample(HeroTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HeroType record);

    int insertSelective(HeroType record);

    List<HeroType> selectByExample(HeroTypeExample example);

    String findTypeById(Long id);

    HeroType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HeroType record, @Param("example") HeroTypeExample example);

    int updateByExample(@Param("record") HeroType record, @Param("example") HeroTypeExample example);

    int updateByPrimaryKeySelective(HeroType record);

    int updateByPrimaryKey(HeroType record);
}