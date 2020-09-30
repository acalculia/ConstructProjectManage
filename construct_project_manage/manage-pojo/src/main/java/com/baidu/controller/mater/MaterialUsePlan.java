package com.baidu.controller.mater;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 材料需用计划(MaterialUsePlan)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("material_use_plan")
public class MaterialUsePlan implements Serializable {
    private static final long serialVersionUID = 253868899556603395L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer proId;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 计划主题
    */
    private String planSubject;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPlanSubject() {
        return planSubject;
    }

    public void setPlanSubject(String planSubject) {
        this.planSubject = planSubject;
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