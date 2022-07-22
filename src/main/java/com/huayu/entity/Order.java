package com.huayu.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
    private Integer orderid;

    private String ordercode;

    private Date orderdate;

    private String orderflag;

    public Order(Integer orderid, String ordercode, Date orderdate, String orderflag) {
        this.orderid = orderid;
        this.ordercode = ordercode;
        this.orderdate = orderdate;
        this.orderflag = orderflag;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(String orderflag) {
        this.orderflag = orderflag == null ? null : orderflag.trim();
    }
}