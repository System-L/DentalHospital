package com.ltc.dao;

import com.ltc.bean.Meet;
import com.ltc.bean.MeetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetMapper {
    long countByExample(MeetExample example);

    int deleteByExample(MeetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Meet record);

    int insertSelective(Meet record);

    List<Meet> selectByExample(MeetExample example);

    Meet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Meet record, @Param("example") MeetExample example);

    int updateByExample(@Param("record") Meet record, @Param("example") MeetExample example);

    int updateByPrimaryKeySelective(Meet record);

    int updateByPrimaryKey(Meet record);

    //附带医生信息查询
    List<Meet> selectByExampleWithDoctor(MeetExample example);

    Meet selectByPrimaryKeyWithDoctor(Integer id);
}