package com.nykj.dataconversion.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

/**
 * @author zhangchao
 * @version 1.0
 * @date 2021/1/28 4:10 下午
 */
public class JsonUtil {
	/**
	 * 通过json串和对应java类名称创建转换
	 *
	 * @param params
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public static Object jsonToJava(String params, String className) throws Exception {
		// 将解密后的参数转json对象
		JSONObject jsonObject = (JSONObject) JSONObject.parse(params);

		// 获取java对象源数据
		JSONObject metaData = (JSONObject) jsonObject.get("json");

		// 通过类名称创建类如：Class.forName(Test.class.getName())
		Class cla = Class.forName(className);

		// json对象转java对象
		return metaData.toJavaObject(cla);
	}

	/**
	 * 当异常情况在filter中返回json到调用方
	 * @param json
	 * @param response
	 */
	public static void returnJson(String json, ServletResponse response) {
//		String str = new String("{\"json\":{\"name\":\"张三\",\"age\":23},\"code\":200}");
		//把返回值输出到客户端
		try {
			ServletOutputStream out = response.getOutputStream();
			out.write(json.getBytes());
			out.flush();
		}catch (Exception e){

		}
	}

	/**
	 * 获得json串
	 * @param code
	 * @param msg
	 * @return
	 */
	public static String getJson(int code, String msg){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", code);
		jsonObject.put("msg", msg);
		return JSON.toJSONString(jsonObject);
	}

	public static void main(String[] args) throws Exception {
		String params = "{\"json\":{\"name\":\"张三\",\"age\":23},\"code\":200}";
//		System.out.println(jsonToJava(params, Test.class.getName()));
	}
}
