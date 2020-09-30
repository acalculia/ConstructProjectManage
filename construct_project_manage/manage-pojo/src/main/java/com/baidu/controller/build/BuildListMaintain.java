package com.baidu.controller.build;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 施工清单维护主表(BuildListMaintain)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("build_list_maintain")
public class BuildListMaintain implements Serializable {
    private static final long serialVersionUID = 853363788397646778L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 项目ID
    */
    private Integer pId;
    /**
    * 维护主题
    */
    private String mSubject;
    /**
    * 维护人
    */
    private String maintainer;
    /**
    * 维护日期
    */
    private Date mDate;
    /**
    * 附件
    */
    private String attachIds;


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

    public String getMSubject() {
        return mSubject;
    }

    public void setMSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public Date getMDate() {
        return mDate;
    }

    public void setMDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getAttachIds() {
        return attachIds;
    }

    public void setAttachIds(String attachIds) {
        this.attachIds = attachIds;
    }

}