package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

/**
 * <p>
 * 互联网医疗机构信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebHospitalBasicInfo对象", description="互联网医疗机构信息")
public class WebHospitalBasicInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "全国统一的组织机构代码")
    private String orgCode;

    @ApiModelProperty(value = "互联网医院的机构名称")
    private String orgName;

    @ApiModelProperty(value = "通信地址")
    private String orgAddress;

    @ApiModelProperty(value = "联系人姓名")
    private String orgContactName;

    @ApiModelProperty(value = "联系电话")
    private String orgTel;

    @ApiModelProperty(value = "法人代表")
    private String orgPrincipaName;

    @ApiModelProperty(value = "开始日期(执业许可证有效期的开始日期)")
    private Date dateStart;

    @ApiModelProperty(value = "截至日期(执业许可证有效期的截至日期)")
    private Date dateEnd;

    @ApiModelProperty(value = "经济属性(政府公立、国企医院、国有与民营合资、民营、外资)")
    private String economicAttribute;

    @ApiModelProperty(value = "机构类别(综合医院、中医医院、中西医结合医院、民族医院、专科医院、康复医院、妇幼保健院、等等)")
    private String orgCategory;

    @ApiModelProperty(value = "机构级别(三级、二级、一级)")
    private String orgLevel;

    @ApiModelProperty(value = "机构等次(特等、甲等、乙等、丙等、未定等次)")
    private String orgGrade;

    @ApiModelProperty(value = "编制床位")
    private Integer authBeds;

    @ApiModelProperty(value = "平均开放床位")
    private Integer avgActualBeds;

    @ApiModelProperty(value = "机构简介")
    private String orgComment;

    @ApiModelProperty(value = "诊疗科目列表")
    private String deptCommentList;

    @ApiModelProperty(value = "互联网医院备案-电子签章")
    private String hosDigitalSign;

    @ApiModelProperty(value = "互联网医院备案-可行性报告")
    private String recordFeasibility;

    @ApiModelProperty(value = "互联网医院执业许可证")
    private String recordProve;

    @ApiModelProperty(value = "互联网医院备案-医疗机构规章制度列表")
    private String recordRulesList;

    @ApiModelProperty(value = "互联网医院备案-网络拓扑图")
    private String recordTopology;

    @ApiModelProperty(value = "资质文件列表")
    private String fileList;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
