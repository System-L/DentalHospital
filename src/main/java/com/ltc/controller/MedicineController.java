package com.ltc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltc.bean.Bill;
import com.ltc.bean.Medicine;
import com.ltc.bean.Meet;
import com.ltc.bean.Msg;
import com.ltc.service.BillService;
import com.ltc.service.MedicineService;
import com.ltc.service.MeetService;
import com.ltc.vo.BillVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @Autowired
    MeetService meetService;

    @Autowired
    BillService billService;

    /**
     * 返回所有的药品信息
     */
    @RequestMapping("/medicineManage")
    @ResponseBody
    public Msg getMedicine(@RequestParam("pn")Integer pn){

        PageHelper.startPage(pn, 5);

        List<Medicine> medicineList = medicineService.getMedicines();

        PageInfo page = new PageInfo(medicineList, 5);

        return Msg.success().add("pageInfo",page);
    }



    /**
     * 根据药品名称查询 药品信息
     */
    @RequestMapping("/medicineManage/search")
    @ResponseBody
    public Msg searchMedicine(@RequestParam("pn")Integer pn, @RequestParam("medicineName")String medicineName){

        PageHelper.startPage(pn, 5);

        List<Medicine> medicineList = medicineService.searchMedicines(medicineName);

        PageInfo page = new PageInfo(medicineList, 5);

        return Msg.success().add("pageInfo",page);
    }




    /**
     * 根据id查询药品
     * @param id
     * @return
     */
    @RequestMapping(value="/medicine/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getHospitalization(@PathVariable("id")Integer id){

        Medicine medicine = medicineService.getMedicine(id);

        return Msg.success().add("medicine", medicine);
    }

    /**
     * 取药信息查看
     */
    @RequestMapping("/takeMedicine")
    @ResponseBody
    public Msg takeMedicine(@RequestParam("pn")Integer pn){

        PageHelper.startPage(pn, 5);

        //从 meet 表中 查出 status 为 取药 项
        List<Meet> meetList = meetService.meetsTakeMedicine(2);

        List<BillVO> billVOList = new ArrayList<BillVO>();

        for(Meet meet : meetList){
            //查询每个账单信息
            Bill bill = billService.getBill(meet.getBillId());

            BillVO billVO = new BillVO();

            billVO.setMeetId(meet.getId());
            billVO.setId(bill.getId());
            billVO.setCustomerName(bill.getCustomerName());
            billVO.setDoctorId(bill.getDoctorId());
            billVO.setDoctor(bill.getDoctor());
            billVO.setDate(bill.getDate());

            billVOList.add(billVO);
        }

        PageInfo page = new PageInfo(billVOList, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 根据患者姓名查询 取药信息
     */
    @RequestMapping("/takeMedicine/search")
    @ResponseBody
    public Msg searchTakeMedicine(@RequestParam("pn")Integer pn, @RequestParam("customerName")String customerName){

        PageHelper.startPage(pn, 5);

        //从 meet 表中 查出 status 为 取药 项
        List<Meet> meetList = meetService.searchMeetsTakeMedicine(2, customerName);

        List<Bill> billList = new ArrayList<Bill>();

        for(Meet meet : meetList){
            //查询每个账单信息
            Bill bill = billService.getBill(meet.getBillId());
            billList.add(bill);
        }

        PageInfo page = new PageInfo(billList, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 药品保存
     * 1.支持JSR303校验
     * 2.导入Hibernate-Validator
     * @return
     */
    @RequestMapping(value="/saveMedicine",method= RequestMethod.POST)
    @ResponseBody
    public  Msg saveEmp(@Valid Medicine medicine){

        medicineService.saveMedicine(medicine);

        return Msg.success();
    }


    /**
     * 单个批量二合一
     * 批量删除:1-2-3
     * 单个删除:1
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/delMedicine/{ids}",method = RequestMethod.DELETE)
    public Msg deleteEmp(@PathVariable("ids")String ids){
        if(ids.contains("-")){                                            //批量删除
            List<Integer> del_ids = new ArrayList<Integer>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for(String string : str_ids){
                del_ids.add(Integer.parseInt(string));
            }
            medicineService.delBatch(del_ids);
        }else{                                                           //单个删除
            Integer id = Integer.parseInt(ids);
            medicineService.delMedicine(id);
        }
        return Msg.success();
    }

}
