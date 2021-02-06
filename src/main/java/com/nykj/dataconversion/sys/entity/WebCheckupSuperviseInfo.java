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
 * 健康体检信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebCheckupSuperviseInfo对象", description="健康体检信息")
public class WebCheckupSuperviseInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医疗机构编码")
    private String orgCode;

    @ApiModelProperty(value = "医疗机构名称")
    private String orgName;

    @ApiModelProperty(value = "体检机构编码")
    private String checkupOrgCode;

    @ApiModelProperty(value = "体检机构名称")
    private String checkupOrgName;

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

    @ApiModelProperty(value = "保险类别编码")
    private String insClassCode;

    @ApiModelProperty(value = "保险类别名称")
    private String insClassName;

    @ApiModelProperty(value = "体检套餐编码")
    private String checkupClassCode;

    @ApiModelProperty(value = "体检套餐名称")
    private String checkupClassName;

    @ApiModelProperty(value = "体检套餐明细列表")
    private String checkupClassDetailList;

    @ApiModelProperty(value = "体检加项明细列表")
    private String checkupAddDetailList;

    @ApiModelProperty(value = "体检套餐费用")
    private BigDecimal checkupClassPrice;

    @ApiModelProperty(value = "体检加项费用")
    private BigDecimal checkupAddPrice;

    @ApiModelProperty(value = "体检总费用")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "预约编号")
    private String appointNo;

    @ApiModelProperty(value = "体检编号")
    private String checkupNo;

    @ApiModelProperty(value = "体检开始时间")
    private Date visitTime;

    @ApiModelProperty(value = "体检结束时间")
    private Date visitFinishTime;

    @ApiModelProperty(value = "体检项目列表")
    private String checkupItemList;

    @ApiModelProperty(value = "体检结论")
    private String checkupResult;

    @ApiModelProperty(value = "体检报告文件索引列表")
    private String checkupIndexList;

    @ApiModelProperty(value = "最后更新时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
