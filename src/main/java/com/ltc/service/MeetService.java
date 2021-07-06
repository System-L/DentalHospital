package com.ltc.service;

import com.ltc.bean.Meet;
import com.ltc.bean.MeetExample;
import com.ltc.dao.MeetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MeetService {

    @Autowired
    MeetMapper meetMapper;

    /**
     * 患者 查询所有就诊记录
     * @return
     */
    public List<Meet> getAll(String customerName) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andCustomerNameEqualTo(customerName);

        return meetMapper.selectByExampleWithDoctor(meetExample);

    }

    /**
     * 保存预约信息
     * @param meet
     */
    public void saveMeet(Meet meet) {
        meetMapper.insertSelective(meet);
    }

    /**
     * 按照预约id查询
     * @param id
     * @return
     */
    public Meet getMeet(Integer id) {

        Meet meet = meetMapper.selectByPrimaryKeyWithDoctor(id);

        return meet;
    }

    /**
     * 修改预约信息
     */
    public void updateMeet(Meet meet) {

        meetMapper.updateByPrimaryKeySelective(meet);

    }

    /**
     * 取消预约
     * @param id
     */
    public void deleteMeet(Integer id) {

        meetMapper.deleteByPrimaryKey(id);

    }

    /**
     * 医生 查询所有就诊记录
     * @return
     */
    public List<Meet> getAllDoctor(Integer doctorId) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andDoctorIdEqualTo(doctorId);

        return meetMapper.selectByExampleWithDoctor(meetExample);

    }

    /**
     * 医生 按条件查询就诊记录
     * @return
     */
    public List<Meet> searchMeetsDoctor(String customerName, Integer doctorId) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andCustomerNameEqualTo(customerName).andDoctorIdEqualTo(doctorId);

        return meetMapper.selectByExampleWithDoctor(meetExample);
    }

    /**
     * 医生 查询今日预约信息
     * @return
     */
    public List<Meet> searchMeetsToday(Integer doctorId) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andDoctorIdEqualTo(doctorId).andDateEqualTo(new Date());

        return meetMapper.selectByExampleWithDoctor(meetExample);
    }



    /**
     * 药剂师 查询取药信息
     * @return
     */
    public List<Meet> meetsTakeMedicine(Integer status) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andStatusEqualTo(status);

        return meetMapper.selectByExampleWithDoctor(meetExample);
    }

    /**
     * 药剂师 根据 患者姓名 查询取药信息
     * @return
     */
    public List<Meet> searchMeetsTakeMedicine(Integer status,String customerName) {

        MeetExample meetExample = new MeetExample();

        MeetExample.Criteria criteria = meetExample.createCriteria(); //构造自定义查询条件

        criteria.andStatusEqualTo(status).andCustomerNameEqualTo(customerName);

        return meetMapper.selectByExampleWithDoctor(meetExample);
    }

}
