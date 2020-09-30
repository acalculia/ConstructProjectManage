package com.baidu.controller.tender;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 招标采购计划(TenderPurchasePlan)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tender_purchase_plan")
public class TenderPurchasePlan implements Serializable {
    private static final long serialVersionUID = -63666498944256525L;
    /**
    * 采购编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer proId;
    /**
    * 编制人
    */
    private String planEditor;
    /**
    * 日期
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

    public String getPlanEditor() {
        return planEditor;
    }

    public void setPlanEditor(String planEditor) {
        this.planEditor = planEditor;
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