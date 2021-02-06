package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.Prescription;
import com.nykj.dataconversion.sys.entity.PrescriptionDrug;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电子处方 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/prescription")
public class PrescriptionSelectController {

	@PostMapping(value = "/select")
	public Prescription select(){
		Prescription doctorCreditInfo = new Prescription();
		doctorCreditInfo = (Prescription) doctorCreditInfo.selectOne(new QueryWrapper<Prescription>().eq("id", 2));
		return doctorCreditInfo;
	}
	
}
