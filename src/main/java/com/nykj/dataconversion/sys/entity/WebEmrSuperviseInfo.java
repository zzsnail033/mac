package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 电子病历信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="WebEmrSuperviseInfo对象", description="电子病历信息")
public class WebEmrSuperviseInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    @ApiModelProperty(value = "机构名称")
    private String orgName;

    @ApiModelProperty(value = "书写医师编码")
    private String recordDocCode;

    @ApiModelProperty(value = "书写医师姓名")
    private String recordDocName;

    @ApiModelProperty(value = "患者ID")
    private String ptId;

    @ApiModelProperty(value = "就诊流水号")
    private String medRdNo;

    @ApiModelProperty(value = "病例文件索引列表")
    private String mrFileIndexList;

    @ApiModelProperty(value = "病历新建时间")
    private Date createTime;

    @ApiModelProperty(value = "病历完成时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
