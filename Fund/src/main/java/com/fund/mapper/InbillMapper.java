package com.fund.mapper;

import com.fund.po.Inbill;
import com.fund.po.InbillExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface InbillMapper {
    int countByExample(InbillExample example);

    int deleteByExample(InbillExample example);

    int deleteByPrimaryKey(Integer inbillId);

    int insert(Inbill record);

    int insertSelective(Inbill record);

    List<Inbill> selectByExample(InbillExample example);

    Inbill selectByPrimaryKey(Integer inbillId);

    int updateByExampleSelective(@Param("record") Inbill record, @Param("example") InbillExample example);

    int updateByExample(@Param("record") Inbill record, @Param("example") InbillExample example);

    int updateByPrimaryKeySelective(Inbill record);

    int updateByPrimaryKey(Inbill record);
    
    List<Inbill> selectInbillsByMCheckId(Map<String, Object> map)throws Exception;
    
    List<Inbill> selectInbillByPayerOrMoneyNum(Map<String, Object> map) throws Exception;
}