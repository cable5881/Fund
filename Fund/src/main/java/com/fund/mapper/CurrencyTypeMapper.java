package com.fund.mapper;

import com.fund.po.CurrencyType;
import com.fund.po.CurrencyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyTypeMapper {
    int countByExample(CurrencyTypeExample example);

    int deleteByExample(CurrencyTypeExample example);

    int deleteByPrimaryKey(Integer currencytypeId);

    int insert(CurrencyType record);

    int insertSelective(CurrencyType record);

    List<CurrencyType> selectByExample(CurrencyTypeExample example);

    CurrencyType selectByPrimaryKey(Integer currencytypeId);

    int updateByExampleSelective(@Param("record") CurrencyType record, @Param("example") CurrencyTypeExample example);

    int updateByExample(@Param("record") CurrencyType record, @Param("example") CurrencyTypeExample example);

    int updateByPrimaryKeySelective(CurrencyType record);

    int updateByPrimaryKey(CurrencyType record);
}