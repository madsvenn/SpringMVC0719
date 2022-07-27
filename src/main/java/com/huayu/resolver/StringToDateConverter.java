package com.huayu.resolver;

import com.huayu.entity.User;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        User u = new User();
        

        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            return null;
        }
    }

}
