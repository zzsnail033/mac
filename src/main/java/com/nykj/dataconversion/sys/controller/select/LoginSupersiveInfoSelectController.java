package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.LoginSupersiveInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 登陆监管信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/login-supersive-info")
public class LoginSupersiveInfoSelectController {

	@PostMapping(value = "/select")
	public LoginSupersiveInfo select(){
		LoginSupersiveInfo doctorCreditInfo = new LoginSupersiveInfo();
		doctorCreditInfo = (LoginSupersiveInfo) doctorCreditInfo.selectOne(new QueryWrapper<LoginSupersiveInfo>().eq("id", 2));
		return doctorCreditInfo;
	}
	
}
