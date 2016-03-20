package com.fund.mapper;

import com.fund.mapper.base.BaseProjectMapper;
import com.fund.po.Project;
import com.fund.po.ProjectExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProjectMapper extends BaseProjectMapper{
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}