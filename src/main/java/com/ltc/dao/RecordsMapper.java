package com.ltc.dao;

import com.ltc.bean.Records;
import com.ltc.bean.RecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordsMapper {
    long countByExample(RecordsExample example);

    int deleteByExample(RecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Records record);

    int insertSelective(Records record);

    List<Records> selectByExample(RecordsExample example);

    Records selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByExample(@Param("record") Records record, @Param("example") RecordsExample example);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);
    //附带医生信息查询
    List<Records> selectByExampleWithDoctor(RecordsExample example);

    Records selectByPrimaryKeyWithDoctor(Integer id);
}