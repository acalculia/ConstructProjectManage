package com.baidu.controller.build;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 施工进度计划(BuildProgressPlan)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("build_progress_plan")
public class BuildProgressPlan implements Serializable {
    private static final long serialVersionUID = 529309312386664380L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 施工主任务
    */
    private String mainTask;
    /**
    * 施工子任务
    */
    private String subTask;
    /**
    * 开始日期
    */
    private Date startDate;
    /**
    * 结算日期
    */
    private Date endDate;


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

    public String getMainTask() {
        return mainTask;
    }

    public void setMainTask(String mainTask) {
        this.mainTask = mainTask;
    }

    public String getSubTask() {
        return subTask;
    }

    public void setSubTask(String subTask) {
        this.subTask = subTask;
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

}