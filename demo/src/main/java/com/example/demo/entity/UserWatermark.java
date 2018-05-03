package com.example.demo.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ${table.tableComment}
 *
 * @author ${author}
 * @version $v: ${version}, $time:${datetime} Exp $
 */
@Entity
@Table(name="user_watermark")
public class UserWatermark implements Serializable {

/** 主键 **/
    @Id
    @Column(name="ID" ,length=100)
    private String id;

/** 用户ID **/
    @Column(name="USER_ID",nullable=true ,length=100)
    private String userId;

/** 图片地址 **/
    @Column(name="PIC_URL",nullable=true ,length=200)
    private String picUrl;

    /** 印章名称 **/
    @Column(name="SEAL_NAME ",nullable=true ,length=200)
    private String sealName;

    /** 状态 **/
    @Column(name="STATUS",nullable=true ,length=200)
    private String status;

    /** 上传人 **/
    @Column(name="CREATE_USER",nullable=true ,length=200)
    private String createUser;

    /** 上传时间 **/
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATE_DATE",nullable=true )
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getSealName() {
        return sealName;
    }

    public void setSealName(String sealName) {
        this.sealName = sealName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


}
