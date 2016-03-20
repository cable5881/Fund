package com.fund.service;

import java.util.List;

import com.fund.po.custom.ProjectCustom;
import com.fund.utils.Page;

public interface ProjectExpandService {
	List<ProjectCustom> findUnverifiedProjects(Page page)throws Exception;
	List<ProjectCustom> findVerifiedProjects(Page page)throws Exception;
	int getUnverifiedProjectsCount()throws Exception;
	int getVerifiedProjectsCount()throws Exception;
	void examineProject(ProjectCustom project,String filePathPrefix) throws Exception;
	void updateProject(ProjectCustom project) throws Exception;
}
