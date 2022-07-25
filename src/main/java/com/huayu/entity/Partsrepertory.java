package com.huayu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partsrepertory {
    private Integer partsrepid;

    private Integer partsid;

    private Integer partsreqcount;

    /*
    数据库中没有的字段
     */
    @TableField(exist = false)
    private String partsname;

    public Partsrepertory(Integer partsrepid,Integer partsid,Integer partsreqcount){
        this.partsrepid = partsrepid;
        this.partsid = partsid;
        this.partsreqcount = partsreqcount;
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