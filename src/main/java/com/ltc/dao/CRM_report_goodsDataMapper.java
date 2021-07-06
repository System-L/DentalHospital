package com.ltc.dao;

import com.ltc.bean.CRM_report_goodsData;
import com.ltc.bean.CRM_report_goodsDataExample;
import com.ltc.bean.CRM_report_goodsDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CRM_report_goodsDataMapper {
    long countByExample(CRM_report_goodsDataExample example);

    int deleteByExample(CRM_report_goodsDataExample example);

    int deleteByPrimaryKey(CRM_report_goodsDataKey key);

    int insert(CRM_report_goodsData record);

    int insertSelective(CRM_report_goodsData record);

    List<CRM_report_goodsData> selectByExample(CRM_report_goodsDataExample example);

    CRM_report_goodsData selectByPrimaryKey(CRM_report_goodsDataKey key);

    int updateByExampleSelective(@Param("record") CRM_report_goodsData record, @Param("example") CRM_report_goodsDataExample example);

    int updateByExample(@Param("record") CRM_report_goodsData record, @Param("example") CRM_report_goodsDataExample example);

    int updateByPrimaryKeySelective(CRM_report_goodsData record);

    int updateByPrimaryKey(CRM_report_goodsData record);
}