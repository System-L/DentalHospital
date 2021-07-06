package com.ltc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltc.bean.*;
import com.ltc.constant.Constants;
import com.ltc.service.BillService;
import com.ltc.service.MeetService;
import com.ltc.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class MeetController {

    @Autowired
    MeetService meetService;

    @Autowired
    BillService billService;

    @Autowired
    RecordsService recordsService;

    /**
     * 患者 显示就诊记录。
     * @param pn
     * @return
     */
    @RequestMapping("/meets")
    @ResponseBody
    public Msg getMeets(@RequestParam(value="pn",defaultValue = "1")Integer pn, HttpSession session) {

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Customer customer = (Customer) session.getAttribute(Constants.Customer_SESSION);
        List<Meet> records = meetService.getAll(customer.getName());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 预约保存
     * 1.支持JSR303校验
     * 2.导入Hibernate-Validator
     * @return
     */
    @RequestMapping(value="/saveMeet",method= RequestMethod.POST)
    @ResponseBody
    public Msg saveMeet(@Valid Meet meet){
            meet.setStatus(0);

            meetService.saveMeet(meet);

            return Msg.success();
    }

    /**
     * 根据id查询预约记录
     * @param id
     * @return
     */
    @RequestMapping(value="/meet/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getMeet(@PathVariable("id")Integer id){

        Meet meet = meetService.getMeet(id);

        return Msg.success().add("meet", meet);
    }

    /**
     * 根据id查询更改预约记录
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateMeet/{id}",method = RequestMethod.GET)
    public Msg updateMeet(@Valid Meet meet){

        meetService.updateMeet(meet);

        return Msg.success();
    }


    /**
     * 单个批量二合一
     * 批量删除:1-2-3
     * 单个删除:1
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/deleteMeet/{id}",method = RequestMethod.GET)
    public Msg deleteMeet(@PathVariable("id")String id){

        meetService.deleteMeet(Integer.parseInt(id));

        return Msg.success();
    }

    /**
     * 医生 显示就诊记录。
     * @param pn
     * @return
     */
    @RequestMapping("/meetsDoctor")
    @ResponseBody
    public Msg getAllDoctor(@RequestParam(value="pn",defaultValue = "1")Integer pn, HttpSession session) {

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);
        List<Meet> meets = meetService.getAllDoctor(doctor.getId());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(meets, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 根据患者姓名查询预约记录
     * @param pn
     * @param customerName
     * @return
     */
    @RequestMapping(value="/meetsDoctor/search", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchMeetsDoctor(@RequestParam("pn")Integer pn, @RequestParam("customerName")String customerName, HttpSession session){

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);
        List<Meet> records = meetService.searchMeetsDoctor(customerName, doctor.getId());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 查询今日预约记录
     * @param pn
     * @return
     */
    @RequestMapping(value="/meetsDoctor/today", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchMeetsToday(@RequestParam("pn")Integer pn, HttpSession session){

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);
        List<Meet> records = meetService.searchMeetsToday(doctor.getId());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 修改状态
     * @param id
     * @return
     */
    @RequestMapping(value="/meetsDoctor/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg editMeet(@PathVariable("id")Integer id){

        //找到此预约
        Meet meet = meetService.getMeet(id);

        meet.setStatus(meet.getStatus() + 1);
        //更新次meet
        meetService.updateMeet(meet);

        return Msg.success();
    }

    /**
     * 保存就诊记录
     * @return
     */
    @RequestMapping(value="/meetsDoctor/saveMeet", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public Msg saveMeet(@RequestParam("meetId")Integer meetId, @RequestParam("customerName")String customerName, @RequestParam("remark")String remark,
                        @RequestParam("hospitalizationArray")String hospitalizationArray, @RequestParam("medicineArray")String medicineArray,
                        @RequestParam("cost")double cost, HttpSession session){

        Doctor doctor = (Doctor) session.getAttribute(Constants.Doctor_SESSION);

        //1.添加账单信息
        Bill bill = new Bill();

        bill.setId(System.currentTimeMillis());

        bill.setCustomerName(customerName);

        bill.setDoctorId(doctor.getId());
        if(!hospitalizationArray.equals("")){
            bill.setHospitalization(hospitalizationArray.substring(0,hospitalizationArray.length()-1));
        }

        if(!medicineArray.equals("")){
            bill.setMedicine(medicineArray.substring(0,medicineArray.length()-1));
        }

        bill.setCost(cost);

        bill.setRemark(remark);

        bill.setDate(new Date());

        billService.saveBill(bill);
//        //2.添加就诊记录
//        Records records = new Records();
//
//        records.setCustomerName(customerName);
//
//        records.setDoctorId(doctor.getId());
//
//        records.setCost(cost);
//
//        records.setBillId(bill.getId());
//
//        records.setRemark(remark);
//
//        records.setDate(new Date());
//
//        recordsService.saveRecords(records);
        //2.修改预约状态
        Meet meet = meetService.getMeet(meetId);

        meet.setStatus(meet.getStatus() + 1);

        meet.setBillId(bill.getId());

        meetService.updateMeet(meet);


        return Msg.success();
    }


    /**
     * 确认取药
     * @param id
     * @return
     */
    @RequestMapping(value="/takeMedicine/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg takeMedicine(@PathVariable("id")Integer id){

        //1.添加就诊记录
        Meet meet = meetService.getMeet(id);
        Bill bill = billService.getBill(meet.getBillId());
        Records records = new Records();
        records.setCustomerName(meet.getCustomerName());
        records.setDoctorId(meet.getDoctorId());
        records.setCost(bill.getCost());
        records.setBillId(meet.getBillId());
        records.setRemark(bill.getRemark());
        records.setDate(new Date());

        recordsService.saveRecords(records);
        //2.删除预约记录
        meetService.deleteMeet(id);

        return Msg.success();
    }

    /**
     * 取消取药
     * @param id
     * @return
     */
    @RequestMapping(value="/cancelMedicine/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg cancelMedicine(@PathVariable("id")Integer id){

        //1.删除预约记录
        meetService.deleteMeet(id);

        return Msg.success();
    }
}
