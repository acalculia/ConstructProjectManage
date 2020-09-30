package com.baidu.controller.tender;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 技术交底(TechnicalDisclosure)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("technical_disclosure")
public class TechnicalDisclosure implements Serializable {
    private static final long serialVersionUID = -96716306896355368L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 填写人
    */
    private Integer fillUser;
    /**
    * 日期
    */
    private Date updateDate;
    /**
    * 审批状态
    */
    private String approveStatus;
    /**
    * 交底地点
    */
    private String disclosureAddress;
    /**
    * 施工单位
    */
    private Integer workCompany;
    /**
    * 交底人
    */
    private String disclosurePerson;
    /**
    * 被交底人
    */
    private String byDisclosurePerson;
    /**
    * 交底内容
    */
    private String disclosureContent;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 备注
    */
    private String comment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getFillUser() {
        return fillUser;
    }

    public void setFillUser(Integer fillUser) {
        this.fillUser = fillUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getDisclosureAddress() {
        return disclosureAddress;
    }

    public void setDisclosureAddress(String disclosureAddress) {
        this.disclosureAddress = disclosureAddress;
    }

    public Integer getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(Integer workCompany) {
        this.workCompany = workCompany;
    }

    public String getDisclosurePerson() {
        return disclosurePerson;
    }

    public void setDisclosurePerson(String disclosurePerson) {
        this.disclosurePerson = disclosurePerson;
    }

    public String getByDisclosurePerson() {
        return byDisclosurePerson;
    }

    public void setByDisclosurePerson(String byDisclosurePerson) {
        this.byDisclosurePerson = byDisclosurePerson;
    }

    public String getDisclosureContent() {
        return disclosureContent;
    }

    public void setDisclosureContent(String disclosureContent) {
        this.disclosureContent = disclosureContent;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}