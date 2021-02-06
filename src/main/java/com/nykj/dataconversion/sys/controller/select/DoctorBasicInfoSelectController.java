package com.nykj.dataconversion.sys.controller.select;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.DoctorBasicInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 执业医师、执业药师信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/doctor-basic-info")
@Slf4j
public class DoctorBasicInfoSelectController {

	@PostMapping(value = "/select")
	public DoctorBasicInfo select() throws Exception{
		DoctorBasicInfo doctorBasicInfo = new DoctorBasicInfo();
		doctorBasicInfo = (DoctorBasicInfo) doctorBasicInfo.selectOne(new QueryWrapper<DoctorBasicInfo>().eq("id", 1));
		String abc = JSON.toJSONString(doctorBasicInfo);
//		System.out.println(abc);
		return doctorBasicInfo;
		/*JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", doctorBasicInfo);
		jsonObject.put("code", 200);
		String abc = JSON.toJSONString(jsonObject);
		System.out.println(AESUtil.encrypt(abc, AESUtil.KEY, AESUtil.IV));*/
	}
}
