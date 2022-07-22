package com.huayu.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Emp {
    private Integer id;

    private String name;

    private String sex;

    private Integer deptno;

    private Date hiredate;

    public Emp(Integer id, String name, String sex, Integer deptno, Date hiredate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.deptno = deptno;
        this.hiredate = hiredate;
    }

    public Emp() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}