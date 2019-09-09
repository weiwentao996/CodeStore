package com.elife.mapper;

import com.elife.pojo.Bookinfo;
import com.elife.pojo.BookinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookinfoMapper {
    int countByExample(BookinfoExample example);

    int deleteByExample(BookinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bookinfo record);

    int insertSelective(Bookinfo record);

    List<Bookinfo> selectByExampleWithBLOBs(BookinfoExample example);

    List<Bookinfo> selectByExample(BookinfoExample example);

    Bookinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

    int updateByExample(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

    int updateByPrimaryKeySelective(Bookinfo record);

    int updateByPrimaryKeyWithBLOBs(Bookinfo record);

    int updateByPrimaryKey(Bookinfo record);
}