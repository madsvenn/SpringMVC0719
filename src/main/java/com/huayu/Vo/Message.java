package com.huayu.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    Integer code;
    String message;
    Object date;

    public Message(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
