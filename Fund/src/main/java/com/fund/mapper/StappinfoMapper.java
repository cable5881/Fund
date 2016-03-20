package com.fund.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fund.po.Stappinfo;
import com.fund.po.StappinfoExample;

public interface StappinfoMapper {
    int countByExample(StappinfoExample example);

    int deleteByExample(StappinfoExample example);

    int deleteByPrimaryKey(Integer stappinfoId);

    int insert(Stappinfo record);

    int insertSelective(Stappinfo record);

    List<Stappinfo> selectByExample(StappinfoExample example);

    Stappinfo selectByPrimaryKey(Integer stappinfoId);

    int updateByExampleSelective(@Param("record") Stappinfo record, @Param("example") StappinfoExample example);

    int updateByExample(@Param("record") Stappinfo record, @Param("example") StappinfoExample example);

    int updateByPrimaryKeySelective(Stappinfo record);

    int updateByPrimaryKey(Stappinfo record);
}