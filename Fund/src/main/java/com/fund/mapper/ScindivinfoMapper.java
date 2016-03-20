package com.fund.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fund.po.Scindivinfo;
import com.fund.po.ScindivinfoExample;

public interface ScindivinfoMapper {
    int countByExample(ScindivinfoExample example);

    int deleteByExample(ScindivinfoExample example);

    int deleteByPrimaryKey(Integer scindivinfoId);

    int insert(Scindivinfo record);

    int insertSelective(Scindivinfo record);

    List<Scindivinfo> selectByExample(ScindivinfoExample example);

    Scindivinfo selectByPrimaryKey(Integer scindivinfoId);

    int updateByExampleSelective(@Param("record") Scindivinfo record, @Param("example") ScindivinfoExample example);

    int updateByExample(@Param("record") Scindivinfo record, @Param("example") ScindivinfoExample example);

    int updateByPrimaryKeySelective(Scindivinfo record);

    int updateByPrimaryKey(Scindivinfo record);
}