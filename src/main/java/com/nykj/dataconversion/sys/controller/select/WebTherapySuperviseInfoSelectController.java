package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.WebTherapySuperviseInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 在线诊疗（咨询）监管信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/web-therapy-supervise-info")
public class WebTherapySuperviseInfoSelectController {

	@PostMapping(value = "/select")
	public WebTherapySuperviseInfo select() {
		WebTherapySuperviseInfo doctorCreditInfo = new WebTherapySuperviseInfo();
		doctorCreditInfo = (WebTherapySuperviseInfo) doctorCreditInfo.selectOne(new QueryWrapper<WebTherapySuperviseInfo>().eq("id", 2));
		return doctorCreditInfo;
	}
}
