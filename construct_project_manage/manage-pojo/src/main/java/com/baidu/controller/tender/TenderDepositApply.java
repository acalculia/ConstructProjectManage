package com.baidu.controller.tender;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 投标保证金申请(TenderDepositApply)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tender_deposit_apply")
public class TenderDepositApply implements Serializable {
    private static final long serialVersionUID = 432470951069617652L;
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
    * 开户银行
    */
    private String bankName;
    /**
    * 账号
    */
    private String account;
    /**
    * 保证金金额
    */
    private Long depositAmount;
    /**
    * 金额大写
    */
    private String upperAmount;
    /**
    * 交款日期
    */
    private Date commitDate;
    /**
    * 预计退回日期
    */
    private Date returnDate;
    /**
    * 备注
    */
    private String comment;
    /**
    * 附件
    */
    private String attachementIds;
    /**
    * 审批状态
    */
    private String approveStatus;
    /**
    * 更新日期
    */
    private Date updateDate;
    /**
    * 更新人
    */
    private String updateUser;


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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getUpperAmount() {
        return upperAmount;
    }

    public void setUpperAmount(String upperAmount) {
        this.upperAmount = upperAmount;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttachementIds() {
        return attachementIds;
    }

    public void setAttachementIds(String attachementIds) {
        this.attachementIds = attachementIds;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
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

}