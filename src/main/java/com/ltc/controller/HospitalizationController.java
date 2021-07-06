package com.ltc.controller;

import com.ltc.bean.Hospitalization;
import com.ltc.bean.Msg;
import com.ltc.service.HospitalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HospitalizationController {

    @Autowired
    HospitalizationService hospitalizationService;


    /**
     * 返回所有的医疗项目信息
     */
    @ResponseBody
    @RequestMapping("/hospitalization")
    public Msg getHospitalization(){
        //查出的所有部门信息
        List<Hospitalization> list = hospitalizationService.getHospitalizations();
        return Msg.success().add("hospitalization",list);
    }

    /**
     * 根据id查询就诊纪律
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/hospitalization/{id}", method = RequestMethod.GET)
    public Msg getHospitalization(@PathVariable("id")Integer id){

        Hospitalization hospitalization = hospitalizationService.getHospitalization(id);

        return Msg.success().add("hospitalization", hospitalization);
    }

}
