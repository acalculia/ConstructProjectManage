package com.baidu.controller.mater;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料入库记录明细(MaterialInstorageRecordDetail)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("material_instorage_record_detail")
public class MaterialInstorageRecordDetail implements Serializable {
    private static final long serialVersionUID = -27039396418374192L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 入库记录ID
    */
    private Integer instorageId;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 仓库ID
    */
    private Integer warehouseId;
    /**
    * 入库数量
    */
    private Integer instorageCount;
    /**
    * 含税单价
    */
    private Double taxPrice;
    /**
    * 不含税单价
    */
    private Double notaxPrice;
    /**
    * 税率
    */
    private Double taxRate;
    /**
    * 含税金额
    */
    private Double taxSumAmount;
    /**
    * 不含税金额
    */
    private Double notaxSumAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstorageId() {
        return instorageId;
    }

    public void setInstorageId(Integer instorageId) {
        this.instorageId = instorageId;
    }

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getInstorageCount() {
        return instorageCount;
    }

    public void setInstorageCount(Integer instorageCount) {
        this.instorageCount = instorageCount;
    }

    public Double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(Double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public Double getNotaxPrice() {
        return notaxPrice;
    }

    public void setNotaxPrice(Double notaxPrice) {
        this.notaxPrice = notaxPrice;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxSumAmount() {
        return taxSumAmount;
    }

    public void setTaxSumAmount(Double taxSumAmount) {
        this.taxSumAmount = taxSumAmount;
    }

    public Double getNotaxSumAmount() {
        return notaxSumAmount;
    }

    public void setNotaxSumAmount(Double notaxSumAmount) {
        this.notaxSumAmount = notaxSumAmount;
    }

}