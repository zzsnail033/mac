package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.SignHospitalBasicInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 合作机构信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/sign-hospital-basic-info")
public class SignHospitalBasicInfoSelectController {

	@PostMapping(value = "/select")
	public SignHospitalBasicInfo select() {
		SignHospitalBasicInfo doctorCreditInfo = new SignHospitalBasicInfo();
		doctorCreditInfo = (SignHospitalBasicInfo) doctorCreditInfo.selectOne(new QueryWrapper<SignHospitalBasicInfo>().eq("id", 1));
		return doctorCreditInfo;
	}
	
}
