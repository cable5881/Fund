package com.fund.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fund.po.Scappinfo;
import com.fund.po.ScappinfoExample;

public interface ScappinfoMapper {
    int countByExample(ScappinfoExample example);

    int deleteByExample(ScappinfoExample example);

    int deleteByPrimaryKey(Integer scappinfoId);

    int insert(Scappinfo record);

    int insertSelective(Scappinfo record);

    List<Scappinfo> selectByExample(ScappinfoExample example);

    Scappinfo selectByPrimaryKey(Integer scappinfoId);

    int updateByExampleSelective(@Param("record") Scappinfo record, @Param("example") ScappinfoExample example);

    int updateByExample(@Param("record") Scappinfo record, @Param("example") ScappinfoExample example);

    int updateByPrimaryKeySelective(Scappinfo record);

    int updateByPrimaryKey(Scappinfo record);
}