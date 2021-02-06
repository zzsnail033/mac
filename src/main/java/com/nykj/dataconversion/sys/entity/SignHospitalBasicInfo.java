package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 合作机构信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="SignHospitalBasicInfo对象", description="合作机构信息")
public class SignHospitalBasicInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "互联网医疗机构编码")
    private String webOrgCode;

    @ApiModelProperty(value = "互联网医疗机构名称")
    private String webOrgName;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "性质")
    private String nature;

    @ApiModelProperty(value = "级别")
    private String orgLevel;

    @ApiModelProperty(value = "机构联系电话")
    private String orgTel;

    @ApiModelProperty(value = "机构负责人姓名")
    private String orgPrincipaName;

    @ApiModelProperty(value = "机构负责人电话")
    private String orgPrincipaTel;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "机构简介")
    private String orgComment;

    @ApiModelProperty(value = "签约时间")
    private Date signTime;

    @ApiModelProperty(value = "签约年限")
    private Integer signLife;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
