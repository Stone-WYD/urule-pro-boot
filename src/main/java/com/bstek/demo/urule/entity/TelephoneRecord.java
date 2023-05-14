package com.bstek.demo.urule.entity;

import com.bstek.urule.model.Label;

import java.util.Date;

public class TelephoneRecord {

    @Label("ID")
    private String id;

    @Label("职工姓名")
    private String staffName;

    @Label("职工工号")
    private String staffCode;

    @Label("接听时间")
    private Date receiveTime;

    @Label("通话秒数")
    private Long talkSeconds;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Long getTalkSeconds() {
        return talkSeconds;
    }

    public void setTalkSeconds(Long talkSeconds) {
        this.talkSeconds = talkSeconds;
    }

}
