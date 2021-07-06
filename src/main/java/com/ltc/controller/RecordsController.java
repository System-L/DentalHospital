package com.ltc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltc.bean.Customer;
import com.ltc.bean.Doctor;
import com.ltc.bean.Msg;
import com.ltc.bean.Records;
import com.ltc.constant.Constants;
import com.ltc.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecordsController {

    @Autowired
    RecordsService recordsService;

    /**
     * 患者 显示就诊记录。
     * @param pn
     * @return
     */
    @RequestMapping("/records")
    @ResponseBody
    public Msg getRecords(@RequestParam(value="pn",defaultValue = "1")Integer pn, HttpSession session) {

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Customer customer = (Customer) session.getAttribute(Constants.Customer_SESSION);
        List<Records> records = recordsService.getAll(customer.getName());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 根据id查询就诊纪律
     * @param id
     * @return
     */
    @RequestMapping(value="/record/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getRecord(@PathVariable("id")Integer id){

        Records record = recordsService.getRecord(id);

        return Msg.success().add("record", record);
    }

    /**
     * 患者 根据id查询就诊记录
     * @param pn,begin_time,end_time
     * @return
     */
    @RequestMapping(value="/records/search", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchRecords(@RequestParam("pn")Integer pn, @RequestParam("beginTime") String beginTime, @RequestParam("endTime")String endTime, HttpSession session){

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Customer customer = (Customer) session.getAttribute(Constants.Customer_SESSION);
        List<Records> records = recordsService.searchRecords(beginTime, endTime, customer.getName());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }


    /**
     * 医生 显示就诊记录。
     * @param pn
     * @return
     */
    @RequestMapping("/recordsDoctor")
    @ResponseBody
    public Msg getRecordsDoctor(@RequestParam(value="pn",defaultValue = "1")Integer pn, HttpSession session) {

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);
        List<Records> records = recordsService.getAllDoctor(doctor.getId());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 医生 根据id查询就诊记录
     * @param pn,begin_time,end_time
     * @return
     */
    @RequestMapping(value="/recordsDoctor/search", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchRecordsDoctor(@RequestParam("pn")Integer pn, @RequestParam("customerName")String customerName, HttpSession session){

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);
        List<Records> records = recordsService.searchRecordsDoctor(customerName, doctor.getId());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

}
