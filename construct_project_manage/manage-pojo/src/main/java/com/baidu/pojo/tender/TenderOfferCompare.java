package com.baidu.pojo.tender;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 招标报价对比(TenderOfferCompare)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tender_offer_compare")
public class TenderOfferCompare implements Serializable {
    private static final long serialVersionUID = 596247783369813458L;
    /**
    * 对比编号
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
    * 附件
    */
    private String attachIds;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 审批状态
    */
    private String approveStatus;


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

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}