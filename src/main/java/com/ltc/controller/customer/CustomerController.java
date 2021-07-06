package com.ltc.controller.customer;

import com.ltc.bean.Customer;
import com.ltc.bean.Msg;
import com.ltc.constant.Constants;
import com.ltc.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    /**
     * 用户登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public Msg login(@RequestParam String name, @RequestParam String password, HttpSession session){
        //验证用户密码是否正确
        List<Customer> customer = customerService.login(name, password);
        if(!customer.isEmpty()){
            customer.get(0).getCustomerDate();
            session.setAttribute(Constants.Customer_SESSION, customer.get(0));

            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    /**
     * 用户登出
     */
    @RequestMapping("/loginOut")
    @ResponseBody
    public void loginOut(HttpSession session){

        session.removeAttribute(Constants.Customer_SESSION);

    }

    /**
     * 用户注册
     */
    @RequestMapping("/register")
    @ResponseBody
    public Msg register(Customer customer, HttpSession session){

        customerService.saveCustomer(customer);
        session.setAttribute(Constants.Customer_SESSION, customer);

        return Msg.success();
    }

    /**
     * 根据id查询更改患者记录
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/updateCustomer",method = RequestMethod.GET)
    public Msg updateMeet(@Valid Customer customer, HttpSession session){

        //获取id
        Customer customerInfo =  (Customer)session.getAttribute(Constants.Customer_SESSION);

        customer.setId(customerInfo.getId());
        customer.setName(customerInfo.getName());
        customer.setSex(customerInfo.getSex());
        customer.setCustomerDate(customerInfo.getCustomerDate());

        customerService.updateCustomer(customer);

        session.setAttribute(Constants.Customer_SESSION, customer);

        return Msg.success();
    }

}
