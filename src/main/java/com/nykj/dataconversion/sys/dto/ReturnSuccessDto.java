package com.nykj.dataconversion.sys.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangchao
 * @version 1.0
 * @date 2021/2/4 9:33 下午
 * @description
 */
@Data
public class ReturnSuccessDto {
	@ApiModelProperty(value = "错误码")
	private int code;

	@ApiModelProperty(value = "接口成功")
	private Boolean success;
}
