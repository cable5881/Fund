package com.fund.mapper;

import com.fund.po.Fundtype;
import com.fund.po.FundtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundtypeMapper {
    int countByExample(FundtypeExample example);

    int deleteByExample(FundtypeExample example);

    int deleteByPrimaryKey(Integer fundtypeId);

    int insert(Fundtype record);

    int insertSelective(Fundtype record);

    List<Fundtype> selectByExample(FundtypeExample example);

    Fundtype selectByPrimaryKey(Integer fundtypeId);

    int updateByExampleSelective(@Param("record") Fundtype record, @Param("example") FundtypeExample example);

    int updateByExample(@Param("record") Fundtype record, @Param("example") FundtypeExample example);

    int updateByPrimaryKeySelective(Fundtype record);

    int updateByPrimaryKey(Fundtype record);
}