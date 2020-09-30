package com.baidu.controller.device;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 设备维保表(DeviceMaintain)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("device_maintain")
public class DeviceMaintain implements Serializable {
    private static final long serialVersionUID = 496225358633418685L;
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
    * 维保名称
    */
    private String maintainName;
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
    * 附件
    */
    private String attachIds;
    /**
    * 备注
    */
    private String comment;
    /**
    * 合计
    */
    private Double totalPrice;
    /**
    * 合计大写
    */
    private String totalUpper;


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

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalUpper() {
        return totalUpper;
    }

    public void setTotalUpper(String totalUpper) {
        this.totalUpper = totalUpper;
    }

}