package com.baidu.pojo.build;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 招标书购买(BuyBiddingbook)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("buy_biddingbook")
public class BuyBiddingbook implements Serializable {
    private static final long serialVersionUID = 409251008713176374L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pid;
    /**
    * 招标文件费用
    */
    private Double biddingFee;
    /**
    * 申请人
    */
    private String applyer;
    /**
    * 申请日期
    */
    private Date applyDate;
    /**
    * 备注
    */
    private String comments;
    /**
    * 审批状态
    */
    private Integer approveStatus;
    /**
    * 更新人
    */
    private String updateUser;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getBiddingFee() {
        return biddingFee;
    }

    public void setBiddingFee(Double biddingFee) {
        this.biddingFee = biddingFee;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}