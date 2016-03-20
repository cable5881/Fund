package com.fund.service;

import java.util.List;

import com.fund.po.BenificiaryUnit;
import com.fund.po.Bonusnotice;
import com.fund.po.Fundtype;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Projecttype;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.custom.ProjectCustom;
import com.fund.utils.Page;

public interface ProjectService {
	void insertProject(ProjectCustom proejct,Integer mode,String filePathPrefix)throws Exception;
	List<Projecttype> findProjectTypes()throws Exception;
	List<Fundtype> findAllFundTypes() throws Exception;
	List<Fundtype> findFundTypesByPid(Integer pTypeId)throws Exception;
	Fundtype findFundTypeByFid(Integer fTypeId)throws Exception;
	void updateProject(ProjectCustom newProject,ProjectCustom oldProject,Integer mode,String filePathPrefix) throws Exception;
	List<NewsUrlCustom> findNewsUrlByPid(Integer projectId)throws Exception;
	Bonusnotice findBonusNoticeByPid(Integer projectId)throws Exception;
	void deleteNewsUrl(Integer newsUrlId) throws Exception;
	Integer getProjectsCountByUserId(Integer userId)throws Exception;
	Integer getAllProjectsCount()throws Exception;
	List<ProjectCustom> findProjectsByUserId(Integer userId,Page page)throws Exception;
	List<ProjectCustom> findAllProjects(Page page)throws Exception;
	ProjectCustom findProjectByPid(Integer projectId)throws Exception;
	List<ProjectCustom> findUnverifiedProtocolProjects(Page page)throws Exception;
	List<ProjectCustom> findVerifiedProtocolProjects(Page page)throws Exception;
	int getScAppsCountByBNId(Integer bNoticeId)throws Exception;
	int getStAppsCountByBNId(Integer bNoticeId)throws Exception;
	List<ScholarshipAppCustom> findScAppsByBNoticeId(Integer bNoticeId,Page page)throws Exception;
	List<StipendAppCustom> findStAppsByBNoticeId(Integer bNoticeId,Page page) throws Exception;
	
	void deleteProjectByPid(Integer projectId)throws Exception;
	List<ProjectCustom> findBonusProjectsByUserId(Integer userId,Page page)throws Exception;
	int getBonusProjectsCountByUserId(Integer userId)throws Exception;
	boolean isProjectExist(Integer projectId)throws Exception;
	int getPassedProjectsCount()throws Exception;
	int getDonorProjectsByDId(int donationuserId) throws Exception;
	List<ProjectCustom> findDonorProjectsByDId(Integer donationuserId, Page page) throws Exception;
	List<BenificiaryUnit> findAllBUnits()throws Exception;
}
