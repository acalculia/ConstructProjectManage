package com.baidu.pojo.sub;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 分包工程量清单(SubcontractWorkList)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("subcontract_work_list")
public class SubcontractWorkList implements Serializable {
    private static final long serialVersionUID = -66798196886748077L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 劳务ID
    */
    private Integer laborId;
    /**
    * 工作内容
    */
    private String workContent;
    /**
    * 单位
    */
    private String unit;
    /**
    * 工程量
    */
    private Integer workCount;
    /**
    * 单价
    */
    private Double unitPrice;
    /**
    * 合价
    */
    private Double sumPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaborId() {
        return laborId;
    }

    public void setLaborId(Integer laborId) {
        this.laborId = laborId;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Integer workCount) {
        this.workCount = workCount;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

}