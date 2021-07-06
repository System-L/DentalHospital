package com.ltc.dao;

import com.ltc.bean.Hospitalization;
import com.ltc.bean.HospitalizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalizationMapper {
    long countByExample(HospitalizationExample example);

    int deleteByExample(HospitalizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hospitalization record);

    int insertSelective(Hospitalization record);

    List<Hospitalization> selectByExample(HospitalizationExample example);

    Hospitalization selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hospitalization record, @Param("example") HospitalizationExample example);

    int updateByExample(@Param("record") Hospitalization record, @Param("example") HospitalizationExample example);

    int updateByPrimaryKeySelective(Hospitalization record);

    int updateByPrimaryKey(Hospitalization record);
}