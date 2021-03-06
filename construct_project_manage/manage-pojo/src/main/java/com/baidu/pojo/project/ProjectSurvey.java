package com.baidu.pojo.project;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 项目堪查表(ProjectSurvey)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("project_survey")
public class ProjectSurvey implements Serializable {
    private static final long serialVersionUID = -14024204003940566L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer projectId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 参与人
    */
    private String joinUsers;
    /**
    * 申请人
    */
    private String applyer;
    /**
    * 勘察情况
    */
    private String surveyStuation;
    /**
    * 勘察日期
    */
    private Date surveyDate;
    /**
    * 备注
    */
    private String comment;
    /**
    * 附件
    */
    private String attachementsIds;
    /**
    * 更新日期
    */
    private Date updateDate;
    /**
    * 更新人
    */
    private String updateUser;
    /**
    * 审批状态
    */
    private Integer approveStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getJoinUsers() {
        return joinUsers;
    }

    public void setJoinUsers(String joinUsers) {
        this.joinUsers = joinUsers;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public String getSurveyStuation() {
        return surveyStuation;
    }

    public void setSurveyStuation(String surveyStuation) {
        this.surveyStuation = surveyStuation;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttachementsIds() {
        return attachementsIds;
    }

    public void setAttachementsIds(String attachementsIds) {
        this.attachementsIds = attachementsIds;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

}