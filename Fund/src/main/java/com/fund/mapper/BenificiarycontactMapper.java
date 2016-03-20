package com.fund.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fund.po.Benificiarycontact;
import com.fund.po.BenificiarycontactExample;

public interface BenificiarycontactMapper {
    int countByExample(BenificiarycontactExample example);

    int deleteByExample(BenificiarycontactExample example);

    int deleteByPrimaryKey(Integer benificiarycontactId);

    int insert(Benificiarycontact record);

    int insertSelective(Benificiarycontact record);

    List<Benificiarycontact> selectByExample(BenificiarycontactExample example);

    Benificiarycontact selectByPrimaryKey(Integer benificiarycontactId);

    int updateByExampleSelective(@Param("record") Benificiarycontact record, @Param("example") BenificiarycontactExample example);

    int updateByExample(@Param("record") Benificiarycontact record, @Param("example") BenificiarycontactExample example);

    int updateByPrimaryKeySelective(Benificiarycontact record);

    int updateByPrimaryKey(Benificiarycontact record);
}