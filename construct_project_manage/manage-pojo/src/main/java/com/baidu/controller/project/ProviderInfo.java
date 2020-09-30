package com.baidu.controller.project;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 供应商信息表(ProviderInfo)实体类
 *
 * @author makejava
 * @since 2020-09-29 15:19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("provider_info")
public class ProviderInfo implements Serializable {
    private static final long serialVersionUID = -48817123171602411L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 供应商名称
    */
    private String providerName;
    /**
    * 类型
    */
    private String type;
    /**
    * 负责人
    */
    private String principal;
    /**
    * 负责人电话
    */
    private String principalPhone;
    /**
    * 热责人微信
    */
    private String principalWchat;
    /**
    * 创建时间
    */
    private Date updateDate;
    /**
    * 创建人
    */
    private String updateUser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalPhone() {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone) {
        this.principalPhone = principalPhone;
    }

    public String getPrincipalWchat() {
        return principalWchat;
    }

    public void setPrincipalWchat(String principalWchat) {
        this.principalWchat = principalWchat;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

}