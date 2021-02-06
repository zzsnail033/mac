package com.nykj.dataconversion.response;


import com.nykj.dataconversion.codeEnum.ResultEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息处理类
 */
public class BodyMsg {

	public Map<String, Object> modelMap = new HashMap<>();

	public static BodyMsg getInstance() {
		return new BodyMsg();
	}

	public BodyMsg isSuccess() {
		this.modelMap.put("success", true);
		this.modelMap.put("code", 200);
		return this;
	}

	public BodyMsg isFail(ResultEnum resultEnum) {
		this.modelMap.put("fail", true);
		this.modelMap.put("code", resultEnum.getCode());
		this.modelMap.put("msg", resultEnum.getMessage());
		return this;
	}

	public BodyMsg isFail(String msg) {
		this.modelMap.put("fail", true);
		this.modelMap.put("code", 500);
		this.modelMap.put("msg", msg);
		return this;
	}

	public BodyMsg put(String str, Object obj){
		this.modelMap.put(str, obj);
		return this;
	}
}


