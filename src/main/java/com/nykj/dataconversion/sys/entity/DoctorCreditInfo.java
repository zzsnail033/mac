package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 互联网医师诚信档案信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="DoctorCreditInfo对象", description="互联网医师诚信档案信息")
public class DoctorCreditInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医师姓名")
    private String docName;

    @ApiModelProperty(value = "医师身份证号")
    private String idCard;

    @ApiModelProperty(value = "处罚医院编码")
    private String orgCode;

    @ApiModelProperty(value = "处罚医院名称")
    private String orgName;

    @ApiModelProperty(value = "处罚原因")
    private String punishReason;

    @ApiModelProperty(value = "处罚结果")
    private String punishResult;

    @ApiModelProperty(value = "处罚时间")
    private Date punishTime;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
