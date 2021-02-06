package com.nykj.dataconversion.codeEnum;

/**
 * @author zhangchao
 * @version 1.0
 * @date 2021/1/28 2:25 下午
 */
public enum ResultEnum {
	PARAMS_IS_EMPTY(5001, "参数为空"),
	PARAMS_IS_VALID(5002, "参数无效"),
	CAST_IS_VALID(5003, "参数类型转化异常"),
	SQL_IS_VALID(5004, "sql异常"),
	INVALID_REQ_BODY(5005, "请求参数不正确");

	private int code;
	private String message;

	ResultEnum(final int code, final String message) {
		this.code = code;
		this.message = message;
	}

	public ResultEnum setResultCode(int resultCode) {
		this.code = resultCode;
		return this;
	}

	public ResultEnum setResultMsg(String resultMsg) {
		this.message = resultMsg;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}
}
