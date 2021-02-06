package com.nykj.dataconversion.sys.controller;


import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.exception.HospitalException;
import com.nykj.dataconversion.response.BodyMsg;
import com.nykj.dataconversion.sys.dto.ReturnSuccessDto;
import com.nykj.dataconversion.sys.entity.WebCheckupAppointmentInfo;
import com.nykj.dataconversion.util.JsonUtil;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 体检预约信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/sys/web-checkup-appointment-info")
public class WebCheckupAppointmentInfoController {

	@PostMapping(value = "/addWebCheckupAppointmentInfo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "接口调用成功", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5001, message = "参数为空", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5002, message = "参数无效", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5003, message = "参数类型转化异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5004, message = "sql异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5005, message = "请求参数不正确", response = ReturnSuccessDto.class)
	})
	public Map addWebCheckupAppointmentInfo(String params) {
		WebCheckupAppointmentInfo webCheckupAppointmentInfo = null;
		try {
			webCheckupAppointmentInfo = (WebCheckupAppointmentInfo) JsonUtil.jsonToJava(params, WebCheckupAppointmentInfo.class.getName());
		} catch (Exception e) {
			throw new HospitalException(ResultEnum.CAST_IS_VALID);
		}

		try {
			if (webCheckupAppointmentInfo != null) {
				webCheckupAppointmentInfo.insert();
			}
		} catch (Exception e) {
			throw new HospitalException(ResultEnum.SQL_IS_VALID);
		}
		return BodyMsg.getInstance().isSuccess().modelMap;
	}
	
}
