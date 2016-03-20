package com.fund.mapper;

import com.fund.po.DonationModeCustom;
import com.fund.po.DonationmodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DonationmodeMapper {
    int countByExample(DonationmodeExample example);

    int deleteByExample(DonationmodeExample example);

    int deleteByPrimaryKey(Integer donationmodeId);

    int insert(DonationModeCustom record);

    int insertSelective(DonationModeCustom record);

    List<DonationModeCustom> selectByExample(DonationmodeExample example);

    DonationModeCustom selectByPrimaryKey(Integer donationmodeId);

    int updateByExampleSelective(@Param("record") DonationModeCustom record, @Param("example") DonationmodeExample example);

    int updateByExample(@Param("record") DonationModeCustom record, @Param("example") DonationmodeExample example);

    int updateByPrimaryKeySelective(DonationModeCustom record);

    int updateByPrimaryKey(DonationModeCustom record);
}