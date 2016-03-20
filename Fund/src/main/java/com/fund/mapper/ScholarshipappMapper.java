package com.fund.mapper;

import com.fund.po.ScholarshipAppCustom;
import com.fund.po.Scholarshipapp;
import com.fund.po.ScholarshipappExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ScholarshipappMapper {
    int countByExample(ScholarshipappExample example);

    int deleteByExample(ScholarshipappExample example);

    int deleteByPrimaryKey(Integer scholarshipappId);

    int insert(Scholarshipapp record);

    int insertSelective(Scholarshipapp record);

    List<Scholarshipapp> selectByExample(ScholarshipappExample example);

    Scholarshipapp selectByPrimaryKey(Integer scholarshipappId);

    int updateByExampleSelective(@Param("record") Scholarshipapp record, @Param("example") ScholarshipappExample example);

    int updateByExample(@Param("record") Scholarshipapp record, @Param("example") ScholarshipappExample example);

    int updateByPrimaryKeySelective(Scholarshipapp record);

    int updateByPrimaryKey(Scholarshipapp record);
    
    ScholarshipAppCustom selectScAppByAppId(Integer appId);
    
    List<ScholarshipAppCustom> selectScAppsByBNId(Map<String, Object> map);
    
    List<ScholarshipAppCustom> selectUnverifiedScAppsByBNoticeId(Map<String, Object> map)throws Exception;//根据评审通知查找未审核的奖学金申请表
    List<ScholarshipAppCustom> selectVerifiedScAppsByBNoticeId(Map<String, Object> map)throws Exception;//根据评审通知查找已审核的奖学金申请表
}