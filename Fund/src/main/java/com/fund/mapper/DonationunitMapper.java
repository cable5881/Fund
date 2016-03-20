package com.fund.mapper;

import com.fund.po.Donationunit;
import com.fund.po.DonationunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DonationunitMapper {
    int countByExample(DonationunitExample example);

    int deleteByExample(DonationunitExample example);

    int deleteByPrimaryKey(Integer donationunitId);

    int insert(Donationunit record);

    int insertSelective(Donationunit record);

    List<Donationunit> selectByExample(DonationunitExample example);

    Donationunit selectByPrimaryKey(Integer donationunitId);

    int updateByExampleSelective(@Param("record") Donationunit record, @Param("example") DonationunitExample example);

    int updateByExample(@Param("record") Donationunit record, @Param("example") DonationunitExample example);

    int updateByPrimaryKeySelective(Donationunit record);

    int updateByPrimaryKey(Donationunit record);
}