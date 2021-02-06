package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.Prescription;
import com.nykj.dataconversion.sys.entity.PrescriptionDrug;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电子处方药品明细 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/prescriptionDrug-drug")
public class PrescriptionDrugSelectController {

	@PostMapping(value = "/select")
	public PrescriptionDrug select(){
		PrescriptionDrug doctorCreditInfo = new PrescriptionDrug();
		doctorCreditInfo = (PrescriptionDrug) doctorCreditInfo.selectOne(new QueryWrapper<Prescription>().eq("id", 2));
		return doctorCreditInfo;
	}
	
}
