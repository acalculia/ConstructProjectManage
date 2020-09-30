package com.baidu.controller.iden;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 证件费用表(IdentifyFee)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("identify_fee")
public class IdentifyFee implements Serializable {
    private static final long serialVersionUID = -21616590119760910L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 性别
    */
    private String sex;
    /**
    * 证件名称
    */
    private String credentialName;
    /**
    * 证书编号
    */
    private String credentialNo;
    /**
    * 开始日期
    */
    private Date startDate;
    /**
    * 结束日期
    */
    private Date endDate;
    /**
    * 证件费用
    */
    private Double credentialFee;
    /**
    * 费用大写
    */
    private String feeUpper;
    /**
    * 附件
    */
    private String attachIds;
    /**
    * 备注
    */
    private String pictureIds;
    /**
    * 更新日期
    */
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public String getCredentialNo() {
        return credentialNo;
    }

    public void setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getCredentialFee() {
        return credentialFee;
    }

    public void setCredentialFee(Double credentialFee) {
        this.credentialFee = credentialFee;
    }

    public String getFeeUpper() {
        return feeUpper;
    }

    public void setFeeUpper(String feeUpper) {
        this.feeUpper = feeUpper;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

    public String getPictureIds() {
        return pictureIds;
    }

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}