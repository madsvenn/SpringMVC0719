package com.huayu.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Partsrepbill {
    private Integer billid;

    private String billflag;

    private String billtype;

    private Integer partsid;

    private Integer billcount;

    private Date billtime;

    private Integer billuser;

    public Partsrepbill(Integer billid, String billflag, String billtype, Integer partsid, Integer billcount, Date billtime, Integer billuser) {
        this.billid = billid;
        this.billflag = billflag;
        this.billtype = billtype;
        this.partsid = partsid;
        this.billcount = billcount;
        this.billtime = billtime;
        this.billuser = billuser;
    }

    public Partsrepbill() {
        super();
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getBillflag() {
        return billflag;
    }

    public void setBillflag(String billflag) {
        this.billflag = billflag == null ? null : billflag.trim();
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype == null ? null : billtype.trim();
    }

    public Integer getPartsid() {
        return partsid;
    }

    public void setPartsid(Integer partsid) {
        this.partsid = partsid;
    }

    public Integer getBillcount() {
        return billcount;
    }

    public void setBillcount(Integer billcount) {
        this.billcount = billcount;
    }

    public Date getBilltime() {
        return billtime;
    }

    public void setBilltime(Date billtime) {
        this.billtime = billtime;
    }

    public Integer getBilluser() {
        return billuser;
    }

    public void setBilluser(Integer billuser) {
        this.billuser = billuser;
    }
}