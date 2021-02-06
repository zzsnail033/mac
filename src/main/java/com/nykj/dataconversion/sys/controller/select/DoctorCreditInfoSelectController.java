package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.response.BodyMsg;
import com.nykj.dataconversion.sys.entity.DoctorCreditInfo;
import com.nykj.dataconversion.util.JsonUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 互联网医师诚信档案信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/doctor-credit-info")
public class DoctorCreditInfoSelectController {

	@PostMapping(value = "select")
	public DoctorCreditInfo select(){
		DoctorCreditInfo doctorCreditInfo = new DoctorCreditInfo();
		doctorCreditInfo = (DoctorCreditInfo) doctorCreditInfo.selectOne(new QueryWrapper<DoctorCreditInfo>().eq("id", 1));
		return doctorCreditInfo;
	}
}
