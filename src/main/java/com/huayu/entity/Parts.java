package com.huayu.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Parts {
    private Integer partsid;

    private String partsname;

    private String partsmodel;

    private String partsloc;


    private Date partsprodate;

    private String partsremark;

    public Parts(Integer partsid, String partsname, String partsmodel, String partsloc, Date partsprodate, String partsremark) {
        this.partsid = partsid;
        this.partsname = partsname;
        this.partsmodel = partsmodel;
        this.partsloc = partsloc;
        this.partsprodate = partsprodate;
        this.partsremark = partsremark;
    }

    public Parts() {
        super();
    }

    public Integer getPartsid() {
        return partsid;
    }

    public void setPartsid(Integer partsid) {
        this.partsid = partsid;
    }

    public String getPartsname() {
        return partsname;
    }

    public void setPartsname(String partsname) {
        this.partsname = partsname == null ? null : partsname.trim();
    }

    public String getPartsmodel() {
        return partsmodel;
    }

    public void setPartsmodel(String partsmodel) {
        this.partsmodel = partsmodel == null ? null : partsmodel.trim();
    }

    public String getPartsloc() {
        return partsloc;
    }

    public void setPartsloc(String partsloc) {
        this.partsloc = partsloc == null ? null : partsloc.trim();
    }

    public Date getPartsprodate() {
        return partsprodate;
    }

    public void setPartsprodate(Date partsprodate) {
        this.partsprodate = partsprodate;
    }

    public String getPartsremark() {
        return partsremark;
    }

    public void setPartsremark(String partsremark) {
        this.partsremark = partsremark == null ? null : partsremark.trim();
    }
}