package com.ltc.bean;

import java.util.Date;

public class CRM_report_goodsDataKey {
    private String customerId;

    private String customerOrderType;

    private Date goodsDay;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerOrderType() {
        return customerOrderType;
    }

    public void setCustomerOrderType(String customerOrderType) {
        this.customerOrderType = customerOrderType == null ? null : customerOrderType.trim();
    }

    public Date getGoodsDay() {
        return goodsDay;
    }

    public void setGoodsDay(Date goodsDay) {
        this.goodsDay = goodsDay;
    }
}