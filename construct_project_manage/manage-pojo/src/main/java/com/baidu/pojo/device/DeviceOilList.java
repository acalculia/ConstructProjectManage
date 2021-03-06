package com.baidu.pojo.device;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 设备油耗明细(DeviceOilList)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("device_oil_list")
public class DeviceOilList implements Serializable {
    private static final long serialVersionUID = 834517964584856863L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 设备计划ID
    */
    private Integer dPlanId;
    /**
    * 设备材料ID
    */
    private Integer materialId;
    /**
    * 耗油量
    */
    private Double useCount;
    /**
    * 油价
    */
    private Double oilPrice;
    /**
    * 油费
    */
    private Double usedFee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDPlanId() {
        return dPlanId;
    }

    public void setDPlanId(Integer dPlanId) {
        this.dPlanId = dPlanId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Double getUseCount() {
        return useCount;
    }

    public void setUseCount(Double useCount) {
        this.useCount = useCount;
    }

    public Double getOilPrice() {
        return oilPrice;
    }

    public void setOilPrice(Double oilPrice) {
        this.oilPrice = oilPrice;
    }

    public Double getUsedFee() {
        return usedFee;
    }

    public void setUsedFee(Double usedFee) {
        this.usedFee = usedFee;
    }

}