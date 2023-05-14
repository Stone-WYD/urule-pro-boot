package com.bstek.demo.urule.entity;

import com.bstek.demo.urule.myenum.Evaluate;
import com.bstek.urule.model.Label;

import java.util.Date;
import java.util.List;

public class StaffPhonesEvaluate {
    @Label("ID")
    private String id;

    @Label("职工姓名")
    private String staffName;

    @Label("职工工号")
    private String staffCode;

    @Label("日期")
    private Date date;

    @Label("评价")
    private Evaluate evaluate;

    @Label("接听电话记录集合")
    private List<TelephoneRecord> telephoneRecords;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Evaluate getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Evaluate evaluate) {
        this.evaluate = evaluate;
    }

    public List<TelephoneRecord> getTelephoneRecords() {
        return telephoneRecords;
    }

    public void setTelephoneRecords(List<TelephoneRecord> telephoneRecords) {
        this.telephoneRecords = telephoneRecords;
    }
}
