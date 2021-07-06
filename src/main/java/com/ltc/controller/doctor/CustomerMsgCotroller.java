package com.ltc.controller.doctor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltc.bean.Customer;
import com.ltc.bean.Msg;
import com.ltc.service.doctor.CustomerMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerMsgCotroller {

    @Autowired
    CustomerMsgService custimeMsgService;

    /**
     * 患者信息查看
     */
    @RequestMapping("/getCustomerMsg")
    @ResponseBody
    public Msg getCustomerMsg(@RequestParam("pn")Integer pn){

        PageHelper.startPage(pn, 5);
        List<Customer> customerMsg = custimeMsgService.getCustomerMsg();
        PageInfo page = new PageInfo(customerMsg, 5);

        return Msg.success().add("pageInfo", page);
    }


    /**
     * 根据患者姓名查询患者信息
     * @param pn
     * @param customerName
     * @return
     */
    @RequestMapping(value="/getCustomerMsg/search", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchCustomerMsg(@RequestParam("pn")Integer pn, @RequestParam("customerName")String customerName){

        PageHelper.startPage(pn, 5);
        List<Customer> customerList = custimeMsgService.searchCustomerMsg(customerName);
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(customerList, 5);

        return Msg.success().add("pageInfo", page);
    }


}
