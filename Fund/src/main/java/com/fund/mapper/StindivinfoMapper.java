package com.fund.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fund.po.Stindivinfo;
import com.fund.po.StindivinfoExample;

public interface StindivinfoMapper {
    int countByExample(StindivinfoExample example);

    int deleteByExample(StindivinfoExample example);

    int deleteByPrimaryKey(Integer stindivinfoId);

    int insert(Stindivinfo record);

    int insertSelective(Stindivinfo record);

    List<Stindivinfo> selectByExample(StindivinfoExample example);

    Stindivinfo selectByPrimaryKey(Integer stindivinfoId);

    int updateByExampleSelective(@Param("record") Stindivinfo record, @Param("example") StindivinfoExample example);

    int updateByExample(@Param("record") Stindivinfo record, @Param("example") StindivinfoExample example);

    int updateByPrimaryKeySelective(Stindivinfo record);

    int updateByPrimaryKey(Stindivinfo record);
}