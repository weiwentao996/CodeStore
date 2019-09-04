package com.hero.mapper;


import com.hero.pojo.Ht;
import com.hero.pojo.HtExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HtMapper {
    int countByExample(HtExample example);

    int deleteByExample(HtExample example);

    int deleteByPrimaryKey(Long id);




    int insert(Ht record);

    int insertSelective(Ht record);

    List<Ht> selectByExample(HtExample example);

    Ht selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ht record, @Param("example") HtExample example);

    int updateByExample(@Param("record") Ht record, @Param("example") HtExample example);

    int updateByPrimaryKeySelective(Ht record);

    int updateByPrimaryKey(Ht record);
}