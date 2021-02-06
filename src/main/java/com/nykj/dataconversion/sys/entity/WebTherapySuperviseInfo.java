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
 * 在线诊疗（咨询）监管信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebTherapySuperviseInfo对象", description="在线诊疗（咨询）监管信息")
public class WebTherapySuperviseInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "接诊时间")
    private Date visitTime;

    @ApiModelProperty(value = "结束时间")
    private Date visitFinishTime;

    @ApiModelProperty(value = "接诊科室编码")
    private String visitDeptCode;

    @ApiModelProperty(value = "接诊科室名称")
    private String visitDeptName;

    @ApiModelProperty(value = "接诊医师编码")
    private String visitDocCode;

    @ApiModelProperty(value = "接诊医师姓名")
    private String visitDocName;

    @ApiModelProperty(value = "患者ID")
    private String ptId;

    @ApiModelProperty(value = "就诊流水号")
    private String medRdNo;

    @ApiModelProperty(value = "是否复诊(1：是，0：否)")
    private Integer revisitFlag;

    @ApiModelProperty(value = "初诊医院编码")
    private String firstVisitOrgCode;

    @ApiModelProperty(value = "就诊流水号")
    private String firstVisitOrgName;

    @ApiModelProperty(value = "就诊类别编码")
    private String medClassCode;

    @ApiModelProperty(value = "初诊医院名称")
    private String medClassName;

    @ApiModelProperty(value = "诊疗费用")
    private BigDecimal price;

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

    @ApiModelProperty(value = "联合参会医生列表")
    private String consultDocList;

    @ApiModelProperty(value = "疾病编码")
    private String diseasesCode;

    @ApiModelProperty(value = "疾病名称")
    private String diseasesName;

    @ApiModelProperty(value = "症状描述")
    private String complaintContent;

    @ApiModelProperty(value = "现病史")
    private String presentIllness;

    @ApiModelProperty(value = "既往史")
    private String pastHistory;

    @ApiModelProperty(value = "咨询或就诊")
    private Integer askOrMed;

    @ApiModelProperty(value = "诊疗过程文件索引列表")
    private String procIndexList;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
