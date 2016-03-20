package com.fund.mapper;

import com.fund.po.MoneyCheckCustom;
import com.fund.po.MoneycheckExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneycheckMapper {
    int countByExample(MoneycheckExample example);

    int deleteByExample(MoneycheckExample example);

    int deleteByPrimaryKey(Integer moneycheckId);

    int insert(MoneyCheckCustom record);

    int insertSelective(MoneyCheckCustom record);

    List<MoneyCheckCustom> selectByExample(MoneycheckExample example);

    MoneyCheckCustom selectByPrimaryKey(Integer moneycheckId);

    int updateByExampleSelective(@Param("record") MoneyCheckCustom record, @Param("example") MoneycheckExample example);

    int updateByExample(@Param("record") MoneyCheckCustom record, @Param("example") MoneycheckExample example);

    int updateByPrimaryKeySelective(MoneyCheckCustom record);

    int updateByPrimaryKey(MoneyCheckCustom record);
}