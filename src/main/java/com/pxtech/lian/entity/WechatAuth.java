package com.pxtech.lian.entity;

import java.util.Date;

public class WechatAuth {
    private  Long wechatAuthId;
    private String openId;
    private Date creatTime;
    //关联新建的用户实体类
    private PersonInfo personInfo;

    //GET方法构造
    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    //SET方法构造

    public void setWechatAuthId(Long wechatAuthId) {

        this.wechatAuthId = wechatAuthId;
    }

    public void setOpenId(String openId) {

        this.openId = openId;
    }

    public void setCreatTime(Date creatTime) {

        this.creatTime = creatTime;
    }

    public void setPersonInfo(PersonInfo personInfo) {

        this.personInfo = personInfo;
    }
}
