package com.fund.mapper;

import com.fund.po.Protocol;
import com.fund.po.ProtocolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolMapper {
    int countByExample(ProtocolExample example);

    int deleteByExample(ProtocolExample example);

    int deleteByPrimaryKey(Integer protocolId);

    int insert(Protocol record);

    int insertSelective(Protocol record);

    List<Protocol> selectByExample(ProtocolExample example);

    Protocol selectByPrimaryKey(Integer protocolId);

    int updateByExampleSelective(@Param("record") Protocol record, @Param("example") ProtocolExample example);

    int updateByExample(@Param("record") Protocol record, @Param("example") ProtocolExample example);

    int updateByPrimaryKeySelective(Protocol record);

    int updateByPrimaryKey(Protocol record);
}