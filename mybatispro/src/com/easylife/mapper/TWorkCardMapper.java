package com.easylife.mapper;

import com.easylife.pojo.TWorkCard;
import com.easylife.pojo.TWorkCardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TWorkCardMapper {
    int countByExample(TWorkCardExample example);

    int deleteByExample(TWorkCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWorkCard record);

    int insertSelective(TWorkCard record);

    List<TWorkCard> selectByExample(TWorkCardExample example);

    TWorkCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWorkCard record, @Param("example") TWorkCardExample example);

    int updateByExample(@Param("record") TWorkCard record, @Param("example") TWorkCardExample example);

    int updateByPrimaryKeySelective(TWorkCard record);

    int updateByPrimaryKey(TWorkCard record);
}