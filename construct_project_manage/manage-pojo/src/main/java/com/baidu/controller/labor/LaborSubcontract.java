package com.baidu.controller.labor;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 分包合同(LaborSubcontract)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("labor_subcontract")
public class LaborSubcontract implements Serializable {
    private static final long serialVersionUID = 658165835279658627L;
    /**
    * 合同编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 合同名称
    */
    private String contractName;
    /**
    * 合同类型
    */
    private Integer contractType;
    /**
    * 劳务班组ID
    */
    private Integer laborOrgId;
    /**
    * 签订人
    */
    private String contractSignatory;
    /**
    * 开始日期
    */
    private Date startDate;
    /**
    * 结束日期
    */
    private Date endDate;
    /**
    * 合同金额
    */
    private Long contractAmount;
    /**
    * 金额大写
    */
    private String amountUpper;
    /**
    * 付款方式
    */
    private String paymentType;
    /**
    * 结算方式
    */
    private String settleType;
    /**
    * 预付款
    */
    private Double advancePay;
    /**
    * 保证金
    */
    private Double depositAmount;
    /**
    * 流程ID
    */
    private Integer flowId;
    /**
    * 审批状态
    */
    private String approveStatus;
    /**
    * 付款条件
    */
    private String payCondition;
    /**
    * 主要条款
    */
    private String mainTerm;
    /**
    * 备注
    */
    private String comment;
    /**
    * 合同附件
    */
    private String attachIds;
    /**
    * 日期
    */
    private Date createDate;


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

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public Integer getLaborOrgId() {
        return laborOrgId;
    }

    public void setLaborOrgId(Integer laborOrgId) {
        this.laborOrgId = laborOrgId;
    }

    public String getContractSignatory() {
        return contractSignatory;
    }

    public void setContractSignatory(String contractSignatory) {
        this.contractSignatory = contractSignatory;
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

    public Long getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Long contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getAmountUpper() {
        return amountUpper;
    }

    public void setAmountUpper(String amountUpper) {
        this.amountUpper = amountUpper;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Double getAdvancePay() {
        return advancePay;
    }

    public void setAdvancePay(Double advancePay) {
        this.advancePay = advancePay;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
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

    public String getPayCondition() {
        return payCondition;
    }

    public void setPayCondition(String payCondition) {
        this.payCondition = payCondition;
    }

    public String getMainTerm() {
        return mainTerm;
    }

    public void setMainTerm(String mainTerm) {
        this.mainTerm = mainTerm;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}