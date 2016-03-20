package com.fund.mapper;

import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusnoticeMapper {
    int countByExample(BonusnoticeExample example);

    int deleteByExample(BonusnoticeExample example);

    int deleteByPrimaryKey(Integer bonusnoticeId);

    int insert(Bonusnotice record);

    int insertSelective(Bonusnotice record);

    List<Bonusnotice> selectByExample(BonusnoticeExample example);

    Bonusnotice selectByPrimaryKey(Integer bonusnoticeId);

    int updateByExampleSelective(@Param("record") Bonusnotice record, @Param("example") BonusnoticeExample example);

    int updateByExample(@Param("record") Bonusnotice record, @Param("example") BonusnoticeExample example);

    int updateByPrimaryKeySelective(Bonusnotice record);

    int updateByPrimaryKey(Bonusnotice record);
}