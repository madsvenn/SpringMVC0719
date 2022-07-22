package com.huayu.entity;

import lombok.Data;

@Data
public class Partsrepertory {
    private Integer partsrepid;

    private Integer partsid;

    private Integer partsreqcount;

    public Partsrepertory(Integer partsrepid, Integer partsid, Integer partsreqcount) {
        this.partsrepid = partsrepid;
        this.partsid = partsid;
        this.partsreqcount = partsreqcount;
    }

    public Partsrepertory() {
        super();
    }

    public Integer getPartsrepid() {
        return partsrepid;
    }

    public void setPartsrepid(Integer partsrepid) {
        this.partsrepid = partsrepid;
    }

    public Integer getPartsid() {
        return partsid;
    }

    public void setPartsid(Integer partsid) {
        this.partsid = partsid;
    }

    public Integer getPartsreqcount() {
        return partsreqcount;
    }

    public void setPartsreqcount(Integer partsreqcount) {
        this.partsreqcount = partsreqcount;
    }
}