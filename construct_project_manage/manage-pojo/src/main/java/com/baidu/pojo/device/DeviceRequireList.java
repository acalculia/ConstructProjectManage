package com.baidu.pojo.device;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 设备需求明细(DeviceRequireList)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("device_require_list")
public class DeviceRequireList implements Serializable {
    private static final long serialVersionUID = -79142156476394822L;
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
    * 需用量
    */
    private Integer useCount;
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

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}