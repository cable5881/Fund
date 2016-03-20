package com.fund.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fund.po.Filetype;
import com.fund.po.FiletypeExample;

public interface FiletypeMapper {
    int countByExample(FiletypeExample example);

    int deleteByExample(FiletypeExample example);

    int deleteByPrimaryKey(Integer filetypeId);

    int insert(Filetype record);

    int insertSelective(Filetype record);

    List<Filetype> selectByExample(FiletypeExample example);

    Filetype selectByPrimaryKey(Integer filetypeId);

    int updateByExampleSelective(@Param("record") Filetype record, @Param("example") FiletypeExample example);

    int updateByExample(@Param("record") Filetype record, @Param("example") FiletypeExample example);

    int updateByPrimaryKeySelective(Filetype record);

    int updateByPrimaryKey(Filetype record);
}