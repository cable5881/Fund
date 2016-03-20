package com.fund.mapper;

import com.fund.po.Donor;
import com.fund.po.DonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DonorMapper {
    int countByExample(DonorExample example);

    int deleteByExample(DonorExample example);

    int deleteByPrimaryKey(Integer donorId);

    int insert(Donor record);

    int insertSelective(Donor record);

    List<Donor> selectByExample(DonorExample example);

    Donor selectByPrimaryKey(Integer donorId);

    int updateByExampleSelective(@Param("record") Donor record, @Param("example") DonorExample example);

    int updateByExample(@Param("record") Donor record, @Param("example") DonorExample example);

    int updateByPrimaryKeySelective(Donor record);

    int updateByPrimaryKey(Donor record);
}