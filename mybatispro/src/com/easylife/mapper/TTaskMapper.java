package com.easylife.mapper;

import com.easylife.pojo.TTask;
import com.easylife.pojo.TTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTaskMapper {
    int countByExample(TTaskExample example);

    int deleteByExample(TTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTask record);

    int insertSelective(TTask record);

    List<TTask> selectByExample(TTaskExample example);

    TTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByExample(@Param("record") TTask record, @Param("example") TTaskExample example);

    int updateByPrimaryKeySelective(TTask record);

    int updateByPrimaryKey(TTask record);
}