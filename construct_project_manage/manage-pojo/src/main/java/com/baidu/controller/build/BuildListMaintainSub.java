package com.baidu.controller.build;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 施工清单维护子表(BuildListMaintainSub)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("build_list_maintain_sub")
public class BuildListMaintainSub implements Serializable {
    private static final long serialVersionUID = 444189818249123636L;
    /**
    * 施工工序编号
    */
    private String buildNo;
    /**
    * 施工清单ID
    */
    private Integer maintainId;
    /**
    * 施工工序名称
    */
    private String buildName;
    /**
    * 预计工程量
    */
    private Integer tasksCount;
    /**
    * 备注
    */
    private String comment;


    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    public Integer getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(Integer maintainId) {
        this.maintainId = maintainId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public Integer getTasksCount() {
        return tasksCount;
    }

    public void setTasksCount(Integer tasksCount) {
        this.tasksCount = tasksCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}