package com.ltc.controller.doctor;

import com.ltc.bean.Doctor;
import com.ltc.bean.Msg;
import com.ltc.constant.Constants;
import com.ltc.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    /**
     * 医生登录
     */
    @RequestMapping("/doctorLogin")
    @ResponseBody
    public Msg login(@RequestParam String name, @RequestParam String password, HttpSession session){
        //验证用户密码是否正确
        List<Doctor> doctor = doctorService.login(name, password);
        if(!doctor.isEmpty()){
            doctor.get(0).getDoctorDate();
            session.setAttribute(Constants.Doctor_SESSION, doctor.get(0));

            return Msg.success().add("duty",doctor.get(0).getDuty());
        }else{
            return Msg.fail();
        }
    }


    /**
     * 返回所有的医生信息
     */
    @RequestMapping("/doctors")
    @ResponseBody
    public Msg getDoctor(){
        //查出的所有部门信息
        List<Doctor> list = doctorService.getDoctors();
        return Msg.success().add("doctors",list);
    }
}
