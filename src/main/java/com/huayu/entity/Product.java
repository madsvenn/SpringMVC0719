package com.huayu.entity;

import lombok.Data;

@Data
public class Product {
    private Integer productid;

    private String productcode;

    private String productname;

    private String productremark;

    public Product(Integer productid, String productcode, String productname, String productremark) {
        this.productid = productid;
        this.productcode = productcode;
        this.productname = productname;
        this.productremark = productremark;
    }

    public Product() {
        super();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductremark() {
        return productremark;
    }

    public void setProductremark(String productremark) {
        this.productremark = productremark == null ? null : productremark.trim();
    }
}