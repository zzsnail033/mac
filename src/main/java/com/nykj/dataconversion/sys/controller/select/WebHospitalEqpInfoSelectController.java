package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.WebHospitalEqpInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 互联网医院设备信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/web-hospital-eqp-info")
public class WebHospitalEqpInfoSelectController {

	@PostMapping(value = "/select")
	public WebHospitalEqpInfo select() {
		WebHospitalEqpInfo doctorCreditInfo = new WebHospitalEqpInfo();
		doctorCreditInfo = (WebHospitalEqpInfo) doctorCreditInfo.selectOne(new QueryWrapper<WebHospitalEqpInfo>().eq("id", 1));
		return doctorCreditInfo;
	}
}
