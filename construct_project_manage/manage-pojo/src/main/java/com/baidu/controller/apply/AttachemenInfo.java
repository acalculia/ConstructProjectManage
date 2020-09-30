package com.baidu.controller.apply;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 附件文件表(AttachemenInfo)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("attachemen_info")
public class AttachemenInfo implements Serializable {
    private static final long serialVersionUID = -88787945087556075L;
    /**
    * 编码
    */
    private Integer id;
    /**
    * 文件名称
    */
    private String fileName;
    /**
    * 文件类型
    */
    private String fileType;
    /**
    * 文件路径
    */
    private String filePath;
    /**
    * 文件关联表ID
    */
    private Integer relativeId;
    /**
    * 上次时间
    */
    private Date uploadDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(Integer relativeId) {
        this.relativeId = relativeId;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

}