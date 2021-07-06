package com.ltc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltc.bean.*;
import com.ltc.constant.Constants;
import com.ltc.service.BillService;
import com.ltc.service.HospitalizationService;
import com.ltc.service.MedicineService;
import com.ltc.vo.BillVO;
import com.ltc.vo.HospitalizationVO;
import com.ltc.vo.MedicineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BillController {

    @Autowired
    BillService billService;

    @Autowired
    MedicineService medicineService;

    @Autowired
    HospitalizationService hospitalizationService;

    /**
     * 患者 查看自己的账单信息
     * @param pn
     * @return
     */
    @RequestMapping("/bill")
    @ResponseBody
    public Msg getBill(@RequestParam(value="pn",defaultValue = "1")Integer pn, HttpSession session) {

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Customer customer = (Customer) session.getAttribute(Constants.Customer_SESSION);
        List<Bill> bill = billService.getAll(customer.getName());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(bill, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 根据 开始时间 结束时间 患者姓名 查询就诊记录
     * @param pn,begin_time,end_time
     * @return
     */
    @RequestMapping(value="/bill/search", method = RequestMethod.GET)
    @ResponseBody
    public Msg searchRecords(@RequestParam("pn")Integer pn, @RequestParam("beginTime") String beginTime, @RequestParam("endTime")String endTime, HttpSession session){

        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        Customer customer = (Customer) session.getAttribute(Constants.Customer_SESSION);
        List<Bill> records = billService.searchBill(beginTime, endTime, customer.getName());
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(records, 5);

        return Msg.success().add("pageInfo", page);
    }


    /**
     * 药剂师 查看账单信息
     * @param id
     * @return
     */
    @RequestMapping(value="/takeMedicineBill/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg takeMedicineBill(@PathVariable("id")Long id){

        Bill bill = billService.getBill(id);

        BillVO billVO = new BillVO();
        List<MedicineVO> medicineList = new ArrayList<MedicineVO>();
        List<HospitalizationVO> hospitalizationList = new ArrayList<HospitalizationVO>();

        //将账单中的 药品 医疗项目 转换
        //1.将药品 按， 分割
        String[] medicineArr = bill.getMedicine().split("\\,");
        for(int i=0; i<medicineArr.length; i++){
            Medicine medicine = medicineService.getMedicine(Integer.valueOf(medicineArr[i]));

            MedicineVO medicineVO = new MedicineVO();

            medicineVO.setName(medicine.getName());
            medicineVO.setNum(1);

            medicineList.add(medicineVO);

            for(int j=0; j<medicineList.size()-1; j++){
                //如果medicineList中已经 有此药 则 此药数量 + 1
                if(medicineList.get(j).getName().equals(medicineVO.getName())){
                    medicineList.get(j).setNum(medicineList.get(j).getNum() + 1);
                    medicineList.remove(medicineVO);
                    break;
                }
            }
        }

        //1.将医疗项目 按， 分割
        String[] hospitalizationArr = bill.getHospitalization().split("\\,");
        for(int i=0; i<hospitalizationArr.length; i++){
            Hospitalization hospitalization = hospitalizationService.getHospitalization(Integer.valueOf(hospitalizationArr[i]));

            HospitalizationVO hospitalizationVO = new HospitalizationVO();

            hospitalizationVO.setName(hospitalization.getName());
            hospitalizationVO.setNum(1);

            hospitalizationList.add(hospitalizationVO);

            for(int j=0; j<hospitalizationList.size()-1; j++){
                //如果hospitalizationList中已经 有此医疗项目 则 此医疗项目数量 + 1
                if(hospitalizationList.get(j).getName().equals(hospitalizationVO.getName())){
                    hospitalizationList.get(j).setNum(hospitalizationList.get(j).getNum() + 1);
                    hospitalizationList.remove(hospitalizationVO);
                    break;
                }
            }

        }
        billVO.setCustomerName(bill.getCustomerName());
        billVO.setDoctor(bill.getDoctor());
        billVO.setCost(bill.getCost());
        billVO.setRemark(bill.getRemark());
        billVO.setDate(bill.getDate());
        billVO.setMedicineList(medicineList);
        billVO.setHospitalizationList(hospitalizationList);

        return Msg.success().add("bill", billVO);
    }

}
