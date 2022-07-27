package com.huayu.mapper;

import com.huayu.entity.Partsrepbill;
import com.huayu.entity.PartsrepbillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsrepbillMapper {
    long countByExample(PartsrepbillExample example);

    int deleteByExample(PartsrepbillExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Partsrepbill row);

    int insertSelective(Partsrepbill row);

    List<Partsrepbill> selectByExample(PartsrepbillExample example);

    Partsrepbill selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("row") Partsrepbill row, @Param("example") PartsrepbillExample example);

    int updateByExample(@Param("row") Partsrepbill row, @Param("example") PartsrepbillExample example);

    int updateByPrimaryKeySelective(Partsrepbill row);

    int updateByPrimaryKey(Partsrepbill row);

    List<Partsrepbill> selectBypartsname(Partsrepbill partsrepbill);
}