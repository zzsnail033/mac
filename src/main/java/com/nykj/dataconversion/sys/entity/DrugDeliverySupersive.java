package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 处方流转监管信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="DrugDeliverySupersive对象", description="处方流转监管信息")
public class DrugDeliverySupersive extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "处方号")
    private String presNo;

    @ApiModelProperty(value = "开方医生编码")
    private String presDocCode;

    @ApiModelProperty(value = "开方医生姓名")
    private String presDocName;

    @ApiModelProperty(value = "审方药师编码")
    private String trialDocCode;

    @ApiModelProperty(value = "审方药师姓名")
    private String trialDocName;

    @ApiModelProperty(value = "售药药店编码")
    private String drugECommereCode;

    @ApiModelProperty(value = "售药药店名称")
    private String drugECommereName;

    @ApiModelProperty(value = "售药方式(1”:到店自取，”2”:选择配送)")
    private Integer saleMethod;

    @ApiModelProperty(value = "处方确认人编码")
    private String confirmManCode;

    @ApiModelProperty(value = "处方确认人姓名")
    private String confirmManName;

    @ApiModelProperty(value = "处方确认时间")
    private Date confirmTime;

    @ApiModelProperty(value = "现场售药操作人编码")
    private String saleOperatorCode;

    @ApiModelProperty(value = "现场售药操作人名称")
    private String saleOperatorName;

    @ApiModelProperty(value = "到店自取时间")
    private Date selfTakeTime;

    @ApiModelProperty(value = "处方配送订单执行人编码")
    private String deliveryOrderManCode;

    @ApiModelProperty(value = "处方配送订单执行人姓名")
    private String deliveryOrderManName;

    @ApiModelProperty(value = "处方配送订单执行时间")
    private Date deliveryOrderTime;

    @ApiModelProperty(value = "配送机构编码")
    private String deliveryOrgCode;

    @ApiModelProperty(value = "配送机构名称")
    private String deliveryOrgName;

    @ApiModelProperty(value = "配送操作人")
    private String deliveryMan;

    @ApiModelProperty(value = "配送人联系方式")
    private String deliveryManTel;

    @ApiModelProperty(value = "配送时间")
    private Date deliveryTime;

    @ApiModelProperty(value = "配送到达时间")
    private Date deliveryArrivalTime;

    @ApiModelProperty(value = "是否及时(配送服务评价，如果到店自取，则为“-1”)")
    private Integer onTimeFlag;

    @ApiModelProperty(value = "是否出错(配送服务评价，如果到店自取，则为“-1”)")
    private Integer errorFlag;

    @ApiModelProperty(value = "出错原因(配送服务出错原因，如果到店自取，则为“-1)")
    private String errorReason;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
