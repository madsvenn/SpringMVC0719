package com.huayu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Partsrepbill {
    private Integer billid;

    private String billflag;

    @TableField(exist = false)
    private String codename;

    @TableField(exist = false)
    private String typename;

    private String billtype;

    private Integer partsid;

    @TableField
    private String partsname;

    private Integer billcount;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date billtime;

    private Integer billuser;

    @TableField(exist = false)
    private String loginname;

//    public Partsrepbill(Integer billid, String billflag, String billtype, Integer partsid, Integer billcount, Date billtime, Integer billuser) {
//        this.billid = billid;
//        this.billflag = billflag;
//        this.billtype = billtype;
//        this.partsid = partsid;
//        this.billcount = billcount;
//        this.billtime = billtime;
//        this.billuser = billuser;
//    }
//
//    public Partsrepbill() {
//        super();
//    }

}