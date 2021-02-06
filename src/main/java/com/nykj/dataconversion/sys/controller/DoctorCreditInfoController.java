package com.nykj.dataconversion.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.response.BodyMsg;
import com.nykj.dataconversion.sys.dto.ReturnSuccessDto;
import com.nykj.dataconversion.sys.entity.DoctorCreditInfo;
import com.nykj.dataconversion.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/api/sys/doctor-credit-info")
@Api(tags = "DoctorCreditInfoController", description = "医师药师诚信档案")
public class DoctorCreditInfoController {

	@PostMapping(value = "/addDoctorCreditInfo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "接口调用成功", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5001, message = "参数为空", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5002, message = "参数无效", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5003, message = "参数类型转化异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5004, message = "sql异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5005, message = "请求参数不正确", response = ReturnSuccessDto.class)
	})
	public Map addDoctorCreditInfo(String params) {
		DoctorCreditInfo doctorCreditInfo = null;
		try {
			doctorCreditInfo = (DoctorCreditInfo) JsonUtil.jsonToJava(params, DoctorCreditInfo.class.getName());
		} catch (Exception e) {
			e.printStackTrace();
			return BodyMsg.getInstance().isFail(ResultEnum.CAST_IS_VALID).modelMap;
		}

		try {
			if (doctorCreditInfo != null) {
				doctorCreditInfo.insert();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return BodyMsg.getInstance().isFail(ResultEnum.SQL_IS_VALID).modelMap;
		}
		return BodyMsg.getInstance().isSuccess().modelMap;
	}



	/*@PostMapping(value = "select")
	public DoctorCreditInfo select(){
		DoctorCreditInfo doctorCreditInfo = new DoctorCreditInfo();
		doctorCreditInfo = (DoctorCreditInfo) doctorCreditInfo.selectOne(new QueryWrapper<DoctorCreditInfo>().eq("id", 1));
		return doctorCreditInfo;
	}*/
}
