package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 登陆监管信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="LoginSupersiveInfo对象", description="登陆监管信息")
public class LoginSupersiveInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "登录医师编码")
    private String loginDocCode;

    @ApiModelProperty(value = "登录医师姓名")
    private String loginDocName;

    @ApiModelProperty(value = "登录时间")
    private Date loginTime;

    @ApiModelProperty(value = "登录医师照片数据")
    private String loginDocPhoto;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
