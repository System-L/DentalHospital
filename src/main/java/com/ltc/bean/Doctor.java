package com.ltc.bean;

import java.util.Date;

public class Doctor {
    private Integer id;

    private String name;

    private String password;

    private String duty;

    private String positionalTitle;

    private String clinicTime;

    private Date doctorDate;

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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getPositionalTitle() {
        return positionalTitle;
    }

    public void setPositionalTitle(String positionalTitle) {
        this.positionalTitle = positionalTitle == null ? null : positionalTitle.trim();
    }

    public String getClinicTime() {
        return clinicTime;
    }

    public void setClinicTime(String clinicTime) {
        this.clinicTime = clinicTime == null ? null : clinicTime.trim();
    }

    public Date getDoctorDate() {
        return doctorDate;
    }

    public void setDoctorDate(Date doctorDate) {
        this.doctorDate = doctorDate;
    }

}