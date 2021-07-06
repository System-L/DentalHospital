package com.ltc.service.doctor;

import com.ltc.bean.Customer;
import com.ltc.bean.CustomerExample;
import com.ltc.dao.customer.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerMsgService {

    @Autowired
    CustomerMapper customerMapper;

    //查询所有患者信息
    public List<Customer> getCustomerMsg() {

        List<Customer> customerList = customerMapper.selectByExample(null);

        return customerList;
    }


    /**
     * 医生 按条件查询患者信息
     * @return
     */
    public List<Customer> searchCustomerMsg(String customerName) {

        CustomerExample customerExample = new CustomerExample();

        CustomerExample.Criteria criteria = customerExample.createCriteria(); //构造自定义查询条件

        criteria.andNameEqualTo(customerName);

        return customerMapper.selectByExample(customerExample);
    }

}
