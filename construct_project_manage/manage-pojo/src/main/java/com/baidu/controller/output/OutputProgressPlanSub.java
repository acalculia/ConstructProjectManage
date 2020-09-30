package com.baidu.controller.output;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 产值进度计划子表(OutputProgressPlanSub)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("output_progress_plan_sub")
public class OutputProgressPlanSub implements Serializable {
    private static final long serialVersionUID = 796408756136834240L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 产值计划ID
    */
    private Integer outputId;
    /**
    * 清单子目
    */
    private String listSubject;
    /**
    * 单位
    */
    private String unit;
    /**
    * 工程量
    */
    private Integer tasksCount;
    /**
    * 综合单价
    */
    private Double generalPrice;
    /**
    * 合计
    */
    private Double sumAmount;
    /**
    * 编制人
    */
    private String editerId;
    /**
    * 计划日期
    */
    private Date planDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutputId() {
        return outputId;
    }

    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }

    public String getListSubject() {
        return listSubject;
    }

    public void setListSubject(String listSubject) {
        this.listSubject = listSubject;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getTasksCount() {
        return tasksCount;
    }

    public void setTasksCount(Integer tasksCount) {
        this.tasksCount = tasksCount;
    }

    public Double getGeneralPrice() {
        return generalPrice;
    }

    public void setGeneralPrice(Double generalPrice) {
        this.generalPrice = generalPrice;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

    public String getEditerId() {
        return editerId;
    }

    public void setEditerId(String editerId) {
        this.editerId = editerId;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

}