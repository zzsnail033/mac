package com.nykj.dataconversion.sys.controller;


import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.exception.HospitalException;
import com.nykj.dataconversion.response.BodyMsg;
import com.nykj.dataconversion.sys.dto.ReturnSuccessDto;
import com.nykj.dataconversion.sys.entity.WebTherapySuperviseInfo;
import com.nykj.dataconversion.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 在线诊疗（咨询）监管信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/sys/web-therapy-supervise-info")
@Api(tags = "WebTherapySuperviseInfoController", description = "在线诊疗咨询信息")
public class WebTherapySuperviseInfoController {

	@PostMapping(value = "/addWebTherapySuperviseInfo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "接口调用成功", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5001, message = "参数为空", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5002, message = "参数无效", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5003, message = "参数类型转化异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5004, message = "sql异常", response = ReturnSuccessDto.class),
			@ApiResponse(code = 5005, message = "请求参数不正确", response = ReturnSuccessDto.class)
	})
	public Map addWebTherapySuperviseInfo(String params) {
		WebTherapySuperviseInfo webTherapySuperviseInfo = null;
		try {
			webTherapySuperviseInfo = (WebTherapySuperviseInfo) JsonUtil.jsonToJava(params, WebTherapySuperviseInfo.class.getName());
		} catch (Exception e) {
			throw new HospitalException(ResultEnum.CAST_IS_VALID);
		}

		try {
			if (webTherapySuperviseInfo != null) {
				webTherapySuperviseInfo.insert();
			}
		} catch (Exception e) {
			throw new HospitalException(ResultEnum.SQL_IS_VALID);
		}
		return BodyMsg.getInstance().isSuccess().modelMap;
	}
	
}
