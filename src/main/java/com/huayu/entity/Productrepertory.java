package com.huayu.entity;

import lombok.Data;

@Data
public class Productrepertory {
    private Integer prorepid;

    private Integer productid;

    private Integer prorepcount;

    public Productrepertory(Integer prorepid, Integer productid, Integer prorepcount) {
        this.prorepid = prorepid;
        this.productid = productid;
        this.prorepcount = prorepcount;
    }

    public Productrepertory() {
        super();
    }

    public Integer getProrepid() {
        return prorepid;
    }

    public void setProrepid(Integer prorepid) {
        this.prorepid = prorepid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProrepcount() {
        return prorepcount;
    }

    public void setProrepcount(Integer prorepcount) {
        this.prorepcount = prorepcount;
    }
}