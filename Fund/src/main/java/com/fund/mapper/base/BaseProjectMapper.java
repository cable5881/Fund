package com.fund.mapper.base;

import com.fund.po.ProjectExample;
import com.fund.po.custom.ProjectCustom;
import java.util.List;
import java.util.Map;

public interface BaseProjectMapper{
	
	List<ProjectCustom> selectByExampleCustom(ProjectExample example);

    int updateByPrimaryKeySelective(ProjectCustom record);

    List<ProjectCustom> selectProjectsByUid(Map<String, Object> params);
    
    List<ProjectCustom> selectBonusProjectsByUid(Map<String, Object> params);
    
    List<ProjectCustom> selectAllProjects(Map<String, Object> params);
    
    List<ProjectCustom> selectUnverifiedProtocolProjects(Map<String, Object> params);
    
    List<ProjectCustom> selectVerifiedProtocolProjects(Map<String, Object> params);
    
    List<ProjectCustom> selectUnverifiedProjects(Map<String, Object> map);
    
    List<ProjectCustom> selectVerifiedProjects(Map<String, Object> map);
    
    List<ProjectCustom> selectMoneyProjects(Map<String, Object> params);

	List<ProjectCustom> selectProjectsByDid(Map<String, Object> map);
}