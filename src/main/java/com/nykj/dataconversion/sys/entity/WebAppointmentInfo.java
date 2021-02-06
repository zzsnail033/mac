package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

/**
 * <p>
 * 预约挂号监管信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebAppointmentInfo对象", description="预约挂号监管信息")
public class WebAppointmentInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "预约号")
    private String appointNo;

    @ApiModelProperty(value = "患者ID")
    private String ptId;

    @ApiModelProperty(value = "患者姓名")
    private String ptNo;

    @ApiModelProperty(value = "性别编码")
    private String geCode;

    @ApiModelProperty(value = "预约号")
    private String geName;

    @ApiModelProperty(value = "患者年龄")
    private Integer ptAge;

    @ApiModelProperty(value = "患者出生日期")
    private Date ptBirthdate;

    @ApiModelProperty(value = "身份证号")
    private String idNo;

    @ApiModelProperty(value = "患者手机号")
    private String ptTel;

    @ApiModelProperty(value = "患者所在地区")
    private String ptDistrict;

    @ApiModelProperty(value = "预约机构编码")
    private String appointOrgCode;

    @ApiModelProperty(value = "预约机构名称")
    private String appointOrgName;

    @ApiModelProperty(value = "预约科室编码")
    private String appointDeptCode;

    @ApiModelProperty(value = "预约科室名称")
    private String appointDeptName;

    @ApiModelProperty(value = "预约医生编码")
    private String appointDocCode;

    @ApiModelProperty(value = "预约医生名称")
    private String appointDocName;

    @ApiModelProperty(value = "预约时间")
    private Date appointTime;

    @ApiModelProperty(value = "就诊日期")
    private Date appointDate;

    @ApiModelProperty(value = "就诊推荐时间段")
    private String visitTimeScop;

    @ApiModelProperty(value = "预约挂号是否取消")
    private Integer cancelFlag;

    @ApiModelProperty(value = "取消预约挂号时间")
    private Date cancelTime;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
