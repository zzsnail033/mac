package com.nykj.dataconversion.exception;

import lombok.Data;

/**
 * @author zhangchao
 * @version 1.0
 * @date 2021/1/28 6:48 下午
 */
@Data
public class ModelResult<T> {
	private String returnCode;
	private String returnMsg;
}
