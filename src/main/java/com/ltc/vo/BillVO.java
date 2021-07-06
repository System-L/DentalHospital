package com.ltc.vo;

import com.ltc.bean.Doctor;
import com.ltc.bean.Hospitalization;
import com.ltc.bean.Medicine;

import java.util.Date;
import java.util.List;

public class BillVO {

    private int meetId;

    private Long id;

    private String customerName;

    private Integer doctorId;

    private String medicine;

    private String hospitalization;

    private Double cost;

    private String remark;

    private Date date;

    private Doctor doctor;

    private List<MedicineVO> medicineList;

    private List<HospitalizationVO> hospitalizationList;

    public int getMeetId() {
        return meetId;
    }

    public void setMeetId(int meetId) {
        this.meetId = meetId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getHospitalization() {
        return hospitalization;
    }

    public void setHospitalization(String hospitalization) {
        this.hospitalization = hospitalization;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<MedicineVO> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<MedicineVO> medicineList) {
        this.medicineList = medicineList;
    }

    public List<HospitalizationVO> getHospitalizationList() {
        return hospitalizationList;
    }

    public void setHospitalizationList(List<HospitalizationVO> hospitalizationList) {
        this.hospitalizationList = hospitalizationList;
    }
}
