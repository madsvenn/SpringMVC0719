package com.huayu.entity;

import lombok.Data;

@Data
public class Assemble {
    private Integer assembleid;

    private Integer partsid;

    private Integer productid;

    private Integer partscount;

    public Assemble(Integer assembleid, Integer partsid, Integer productid, Integer partscount) {
        this.assembleid = assembleid;
        this.partsid = partsid;
        this.productid = productid;
        this.partscount = partscount;
    }

    public Assemble() {
        super();
    }

    public Integer getAssembleid() {
        return assembleid;
    }

    public void setAssembleid(Integer assembleid) {
        this.assembleid = assembleid;
    }

    public Integer getPartsid() {
        return partsid;
    }

    public void setPartsid(Integer partsid) {
        this.partsid = partsid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getPartscount() {
        return partscount;
    }

    public void setPartscount(Integer partscount) {
        this.partscount = partscount;
    }
}