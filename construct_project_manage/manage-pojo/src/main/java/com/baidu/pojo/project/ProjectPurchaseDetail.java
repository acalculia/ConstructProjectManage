package com.baidu.pojo.project;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 材料总计划明细(ProjectPurchaseDetail)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("project_purchase_detail")
public class ProjectPurchaseDetail implements Serializable {
    private static final long serialVersionUID = 900830609295802682L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 采购计划编号
    */
    private Object planNo;
    /**
    * 物资ID
    */
    private Integer mateId;
    /**
    * 计划总量
    */
    private Long useCount;
    /**
    * 使用部位
    */
    private String useTo;
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

    public Object getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Object planNo) {
        this.planNo = planNo;
    }

    public Integer getMateId() {
        return mateId;
    }

    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    public Long getUseCount() {
        return useCount;
    }

    public void setUseCount(Long useCount) {
        this.useCount = useCount;
    }

    public String getUseTo() {
        return useTo;
    }

    public void setUseTo(String useTo) {
        this.useTo = useTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}