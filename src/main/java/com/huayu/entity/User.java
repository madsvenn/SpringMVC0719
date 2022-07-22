package com.huayu.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer userid;

    private String loginname;

    private String loginpwd;

    private Date logintime;

    private Integer eid;

    public User(Integer userid, String loginname, String loginpwd, Date logintime, Integer eid) {
        this.userid = userid;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
        this.logintime = logintime;
        this.eid = eid;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}