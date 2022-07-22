package com.huayu.entity;

import lombok.Data;

@Data
public class Orderdetail {
    private Integer orderdetailid;

    private Integer partsid;

    private Integer orderid;

    private Integer orderpartscount;

    public Orderdetail(Integer orderdetailid, Integer partsid, Integer orderid, Integer orderpartscount) {
        this.orderdetailid = orderdetailid;
        this.partsid = partsid;
        this.orderid = orderid;
        this.orderpartscount = orderpartscount;
    }

    public Orderdetail() {
        super();
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Integer getPartsid() {
        return partsid;
    }

    public void setPartsid(Integer partsid) {
        this.partsid = partsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderpartscount() {
        return orderpartscount;
    }

    public void setOrderpartscount(Integer orderpartscount) {
        this.orderpartscount = orderpartscount;
    }
}