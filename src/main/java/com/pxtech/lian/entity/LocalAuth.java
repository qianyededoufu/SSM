package com.pxtech.lian.entity;

import java.util.Date;

public class LocalAuth {
    private Long localAuthId;
    private String usename;
    private String password;
    private Date creatTime;
    private Date lastEditTime;
    private PersonInfo personInfo;

    //GET方法构造

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public String getUsename() {
        return usename;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    //SET方法构造

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
