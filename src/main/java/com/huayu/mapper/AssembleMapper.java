package com.huayu.mapper;

import com.huayu.entity.Assemble;
import com.huayu.entity.AssembleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssembleMapper {
    long countByExample(AssembleExample example);

    int deleteByExample(AssembleExample example);

    int deleteByPrimaryKey(Integer assembleid);

    int insert(Assemble row);

    int insertSelective(Assemble row);

    List<Assemble> selectByExample(AssembleExample example);

    Assemble selectByPrimaryKey(Integer assembleid);

    int updateByExampleSelective(@Param("row") Assemble row, @Param("example") AssembleExample example);

    int updateByExample(@Param("row") Assemble row, @Param("example") AssembleExample example);

    int updateByPrimaryKeySelective(Assemble row);

    int updateByPrimaryKey(Assemble row);
}