package com.baidu.controller.mater;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 材料退库记录表(MaterialRefoundRecord)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("material_refound_record")
public class MaterialRefoundRecord implements Serializable {
    private static final long serialVersionUID = -13062389955031356L;
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
    * 退库名称
    */
    private String outstorageName;
    /**
    * 填报人
    */
    private String applyer;
    /**
    * 填报日期
    */
    private Date date;
    /**
    * 领用人
    */
    private Integer getUser;
    /**
    * 退库班组ID
    */
    private Integer getOrgId;
    /**
    * 仓库ID
    */
    private Integer storageId;
    /**
    * 备注
    */
    private String comment;
    /**
    * 审批状态
    */
    private Integer approveStatus;
    /**
    * 附件
    */
    private String attachIds;


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

    public String getOutstorageName() {
        return outstorageName;
    }

    public void setOutstorageName(String outstorageName) {
        this.outstorageName = outstorageName;
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

    public Integer getGetUser() {
        return getUser;
    }

    public void setGetUser(Integer getUser) {
        this.getUser = getUser;
    }

    public Integer getGetOrgId() {
        return getOrgId;
    }

    public void setGetOrgId(Integer getOrgId) {
        this.getOrgId = getOrgId;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
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

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

}