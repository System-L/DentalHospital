package com.ltc.service;

import com.ltc.bean.Medicine;
import com.ltc.bean.MedicineExample;
import com.ltc.dao.MedicineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    MedicineMapper medicineMapper;

    //查询 所有 药品
    public List<Medicine> getMedicines() {

        List<Medicine> list = medicineMapper.selectByExample(null);

        return list;
    }

    //根据 药品名称 查询药品
    public List<Medicine> searchMedicines(String medicineName) {

        MedicineExample medicineExample = new MedicineExample();

        MedicineExample.Criteria criteria = medicineExample.createCriteria(); //构造自定义查询条件

        criteria.andNameEqualTo(medicineName);

        return medicineMapper.selectByExample(medicineExample);
    }


    //根据 id 查询药品
    public Medicine getMedicine(Integer id) {

        Medicine medicine = medicineMapper.selectByPrimaryKey(id);

        return medicine;
    }

    //保存 药品 信息
    public void saveMedicine(Medicine medicine) {

        medicineMapper.insert(medicine);

    }

    //删除单个 药品 信息
    public void delMedicine(Integer id) {

        medicineMapper.deleteByPrimaryKey(id);

    }

    //删除多个 药品 信息
    public void delBatch(List<Integer> ids) {
        MedicineExample example = new MedicineExample();
        MedicineExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        medicineMapper.deleteByExample(example);

    }
}
