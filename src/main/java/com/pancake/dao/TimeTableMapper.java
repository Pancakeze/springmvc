package com.pancake.dao;

import com.pancake.pojo.TimeTable;
import com.pancake.pojo.TimeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeTableMapper {
    int countByExample(TimeTableExample example);

    int deleteByExample(TimeTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TimeTable record);

    int insertSelective(TimeTable record);

    List<TimeTable> selectByExample(TimeTableExample example);

    TimeTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TimeTable record, @Param("example") TimeTableExample example);

    int updateByExample(@Param("record") TimeTable record, @Param("example") TimeTableExample example);

    int updateByPrimaryKeySelective(TimeTable record);

    int updateByPrimaryKey(TimeTable record);
}