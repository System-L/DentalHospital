package com.ltc.service;

import com.ltc.bean.Records;
import com.ltc.bean.RecordsExample;
import com.ltc.dao.RecordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

@Service
public class RecordsService {

    @Autowired
    RecordsMapper recordsMapper;

    /**
     * 患者 查询所有就诊记录
     * @return
     */
    public List<Records> getAll(String customerName) {

        RecordsExample recordsExample = new RecordsExample();

        RecordsExample.Criteria criteria = recordsExample.createCriteria(); //构造自定义查询条件

        criteria.andCustomerNameEqualTo(customerName);

        return recordsMapper.selectByExampleWithDoctor(recordsExample);

    }

    /**
     * 按照就诊记录id查询
     * @param id
     * @return
     */
    public Records getRecord(Integer id) {

        Records record = recordsMapper.selectByPrimaryKeyWithDoctor(id);

        return record;
    }

    /**
     * 患者 按条件查询就诊记录
     * @return
     */
    public List<Records> searchRecords(String beginTime, String endTime, String customerName) {

        RecordsExample recordsExample = new RecordsExample();

        RecordsExample.Criteria criteria = recordsExample.createCriteria(); //构造自定义查询条件

        criteria.andDateBetween(java.sql.Date.valueOf(beginTime), java.sql.Date.valueOf(endTime)).andCustomerNameEqualTo(customerName);

        return recordsMapper.selectByExampleWithDoctor(recordsExample);
    }


    /**
     * 医生 查询所有就诊记录
     * @return
     */
    public List<Records> getAllDoctor(Integer doctorId) {

        RecordsExample recordsExample = new RecordsExample();

        RecordsExample.Criteria criteria = recordsExample.createCriteria(); //构造自定义查询条件

        criteria.andDoctorIdEqualTo(doctorId);

        return recordsMapper.selectByExampleWithDoctor(recordsExample);

    }

    /**
     * 医生 按条件查询就诊记录
     * @return
     */
    public List<Records> searchRecordsDoctor(String customerName, Integer doctorId) {

        RecordsExample recordsExample = new RecordsExample();

        RecordsExample.Criteria criteria = recordsExample.createCriteria(); //构造自定义查询条件

        criteria.andCustomerNameEqualTo(customerName).andDoctorIdEqualTo(doctorId);

        return recordsMapper.selectByExampleWithDoctor(recordsExample);
    }

    /**
     * 医生 添加就诊记录
     * @return
     */
    public void saveRecords(Records records) {

        recordsMapper.insert(records);
    }
}
