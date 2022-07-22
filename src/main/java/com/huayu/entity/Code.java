package com.huayu.entity;

import lombok.Data;

@Data
public class Code {
    private String code;

    private String name;

    private String type;

    public Code(String code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public Code() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}