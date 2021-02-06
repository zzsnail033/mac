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
 * 电子处方药品明细
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="PrescriptionDrug对象", description="电子处方药品明细")
public class PrescriptionDrug extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "处方号")
    private String presNo;

    @ApiModelProperty(value = "药品通用名称")
    private String apprDrugName;

    @ApiModelProperty(value = "药品商品编码")
    private String drugCode;

    @ApiModelProperty(value = "药品商品名称")
    private String drugName;

    @ApiModelProperty(value = "药品分类码")
    private String drugTypeCode;

    @ApiModelProperty(value = "药品分类名称")
    private String drugTypeName;

    @ApiModelProperty(value = "药品剂型")
    private String drugForm;

    @ApiModelProperty(value = "用药途径")
    private String drugMethod;

    @ApiModelProperty(value = "用药剂量-单次")
    private String dosage;

    @ApiModelProperty(value = "用药剂量单位-单次")
    private String dosageUnit;

    @ApiModelProperty(value = "用药剂量-总量")
    private String totalDosage;

    @ApiModelProperty(value = "用药剂量单位-总量")
    private String totalDosageUnit;

    @ApiModelProperty(value = "用药频率编码")
    private String medicineFreq;

    @ApiModelProperty(value = "用药频率")
    private String medicineFreqName;

    @ApiModelProperty(value = "规格")
    private String standardDesc;

    @ApiModelProperty(value = "单价")
    private BigDecimal singlePrice;

    @ApiModelProperty(value = "金额")
    private BigDecimal drugTotalPrice;

    @ApiModelProperty(value = "嘱托")
    private String comments;

    @ApiModelProperty(value = "抗菌药说明")
    private String antiComments;

    @ApiModelProperty(value = "中药煎煮法名称")
    private String decMethName;

    @ApiModelProperty(value = "药量(单位为天)")
    private Integer totalCharge;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
