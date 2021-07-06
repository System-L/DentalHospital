package com.ltc.service;

import com.ltc.bean.Bill;
import com.ltc.bean.BillExample;
import com.ltc.dao.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BillService {

    @Autowired
    BillMapper billMapper;


    /**
     * 新增账单记录
     * @return
     */
    public void saveBill(Bill bill) {

        billMapper.insert(bill);
    }


    /**
    * 查询所有账单记录
    * @return
    */
    public List<Bill> getAll(String customerName) {

        BillExample billExample = new BillExample();

        BillExample.Criteria criteria = billExample.createCriteria(); //构造自定义查询条件

        criteria.andCustomerNameEqualTo(customerName);

        return billMapper.selectByExampleWithDoctor(billExample);

    }

    /**
     * 按条件查询账单记录
     * @return
     */
    public List<Bill> searchBill(String beginTime, String endTime, String customerName) {

        try {
            BillExample billExample = new BillExample();

            BillExample.Criteria criteria = billExample.createCriteria(); //构造自定义查询条件

            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
            Date beginDate = time.parse(beginTime);
            Date endDate = time.parse(endTime);

            criteria.andDateBetween(beginDate, endDate).andCustomerNameEqualTo(customerName);

            return billMapper.selectByExampleWithDoctor(billExample);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据id 查询账单记录
     * @return
     */
    public Bill getBill(long id) {

        return billMapper.selectByPrimaryKeyWithDoctor(id);

    }


}
