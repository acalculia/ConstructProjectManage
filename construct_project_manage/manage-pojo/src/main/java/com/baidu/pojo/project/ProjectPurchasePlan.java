package com.baidu.pojo.project;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 材料总计划(ProjectPurchasePlan)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("project_purchase_plan")
public class ProjectPurchasePlan implements Serializable {
    private static final long serialVersionUID = -53704793609503553L;
    /**
    * 计划编号
    */
    private String planNo;
    /**
    * 项目ID
    */
    private Integer proId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 计划名称
    */
    private String planName;
    /**
    * 填报人
    */
    private String applyer;
    /**
    * 填报日期
    */
    private Date date;
    /**
    * 备注
    */
    private String comment;
    /**
    * 审批状态
    */
    private Integer approveStatus;


    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

}