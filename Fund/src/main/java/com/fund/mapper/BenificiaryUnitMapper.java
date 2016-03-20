package com.fund.mapper;

import com.fund.po.BenificiaryUnit;
import com.fund.po.BenificiaryUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BenificiaryUnitMapper {
    int countByExample(BenificiaryUnitExample example);

    int deleteByExample(BenificiaryUnitExample example);

    int deleteByPrimaryKey(Integer bunitId);

    int insert(BenificiaryUnit record);

    int insertSelective(BenificiaryUnit record);

    List<BenificiaryUnit> selectByExample(BenificiaryUnitExample example);

    BenificiaryUnit selectByPrimaryKey(Integer bunitId);

    int updateByExampleSelective(@Param("record") BenificiaryUnit record, @Param("example") BenificiaryUnitExample example);

    int updateByExample(@Param("record") BenificiaryUnit record, @Param("example") BenificiaryUnitExample example);

    int updateByPrimaryKeySelective(BenificiaryUnit record);

    int updateByPrimaryKey(BenificiaryUnit record);
}