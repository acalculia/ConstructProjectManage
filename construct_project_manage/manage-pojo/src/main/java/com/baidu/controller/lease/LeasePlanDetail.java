package com.baidu.controller.lease;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 租赁计划明细(LeasePlanDetail)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("lease_plan_detail")
public class LeasePlanDetail implements Serializable {
    private static final long serialVersionUID = 401509012294045778L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 租赁计划ID
    */
    private Integer leaseId;
    /**
    * 工作内容材料ID
    */
    private Integer materialId;
    /**
    * 数量
    */
    private Integer count;
    /**
    * 单价
    */
    private Double price;
    /**
    * 计划进程日期
    */
    private Date planStartDate;
    /**
    * 计划退场日期
    */
    private Date planEndDate;
    /**
    * 租赁天数
    */
    private Integer leaseDays;
    /**
    * 小计
    */
    private Double sumAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Integer leaseId) {
        this.leaseId = leaseId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Integer getLeaseDays() {
        return leaseDays;
    }

    public void setLeaseDays(Integer leaseDays) {
        this.leaseDays = leaseDays;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

}