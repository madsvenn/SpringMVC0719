package com.huayu.mapper;

import com.huayu.entity.Partsrepertory;
import com.huayu.entity.PartsrepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsrepertoryMapper {
    long countByExample(PartsrepertoryExample example);

    int deleteByExample(PartsrepertoryExample example);

    int deleteByPrimaryKey(Integer partsrepid);

    int insert(Partsrepertory row);

    int insertSelective(Partsrepertory row);

    List<Partsrepertory> selectByExample(PartsrepertoryExample example);

    Partsrepertory selectByPrimaryKey(Integer partsrepid);

    int updateByExampleSelective(@Param("row") Partsrepertory row, @Param("example") PartsrepertoryExample example);

    int updateByExample(@Param("row") Partsrepertory row, @Param("example") PartsrepertoryExample example);

    int updateByPrimaryKeySelective(Partsrepertory row);

    int updateByPrimaryKey(Partsrepertory row);
}