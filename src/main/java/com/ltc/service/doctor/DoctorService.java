package com.ltc.service.doctor;

import com.ltc.bean.Doctor;
import com.ltc.bean.DoctorExample;
import com.ltc.dao.doctor.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorMapper doctorMapper;


    /**
     * 登录验证
     */
    public List<Doctor> login(String name, String password){

        DoctorExample customerExample = new DoctorExample();

        DoctorExample.Criteria criteria = customerExample.createCriteria(); //构造自定义查询条件
        criteria.andNameEqualTo(name).andPasswordEqualTo(password);

        //自定义查询条件可能返回多条记录,使用List接收
        return  doctorMapper.selectByExample(customerExample);
    }


    //查询所有医生信息
    public List<Doctor> getDoctors() {

        List<Doctor> doctorList = doctorMapper.selectByExample(null);

        return doctorList;
    }

}
