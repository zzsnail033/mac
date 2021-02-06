package com.nykj.dataconversion.filter;

import com.alibaba.fastjson.JSONObject;
import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.exception.HospitalException;
import com.nykj.dataconversion.filter.wrapper.BodyRequestWrapper;
import com.nykj.dataconversion.filter.wrapper.ParameterRequestWrapper;
import com.nykj.dataconversion.util.AESUtil;
import com.nykj.dataconversion.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class DecryptFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		String contentType = request.getContentType();
		String path = request.getRequestURI();
		log.info("---------------进入到DecryptFilter---------------{}", path);

		if(path.contains("doc.html") || path.contains("swagger") || path.contains("webjars") || path.contains("v2") || path.contains("api-docs")){

		}else{
			// json传参
			if (contentType.equals(MediaType.APPLICATION_JSON_UTF8_VALUE) || contentType.equals(MediaType.APPLICATION_JSON_VALUE)) {
				// 获取request的body参数
				String postContent = getBody(request);
				if (StringUtils.isNotEmpty(postContent)) {
				/* 下面注释掉的是在这里修改json，并更改需要更改的值
				JSONObject jsStr = JSONObject.parseObject(postContent);
				jsStr.put("code", "11");
				postContent = jsStr.toJSONString(); */

					// 将参数放入重写的方法中
					request = new BodyRequestWrapper(request, postContent);
				}
			} else if ((contentType.equals(MediaType.APPLICATION_FORM_URLENCODED_VALUE+";charset=UTF-8")) ||
					(contentType.equals(MediaType.APPLICATION_FORM_URLENCODED_VALUE) ||
							contentType.contains(MediaType.MULTIPART_FORM_DATA_VALUE)) &&
							!request.getParameterMap().isEmpty()) {

				// formdata表单传参以及需要逻辑修改参数的部分
				// 检查参数是否正常
				Boolean paramsStatus = checkParamsIsOk(request.getParameterMap());

				// 解密并修改request参数
				String preParams = request.getParameterMap().get("params")[0];
				if (paramsStatus) {
					Map<String, String> parameterMap = new HashMap<>();
					String decryptResult = "";

					try {
						// 解密后的标准格式：{"json":{"name":"张三","age":23},"code":200}
						decryptResult = AESUtil.decrypt(preParams, AESUtil.KEY, AESUtil.IV);
					} catch (HospitalException e) {
						String json = JsonUtil.getJson(ResultEnum.PARAMS_IS_VALID.getCode(), ResultEnum.PARAMS_IS_VALID.getMessage());
						JsonUtil.returnJson(json, response);
						return;
					}

					log.info("---------------------解密后的数据，「{}」", decryptResult);
					Integer code = (Integer) ((JSONObject) JSONObject.parse(decryptResult)).get("code");

					// json格式异常
					if (code == null || !code.equals(200)) {
						String json = JsonUtil.getJson(ResultEnum.PARAMS_IS_VALID.getCode(), ResultEnum.PARAMS_IS_VALID.getMessage());
						JsonUtil.returnJson(json, response);
						return ;
					}
					parameterMap.put("params", decryptResult);

					// 将参数放入重写的方法中
					request = new ParameterRequestWrapper(request, parameterMap);
				}
			}
		}
		chain.doFilter(request, response);
	}


	/**
	 * 检查参数是否存在
	 *
	 * @param parameterMap
	 * @return
	 */
	private Boolean checkParamsIsOk(Map<String, String[]> parameterMap) {
		String[] encryptParams = parameterMap.get("params");
		if (encryptParams.length <= 0) {
			throw new HospitalException(ResultEnum.PARAMS_IS_EMPTY);
		}
		return true;
	}

	// 获取Request的body数据
	private String getBody(ServletRequest request) {
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		InputStream inputStream = null;
		try {
			inputStream = request.getInputStream();
			if (inputStream != null) {
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append("");
			}
		} catch (IOException ex) {

		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return stringBuilder.toString();
	}

	@Override
	public void destroy() {

	}

	public static void main(String[] args) {
		String str = "{\"parmas\":{\"name\":\"张三\",\"age\":23},\"code\":200}";
		JSONObject jsonObject = (JSONObject) JSONObject.parse(str);
		JSONObject jsonObject1 = (JSONObject) jsonObject.get("parmas");
		System.out.println(jsonObject1);
	}
}

