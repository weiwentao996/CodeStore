package com.easylife.mapper;

import com.easylife.pojo.TEmployeeTask;
import com.easylife.pojo.TEmployeeTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TEmployeeTaskMapper {
    int countByExample(TEmployeeTaskExample example);

    int deleteByExample(TEmployeeTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmployeeTask record);

    int insertSelective(TEmployeeTask record);

    List<TEmployeeTask> selectByExample(TEmployeeTaskExample example);

    TEmployeeTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEmployeeTask record, @Param("example") TEmployeeTaskExample example);

    int updateByExample(@Param("record") TEmployeeTask record, @Param("example") TEmployeeTaskExample example);

    int updateByPrimaryKeySelective(TEmployeeTask record);

    int updateByPrimaryKey(TEmployeeTask record);
}