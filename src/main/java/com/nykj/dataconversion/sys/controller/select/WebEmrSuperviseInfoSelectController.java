package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.WebEmrSuperviseInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * <p>
 * 电子病历信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/web-emr-supervise-info")
public class WebEmrSuperviseInfoSelectController {

	@PostMapping(value = "/select")
	public WebEmrSuperviseInfo select() {
		WebEmrSuperviseInfo doctorCreditInfo = new WebEmrSuperviseInfo();
		doctorCreditInfo = (WebEmrSuperviseInfo) doctorCreditInfo.selectOne(new QueryWrapper<WebEmrSuperviseInfo>().eq("id", 2));
		return doctorCreditInfo;
	}
	
}
