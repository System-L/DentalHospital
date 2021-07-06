package com.ltc.service.customer;

import com.ltc.bean.Customer;
import com.ltc.bean.CustomerExample;
import com.ltc.dao.customer.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    /**
     * 登录验证
     */
    public List<Customer> login(String name, String password){

        CustomerExample customerExample = new CustomerExample();

        CustomerExample.Criteria criteria = customerExample.createCriteria(); //构造自定义查询条件
        criteria.andNameEqualTo(name).andPasswordEqualTo(password);

        //自定义查询条件可能返回多条记录,使用List接收
        return  customerMapper.selectByExample(customerExample);
    }

    /**
     * 注册用户
     */
    public void saveCustomer(Customer customer){

        customer.setCustomerDate(new java.sql.Date(System.currentTimeMillis()));

        customerMapper.insert(customer);

    }

    /**
     * 修改预约信息
     */
    public void updateCustomer(Customer customer) {

        customerMapper.updateByPrimaryKeySelective(customer);

    }

}
