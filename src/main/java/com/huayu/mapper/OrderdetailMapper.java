package com.huayu.mapper;

import com.huayu.entity.Orderdetail;
import com.huayu.entity.OrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderdetailMapper {
    long countByExample(OrderdetailExample example);

    int deleteByExample(OrderdetailExample example);

    int deleteByPrimaryKey(Integer orderdetailid);

    int insert(Orderdetail row);

    int insertSelective(Orderdetail row);

    List<Orderdetail> selectByExample(OrderdetailExample example);

    Orderdetail selectByPrimaryKey(Integer orderdetailid);

    int updateByExampleSelective(@Param("row") Orderdetail row, @Param("example") OrderdetailExample example);

    int updateByExample(@Param("row") Orderdetail row, @Param("example") OrderdetailExample example);

    int updateByPrimaryKeySelective(Orderdetail row);

    int updateByPrimaryKey(Orderdetail row);
}