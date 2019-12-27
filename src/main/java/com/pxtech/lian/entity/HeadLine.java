package com.pxtech.lian.entity;

import java.util.Date;

public class HeadLine {
    private  Long lineId;
    private  String lineName;
    private String linLink;
    private String lineImg;
    //头条的权重
    private Integer priority;
    //0 为不可用 1 为可用
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    //GET方法构造

    public Long getLineId() {

        return lineId;
    }

    public String getLineName() {

        return lineName;
    }

    public String getLinLink() {

        return linLink;
    }

    public String getLineImg() {

        return lineImg;
    }

    public Integer getPriority() {

        return priority;
    }

    public Integer getEnableStatus() {

        return enableStatus;
    }

    public Date getCreateTime() {

        return createTime;
    }

    public Date getLastEditTime() {

        return lastEditTime;
    }

    //SET方法构造

    public void setLineId(Long lineId) {

        this.lineId = lineId;
    }

    public void setLineName(String lineName) {

        this.lineName = lineName;
    }

    public void setLinLink(String linLink) {

        this.linLink = linLink;
    }

    public void setLineImg(String lineImg) {

        this.lineImg = lineImg;
    }

    public void setPriority(Integer priority) {

        this.priority = priority;
    }

    public void setEnableStatus(Integer enableStatus) {

        this.enableStatus = enableStatus;
    }

    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }

    public void setLastEditTime(Date lastEditTime) {

        this.lastEditTime = lastEditTime;
    }
}
