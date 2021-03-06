package com.baidu.pojo.mater;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料出库记录明细(MaterialOutstorageRecordDetail)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("material_outstorage_record_detail")
public class MaterialOutstorageRecordDetail implements Serializable {
    private static final long serialVersionUID = 852364037384708938L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 出库记录ID
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
    * 出库数量
    */
    private Integer instorageCount;
    /**
    * 单价
    */
    private Double price;
    /**
    * 小计金额
    */
    private Double sumAmount;


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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

}