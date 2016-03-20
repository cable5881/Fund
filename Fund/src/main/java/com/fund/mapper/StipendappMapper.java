package com.fund.mapper;

import com.fund.po.StipendAppCustom;
import com.fund.po.Stipendapp;
import com.fund.po.StipendappExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StipendappMapper {
    int countByExample(StipendappExample example);

    int deleteByExample(StipendappExample example);

    int deleteByPrimaryKey(Integer stipendappId);

    int insert(Stipendapp record);

    int insertSelective(Stipendapp record);

    List<Stipendapp> selectByExample(StipendappExample example);

    Stipendapp selectByPrimaryKey(Integer stipendappId);

    int updateByExampleSelective(@Param("record") Stipendapp record, @Param("example") StipendappExample example);

    int updateByExample(@Param("record") Stipendapp record, @Param("example") StipendappExample example);

    int updateByPrimaryKeySelective(Stipendapp record);

    int updateByPrimaryKey(Stipendapp record);
    
    StipendAppCustom selectStAppByAppId(Integer appId);
    
    List<StipendAppCustom> selectStAppsByBNId(Map<String, Object> map);
    
    List<StipendAppCustom> selectUnverifiedStAppsByBNId(Map<String, Object> map);
    
    List<StipendAppCustom> selectVerifiedStAppsByBNId(Map<String, Object> map);
}