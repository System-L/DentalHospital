package com.ltc.bean;

import java.sql.Date;

public class Customer {
    private Integer id;

    private String name;

    private String password;

    private String sex;

    private Integer age;

    private String allergyMedicine;

    private Date customerDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAllergyMedicine() {
        return allergyMedicine;
    }

    public void setAllergyMedicine(String allergyMedicine) {
        this.allergyMedicine = allergyMedicine == null ? null : allergyMedicine.trim();
    }

    public Date getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(Date customerDate) {
        this.customerDate = customerDate;
    }

}