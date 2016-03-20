package com.fund.mapper;

import com.fund.po.Donationcontact;
import com.fund.po.DonationcontactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DonationcontactMapper {
    int countByExample(DonationcontactExample example);

    int deleteByExample(DonationcontactExample example);

    int deleteByPrimaryKey(Integer donationcontactId);

    int insert(Donationcontact record);

    int insertSelective(Donationcontact record);

    List<Donationcontact> selectByExample(DonationcontactExample example);

    Donationcontact selectByPrimaryKey(Integer donationcontactId);

    int updateByExampleSelective(@Param("record") Donationcontact record, @Param("example") DonationcontactExample example);

    int updateByExample(@Param("record") Donationcontact record, @Param("example") DonationcontactExample example);

    int updateByPrimaryKeySelective(Donationcontact record);

    int updateByPrimaryKey(Donationcontact record);
}