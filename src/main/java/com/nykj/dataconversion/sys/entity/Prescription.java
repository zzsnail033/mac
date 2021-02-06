package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 电子处方
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="Prescription对象", description="电子处方")
public class Prescription extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "处方号")
    private String presNo;

    @ApiModelProperty(value = "处方类别编码")
    private String presClassCode;

    @ApiModelProperty(value = "处方类别名称")
    private String presClassName;

    @ApiModelProperty(value = "患者ID")
    private String ptId;

    @ApiModelProperty(value = "就诊流水号")
    private String medRdNo;

    @ApiModelProperty(value = "就诊类别编码")
    private String medClassCode;

    @ApiModelProperty(value = "初诊医院名称")
    private String medClassName;

    @ApiModelProperty(value = "患者姓名")
    private String ptNo;

    @ApiModelProperty(value = "性别编码")
    private String geCode;

    @ApiModelProperty(value = "预约号")
    private String geName;

    @ApiModelProperty(value = "患者年龄")
    private Integer ptAge;

    @ApiModelProperty(value = "患者出生日期")
    private Date birthday;

    @ApiModelProperty(value = "身份证号")
    private String idNo;

    @ApiModelProperty(value = "患者手机号")
    private String ptTel;

    @ApiModelProperty(value = "患者所在地区")
    private String ptDistrict;

    @ApiModelProperty(value = "保险类别编码")
    private String insClassCode;

    @ApiModelProperty(value = "保险类别名称")
    private String insClassName;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "就诊科室编码")
    private String visitDeptCode;

    @ApiModelProperty(value = "就诊科室名称")
    private String visitDeptName;

    @ApiModelProperty(value = "开方科室编码")
    private String presDeptCode;

    @ApiModelProperty(value = "开方科室名称")
    private String presDeptName;

    @ApiModelProperty(value = "开方时间")
    private Date presTime;

    @ApiModelProperty(value = "开方医生编码")
    private String presDocCode;

    @ApiModelProperty(value = "开方医生姓名")
    private String presDocName;

    @ApiModelProperty(value = "开方医师照片数据")
    private String presDocPhoteData;

    @ApiModelProperty(value = "审核时间")
    private Date reviewTime;

    @ApiModelProperty(value = "审核医生编码")
    private String reviewDocCode;

    @ApiModelProperty(value = "审核医生姓名")
    private String reviewDocName;

    @ApiModelProperty(value = "审方时间")
    private Date trialTime;

    @ApiModelProperty(value = "审方药师编码")
    private String trialDocCode;

    @ApiModelProperty(value = "审方药师姓名")
    private String trialDocName;

    @ApiModelProperty(value = "诊断编码类型")
    private String diagCodeType;

    @ApiModelProperty(value = "疾病编码")
    private String diseasesCode;

    @ApiModelProperty(value = "疾病名称")
    private String diseasesName;

    @ApiModelProperty(value = "疾病分类")
    private Integer diseasesType;

    @ApiModelProperty(value = "行动不便标志")
    private Integer mobilityFlag;

    @ApiModelProperty(value = "病情稳定需长期服药标志")
    private Integer longMedicalFlag;

    @ApiModelProperty(value = "处方有效期（单位天）")
    private Integer presEffecDays;

    @ApiModelProperty(value = "总金额")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "互联网医院处方图片列表(适合多张处方照片的情形)")
    private String presPhotosList;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
