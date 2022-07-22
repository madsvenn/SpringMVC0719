package com.huayu.mapper;

import com.huayu.entity.Productrepertory;
import com.huayu.entity.ProductrepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductrepertoryMapper {
    long countByExample(ProductrepertoryExample example);

    int deleteByExample(ProductrepertoryExample example);

    int deleteByPrimaryKey(Integer prorepid);

    int insert(Productrepertory row);

    int insertSelective(Productrepertory row);

    List<Productrepertory> selectByExample(ProductrepertoryExample example);

    Productrepertory selectByPrimaryKey(Integer prorepid);

    int updateByExampleSelective(@Param("row") Productrepertory row, @Param("example") ProductrepertoryExample example);

    int updateByExample(@Param("row") Productrepertory row, @Param("example") ProductrepertoryExample example);

    int updateByPrimaryKeySelective(Productrepertory row);

    int updateByPrimaryKey(Productrepertory row);
}