package com.fund.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fund.po.Newstype;
import com.fund.po.NewstypeExample;

public interface NewstypeMapper {
    int countByExample(NewstypeExample example);

    int deleteByExample(NewstypeExample example);

    int deleteByPrimaryKey(Integer newstypeId);

    int insert(Newstype record);

    int insertSelective(Newstype record);

    List<Newstype> selectByExample(NewstypeExample example);

    Newstype selectByPrimaryKey(Integer newstypeId);

    int updateByExampleSelective(@Param("record") Newstype record, @Param("example") NewstypeExample example);

    int updateByExample(@Param("record") Newstype record, @Param("example") NewstypeExample example);

    int updateByPrimaryKeySelective(Newstype record);

    int updateByPrimaryKey(Newstype record);
}