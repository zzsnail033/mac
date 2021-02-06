package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.WebHospitalBasicInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 互联网医疗机构信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/web-hospital-basic-info")
public class WebHospitalBasicInfoSelectController {

	@PostMapping(value = "/select")
	public WebHospitalBasicInfo select() {
		WebHospitalBasicInfo doctorCreditInfo = new WebHospitalBasicInfo();
		doctorCreditInfo = (WebHospitalBasicInfo) doctorCreditInfo.selectOne(new QueryWrapper<WebHospitalBasicInfo>().eq("id", 2));
		return doctorCreditInfo;
	}
	
}
