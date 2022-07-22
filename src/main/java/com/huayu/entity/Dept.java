package com.huayu.entity;

import lombok.Data;

@Data
public class Dept {
    private Integer deptno;

    private String dname;

    public Dept(Integer deptno, String dname) {
        this.deptno = deptno;
        this.dname = dname;
    }

    public Dept() {
        super();
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}