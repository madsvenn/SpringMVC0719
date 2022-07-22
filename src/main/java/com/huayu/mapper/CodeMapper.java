package com.huayu.mapper;

import com.huayu.entity.Code;
import com.huayu.entity.CodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeMapper {
    long countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int deleteByPrimaryKey(String code);

    int insert(Code row);

    int insertSelective(Code row);

    List<Code> selectByExample(CodeExample example);

    Code selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("row") Code row, @Param("example") CodeExample example);

    int updateByExample(@Param("row") Code row, @Param("example") CodeExample example);

    int updateByPrimaryKeySelective(Code row);

    int updateByPrimaryKey(Code row);
}