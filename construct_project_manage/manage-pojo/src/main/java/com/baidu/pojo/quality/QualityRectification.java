package com.baidu.pojo.quality;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 质量巡检(QualityRectification)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("quality_rectification")
public class QualityRectification implements Serializable {
    private static final long serialVersionUID = 900579179478945801L;
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
    * 部位
    */
    private String rectPart;
    /**
    * 填报人ID
    */
    private Integer fillUser;
    /**
    * 质量问题
    */
    private String qualityIssue;
    /**
    * 整改内容
    */
    private String rectificationContent;
    /**
    * 现场图片
    */
    private String attacheIds;
    /**
    * 检查日期
    */
    private Date checkDate;
    /**
    * 指派人员
    */
    private String updateUser;
    /**
    * 指派时间
    */
    private Date assignDate;
    /**
    * 要求整改时间
    */
    private Date askDoneDate;
    /**
    * 当前日期
    */
    private Date currentDate;
    /**
    * 整改情况反馈
    */
    private String rectificationFeedback;
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

    public String getRectPart() {
        return rectPart;
    }

    public void setRectPart(String rectPart) {
        this.rectPart = rectPart;
    }

    public Integer getFillUser() {
        return fillUser;
    }

    public void setFillUser(Integer fillUser) {
        this.fillUser = fillUser;
    }

    public String getQualityIssue() {
        return qualityIssue;
    }

    public void setQualityIssue(String qualityIssue) {
        this.qualityIssue = qualityIssue;
    }

    public String getRectificationContent() {
        return rectificationContent;
    }

    public void setRectificationContent(String rectificationContent) {
        this.rectificationContent = rectificationContent;
    }

    public String getAttacheIds() {
        return attacheIds;
    }

    public void setAttacheIds(String attacheIds) {
        this.attacheIds = attacheIds;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public Date getAskDoneDate() {
        return askDoneDate;
    }

    public void setAskDoneDate(Date askDoneDate) {
        this.askDoneDate = askDoneDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getRectificationFeedback() {
        return rectificationFeedback;
    }

    public void setRectificationFeedback(String rectificationFeedback) {
        this.rectificationFeedback = rectificationFeedback;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

}