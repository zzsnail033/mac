package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

/**
 * <p>
 * 互联网医院设备信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebHospitalEqpInfo对象", description="互联网医院设备信息")
public class WebHospitalEqpInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "全国统一的组织机构代码")
    private String orgCode;

    @ApiModelProperty(value = "互联网医院的机构名称")
    private String orgName;

    @ApiModelProperty(value = "填表日期")
    private Date fillDate;

    @ApiModelProperty(value = "远程门诊设备列表")
    private String remoteClinicEqpList;

    @ApiModelProperty(value = "远程会诊设备列表")
    private String remoteConsultEqpList;

    @ApiModelProperty(value = "远程心电诊断设备列表")
    private String remoteEcgEqpList;

    @ApiModelProperty(value = "远程医学影像诊断设备列表")
    private String remoteImageEqpList;

    @ApiModelProperty(value = "远程病理诊断设备列表")
    private String remotePatholEqpList;

    @ApiModelProperty(value = "其他诊断设备列表")
    private String otherEqpList;

    @ApiModelProperty(value = "附件文件列表")
    private String fileList;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
