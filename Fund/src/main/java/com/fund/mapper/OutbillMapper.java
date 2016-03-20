package com.fund.mapper;

import com.fund.po.Outbill;
import com.fund.po.OutbillExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OutbillMapper {
    int countByExample(OutbillExample example);

    int deleteByExample(OutbillExample example);

    int deleteByPrimaryKey(Integer outbillId);

    int insert(Outbill record);

    int insertSelective(Outbill record);

    List<Outbill> selectByExample(OutbillExample example);

    Outbill selectByPrimaryKey(Integer outbillId);

    int updateByExampleSelective(@Param("record") Outbill record, @Param("example") OutbillExample example);

    int updateByExample(@Param("record") Outbill record, @Param("example") OutbillExample example);

    int updateByPrimaryKeySelective(Outbill record);

    int updateByPrimaryKey(Outbill record);
    
    List<Outbill> selectOutbillsByMCheckId(Map<String, Object> map)throws Exception;
}