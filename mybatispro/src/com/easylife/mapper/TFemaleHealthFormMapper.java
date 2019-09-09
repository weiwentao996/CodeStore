package com.easylife.mapper;

import com.easylife.pojo.TFemaleHealthForm;
import com.easylife.pojo.TFemaleHealthFormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFemaleHealthFormMapper {
    int countByExample(TFemaleHealthFormExample example);

    int deleteByExample(TFemaleHealthFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TFemaleHealthForm record);

    int insertSelective(TFemaleHealthForm record);

    List<TFemaleHealthForm> selectByExample(TFemaleHealthFormExample example);

    TFemaleHealthForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TFemaleHealthForm record, @Param("example") TFemaleHealthFormExample example);

    int updateByExample(@Param("record") TFemaleHealthForm record, @Param("example") TFemaleHealthFormExample example);

    int updateByPrimaryKeySelective(TFemaleHealthForm record);

    int updateByPrimaryKey(TFemaleHealthForm record);
}