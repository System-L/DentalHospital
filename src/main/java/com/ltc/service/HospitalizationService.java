package com.ltc.service;

import com.ltc.bean.Hospitalization;
import com.ltc.dao.HospitalizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalizationService {

    @Autowired
    HospitalizationMapper hospitalizationMapper;

    //查询所有医疗项目
    public List<Hospitalization> getHospitalizations() {

        List<Hospitalization> list = hospitalizationMapper.selectByExample(null);

        return list;
    }


    //根据 id 查询医疗项目
    public Hospitalization getHospitalization(Integer id) {

        Hospitalization hospitalization = hospitalizationMapper.selectByPrimaryKey(id);

        return hospitalization;
    }

}
