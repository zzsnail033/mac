package com.nykj.dataconversion.sys.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 * 执业医师、执业药师信息
 * </p>
 *
 * @author zhangchao
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="DoctorBasicInfo对象", description="执业医师、执业药师信息")
public class DoctorBasicInfo extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "签约医疗机构编码")
    private String orgCode;

    @ApiModelProperty(value = "签约医疗机构名称")
    private String orgName;

    @ApiModelProperty(value = "机构登记号")
    private String orgRegNo;

    @ApiModelProperty(value = "执业机构地址")
    private String orgAddress;

    @ApiModelProperty(value = "机构地址邮编")
    private String orgPostalCode;

    @ApiModelProperty(value = "单位电话")
    private String orgTel;

    @ApiModelProperty(value = "机构内人员编码")
    private String inDocCode;

    @ApiModelProperty(value = "人员类型(审方药师、诊疗医师)")
    private String docType;

    @ApiModelProperty(value = "姓名")
    private String docName;

    @ApiModelProperty(value = "性别编码")
    private String geCode;

    @ApiModelProperty(value = "性别名称")
    private String geName;

    @ApiModelProperty(value = "民族编码")
    private String nationCode;

    @ApiModelProperty(value = "民族名称")
    private String nationName;

    @ApiModelProperty(value = "出生日期")
    private Date docBirthdate;

    @ApiModelProperty(value = "家庭地址")
    private String docAddress;

    @ApiModelProperty(value = "家庭地址邮编")
    private String docPostalCode;

    @ApiModelProperty(value = "学历(大学、硕士、博士)")
    private String docEdu;

    @ApiModelProperty(value = "行政职务")
    private String docPosition;

    @ApiModelProperty(value = "个人简介")
    private String docComment;

    @ApiModelProperty(value = "专业技术职务任职资格编码")
    private String titleCode;

    @ApiModelProperty(value = "专业技术职务任职资格")
    private String titleName;

    @ApiModelProperty(value = "健康状况")
    private String healthCondition;

    @ApiModelProperty(value = "业务水平考核机构或组织名称、考核培训时间及结果")
    private String appraisalContent;

    @ApiModelProperty(value = "何时何地因何种原因受过何种处罚或处分")
    private String punishContent;

    @ApiModelProperty(value = "其它要说明的问题")
    private String otherContent;

    @ApiModelProperty(value = "个人工作经历列表")
    private String workExperienceList;

    @ApiModelProperty(value = "医师第一执业机构编码")
    private String workInstCode;

    @ApiModelProperty(value = "医师第一执业机构名称")
    private String workInstName;

    @ApiModelProperty(value = "编制科室编码")
    private String docDeptCode;

    @ApiModelProperty(value = "编制科室名称")
    private String docDeptName;

    @ApiModelProperty(value = "联系手机号")
    private String docTel;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "执业证号")
    private String pracNo;

    @ApiModelProperty(value = "执业证发证日期")
    private Date pracRecDate;

    @ApiModelProperty(value = "资格证号")
    private String certNo;

    @ApiModelProperty(value = "资格证发证日期")
    private Date certRecDate;

    @ApiModelProperty(value = "医师执业级别")
    private String pracLevel;

    @ApiModelProperty(value = "职称证号")
    private String titleNo;

    @ApiModelProperty(value = "职称证取得时间")
    private Date titleRecDate;

    @ApiModelProperty(value = "医师执业类别")
    private String pracType;

    @ApiModelProperty(value = "医师执业范围")
    private String pracScopeApproval;

    @ApiModelProperty(value = "最近连续两个周期的医师定期考核合格是否合格(合格填“是”，不合格填“否”)")
    private String qualifyOrNot;

    @ApiModelProperty(value = "医师擅长专业")
    private String professional;

    @ApiModelProperty(value = "否同意以上条款")
    private String agreeTerms;

    @ApiModelProperty(value = "医师在机构执业的有效期开始时间")
    private Date docMultiSitedDateStart;

    @ApiModelProperty(value = "医师在机构执业的有效期结束时间")
    private Date docMultiSitedDateEnd;

    @ApiModelProperty(value = "申请拟执业医疗机构意见")
    private String hosOpinion;

    @ApiModelProperty(value = "申请拟执业医疗机构-电子章")
    private String hosDigitalSign;

    @ApiModelProperty(value = "申请拟执业医疗机构意见时间")
    private Date hosOpinionDate;

    @ApiModelProperty(value = "医师诊疗活动价格列表")
    private String medPriceList;

    @ApiModelProperty(value = "互联网医院聘任合同列表(适合多张合同照片的情形)")
    private String employFilesList;

    @ApiModelProperty(value = "医师数字签名留样")
    private String digitalSign;

    @ApiModelProperty(value = "海南是否已备案")
    private Integer recordFlag;

    @ApiModelProperty(value = "医院是否已确认")
    private Integer hosConfirmFlag;

    @ApiModelProperty(value = "海南处方开具权是否备案")
    private Integer presRecordFlag;

    @ApiModelProperty(value = "医师诊疗活动价格列表")
    private String docMultiSitedRecordList;

    @ApiModelProperty(value = "医师身份证文件列表")
    private String idCardList;

    @ApiModelProperty(value = "医师执业证文件列表")
    private String certDocPracList;

    @ApiModelProperty(value = "医师职称证文件列表")
    private String titleCertList;

    @ApiModelProperty(value = "医师资格证文件列表")
    private String docCertList;

    @ApiModelProperty(value = "医师认证照片文件")
    private String docPhoto;

    @ApiModelProperty(value = "创建时间")
    private Date createdLast;

    @ApiModelProperty(value = "最后修改时间")
    private Date updatedLast;

    @ApiModelProperty(value = "数据来源")
    private String dataFrom;


}
