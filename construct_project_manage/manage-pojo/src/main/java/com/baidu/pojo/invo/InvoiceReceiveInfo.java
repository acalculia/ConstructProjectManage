package com.baidu.pojo.invo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 发票收票登记表(InvoiceReceiveInfo)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("invoice_receive_info")
public class InvoiceReceiveInfo implements Serializable {
    private static final long serialVersionUID = -97088084665759299L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 合同ID
    */
    private Integer cId;
    /**
    * 开票类型
    */
    private String openType;
    /**
    * 付款单位
    */
    private Integer payCompanyId;
    /**
    * 收款单位
    */
    private Integer incomeCompanyId;
    /**
    * 发票类型
    */
    private String invoiceType;
    /**
    * 发票号码
    */
    private String invoiceNo;
    /**
    * 发票金额
    */
    private Double invoiceAmount;
    /**
    * 金额大写
    */
    private String amountUpper;
    /**
    * 开户银行
    */
    private String accountBank;
    /**
    * 账号
    */
    private String accountNum;
    /**
    * 纳税人识别号
    */
    private String taxplayerNo;
    /**
    * 电话、地址
    */
    private String phoneAddress;
    /**
    * 填报人
    */
    private String editer;
    /**
    * 日期
    */
    private Date openDate;
    /**
    * 备注
    */
    private String comment;


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

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public Integer getPayCompanyId() {
        return payCompanyId;
    }

    public void setPayCompanyId(Integer payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    public Integer getIncomeCompanyId() {
        return incomeCompanyId;
    }

    public void setIncomeCompanyId(Integer incomeCompanyId) {
        this.incomeCompanyId = incomeCompanyId;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getAmountUpper() {
        return amountUpper;
    }

    public void setAmountUpper(String amountUpper) {
        this.amountUpper = amountUpper;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getTaxplayerNo() {
        return taxplayerNo;
    }

    public void setTaxplayerNo(String taxplayerNo) {
        this.taxplayerNo = taxplayerNo;
    }

    public String getPhoneAddress() {
        return phoneAddress;
    }

    public void setPhoneAddress(String phoneAddress) {
        this.phoneAddress = phoneAddress;
    }

    public String getEditer() {
        return editer;
    }

    public void setEditer(String editer) {
        this.editer = editer;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}