package com.huayu.mapper;

import com.huayu.entity.Parts;
import com.huayu.entity.PartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsMapper {
    long countByExample(PartsExample example);

    int deleteByExample(PartsExample example);

    int deleteByPrimaryKey(Integer partsid);

    int insert(Parts row);

    int insertSelective(Parts row);

    List<Parts> selectByExample(PartsExample example);

    Parts selectByPrimaryKey(Integer partsid);

    int updateByExampleSelective(@Param("row") Parts row, @Param("example") PartsExample example);

    int updateByExample(@Param("row") Parts row, @Param("example") PartsExample example);

    int updateByPrimaryKeySelective(Parts row);

    int updateByPrimaryKey(Parts row);
}