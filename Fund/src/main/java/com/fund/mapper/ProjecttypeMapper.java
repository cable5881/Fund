package com.fund.mapper;

import com.fund.po.Projecttype;
import com.fund.po.ProjecttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjecttypeMapper {
    int countByExample(ProjecttypeExample example);

    int deleteByExample(ProjecttypeExample example);

    int deleteByPrimaryKey(Integer projecttypeId);

    int insert(Projecttype record);

    int insertSelective(Projecttype record);

    List<Projecttype> selectByExample(ProjecttypeExample example);

    Projecttype selectByPrimaryKey(Integer projecttypeId);

    int updateByExampleSelective(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByExample(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByPrimaryKeySelective(Projecttype record);

    int updateByPrimaryKey(Projecttype record);
}