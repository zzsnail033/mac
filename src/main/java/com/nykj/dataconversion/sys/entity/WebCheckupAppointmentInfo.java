package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 体检预约信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebCheckupAppointmentInfo对象", description="体检预约信息")
public class WebCheckupAppointmentInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "全国统一的组织机构代码")
    private String orgCode;

    @ApiModelProperty(value = "互联网医院的机构名称")
    private String orgName;

    @ApiModelProperty(value = "客户ID")
    private String ptId;

    @ApiModelProperty(value = "客户姓名")
    private String ptNo;

    @ApiModelProperty(value = "性别编码")
    private String geCode;

    @ApiModelProperty(value = "性别名称")
    private String geName;

    @ApiModelProperty(value = "客户年龄")
    private Integer ptAge;

    @ApiModelProperty(value = "客户出生日期")
    private Date ptBirthdate;

    @ApiModelProperty(value = "有效证件类型编码")
    private String validCertCode;

    @ApiModelProperty(value = "有效证件类型名称")
    private String validCertName;

    @ApiModelProperty(value = "有效证件号")
    private String idNo;

    @ApiModelProperty(value = "客户手机号")
    private String ptTel;

    @ApiModelProperty(value = "客户所在地区")
    private String ptDistrict;

    @ApiModelProperty(value = "预约体检机构编码")
    private String checkupOrgCode;

    @ApiModelProperty(value = "预约体检机构名称")
    private String checkupOrgName;

    @ApiModelProperty(value = "预约号")
    private String appointNo;

    @ApiModelProperty(value = "预约时间")
    private Date appointTime;

    @ApiModelProperty(value = "体检日期")
    private Date appointDate;

    @ApiModelProperty(value = "体检推荐时间段")
    private String visitTimeScop;

    @ApiModelProperty(value = "体检预约是否取消")
    private Integer cancelFlag;

    @ApiModelProperty(value = "取消体检预约时间")
    private Date cancelTime;

    @ApiModelProperty(value = "最后更新时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
