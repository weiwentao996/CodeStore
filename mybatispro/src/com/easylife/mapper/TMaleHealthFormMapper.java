package com.easylife.mapper;

import com.easylife.pojo.TMaleHealthForm;
import com.easylife.pojo.TMaleHealthFormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMaleHealthFormMapper {
    int countByExample(TMaleHealthFormExample example);

    int deleteByExample(TMaleHealthFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMaleHealthForm record);

    int insertSelective(TMaleHealthForm record);

    List<TMaleHealthForm> selectByExample(TMaleHealthFormExample example);

    TMaleHealthForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMaleHealthForm record, @Param("example") TMaleHealthFormExample example);

    int updateByExample(@Param("record") TMaleHealthForm record, @Param("example") TMaleHealthFormExample example);

    int updateByPrimaryKeySelective(TMaleHealthForm record);

    int updateByPrimaryKey(TMaleHealthForm record);
}