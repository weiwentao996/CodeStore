package com.easylife.mapper;

import com.easylife.pojo.TEmployee;
import com.easylife.pojo.TEmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TEmployeeMapper {
    int countByExample(TEmployeeExample example);

    int deleteByExample(TEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmployee record);

    int insertSelective(TEmployee record);

    List<TEmployee> selectByExample(TEmployeeExample example);

    TEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEmployee record, @Param("example") TEmployeeExample example);

    int updateByExample(@Param("record") TEmployee record, @Param("example") TEmployeeExample example);

    int updateByPrimaryKeySelective(TEmployee record);

    int updateByPrimaryKey(TEmployee record);
}