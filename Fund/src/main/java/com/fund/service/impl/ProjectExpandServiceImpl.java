package com.fund.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.ProjectException;
import com.fund.mapper.CountsMapper;
import com.fund.mapper.FilesMapper;
import com.fund.mapper.ProjectMapper;
import com.fund.mapper.ProtocolMapper;
import com.fund.po.DonationModeCustom;
import com.fund.po.Files;
import com.fund.po.Protocol;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.ProjectExpandService;
import com.fund.utils.CnUpperCaser;
import com.fund.utils.DateUtil;
import com.fund.utils.NumberUtil;
import com.fund.utils.Page;
import com.fund.utils.UrlUtil;
import com.fund.utils.WordUtil;

@Service
public class ProjectExpandServiceImpl implements ProjectExpandService {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private CountsMapper countsMapper;
	@Autowired
	private FilesMapper filesMapper;
	@Autowired
	private ProtocolMapper protocolMapper;
	
	/*
	 * 更新立项,审核通过或者失败,更新项目编号，并生成捐赠协议
	 */
	@Override
	public void examineProject(ProjectCustom project,String filePathPrefix) throws Exception {
		try {
			ProjectCustom p = new ProjectCustom();
			p.setIsPassed(project.getIsPassed());
			p.setProjectId(project.getProjectId());
			p.setProjectNum(project.getProjectNum());
			
			if(project.getIsPassed()==2){
				generateProtocol(project,filePathPrefix);//如果通过立项表则生成捐赠协议
				p.setProtocolId(project.getProtocolId());//得到捐赠协议的id后还要更新到立项表的protocolId列上
			}
			updateProject(p);
			
		} catch (Exception e) {
			logger.error("examineProject failed!", e);
			throw new ProjectException("审核立项失败！");
		}
	}

	/**
	 * @Description: 查找所有未审核的立项
	 * @author:JackBauer
	 * @Date:2015年10月19日下午6:52:24
	 */
	@Override
	public List<ProjectCustom> findUnverifiedProjects(Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("page", page);
			return projectMapper.selectUnverifiedProjects(map);
		} catch (Exception e) {
			logger.error("findUnverifiedProjects failed!", e);
			return null;
		}
		
	}

	/**
	 * @Description: 查找所有已审核的立项
	 * @author:JackBauer
	 * @Date:2015年10月19日下午6:52:24
	 */
	@Override
	public List<ProjectCustom> findVerifiedProjects(Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("page", page);
			return projectMapper.selectVerifiedProjects(map);
		} catch (Exception e) {
			logger.error("findVerifiedProjects failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 获取未审核的立项总数
	 * @author:JackBauer
	 * @Date:2015年10月24日下午2:56:16
	 */
	@Override
	public int getUnverifiedProjectsCount() throws Exception {
		try {
			return countsMapper.selectUnverifiedProjectsCount();
		} catch (Exception e) {
			logger.error("getUnverifiedProjectsCount failed!", e);
			return 0;
		}
	}

	/**
	 * @Description: 获取已审核的立项总数
	 * @author:JackBauer
	 * @Date:2015年10月24日下午2:56:37
	 */
	@Override
	public int getVerifiedProjectsCount() throws Exception {
		try {
			return countsMapper.selectVerifiedProjectsCount();
		} catch (Exception e) {
			logger.error("getUnverifiedProjectsCount failed!", e);
			return 0;
		}
	}
	
	
	
	/**
	 * @Description: 生成捐赠协议
	 * @author:JackBauer
	 * @Date:2015年8月20日下午9:59:17
	 */
	public Protocol generateProtocol(ProjectCustom project,String filePathPrefix)throws Exception{
		Protocol protocol = new Protocol();
		Integer fundTypeId = project.getFundtypeId();
		
		File doc = null;
		
		if(fundTypeId==1 || fundTypeId==2 || fundTypeId==7){
			doc = WordUtil.createDoc(UrlUtil.getFileDir(filePathPrefix),UrlUtil.getNewFileName(),getProtocolParams(project),"Scholarship");
		}else{
			doc = WordUtil.createDoc(UrlUtil.getFileDir(filePathPrefix),UrlUtil.getNewFileName(),getProtocolParams(project),"Development");
		}
		
		Files file = null;
		if(doc!=null){
			file = new Files();
			file.setSource(doc.getAbsolutePath());
//			file.setFileTitle(doc.getName());
			file.setProjectId(project.getProjectId());
			file.setFiletypeId(1);
			file.setNotes("捐赠协议");
			filesMapper.insertSelective(file);
			protocol.setFileId(file.getFileId());
		}
		protocolMapper.insertSelective(protocol);
		
		project.setProtocolId(protocol.getProtocolId());
		return protocol;
	}
	
	/**
	 * @Description: 生成要填充到word模板的参数，存在map中
	 * @author:JackBauer
	 * @Date:2015年8月20日下午9:56:42
	 */
	public Map<String, Object> getProtocolParams(ProjectCustom project)throws Exception{
		Map<String, Object> dataMap = new HashMap<String, Object>();
		DonationModeCustom donationMode = project.getDonationMode();
		
		if(project.getIsUnit()==1){
			dataMap.put("donationName", project.getDonationUnit().getDuName());
		}else{
			dataMap.put("donationName", project.getDonor().getdName());
		}
		dataMap.put("projectName", project.getProjectName());
		dataMap.put("span", donationMode.getSpan()+"");
		dataMap.put("leader", project.getLeader());
		
		String amount = NumberUtil.MoneyConvert(donationMode.getAmount());
		dataMap.put("CN_Amount", new CnUpperCaser(amount).getCnString());
		dataMap.put("totalAmount", amount);
		dataMap.put("yearAmount", amount);
		
		Double adminFee = Double.parseDouble(amount)*0.1;
		dataMap.put("adminFee",adminFee.intValue()+"");
		
		String dateString = DateUtil.dateToStr(donationMode.getExecuteTime(),"yyyy-MM-dd");
		String[] datePaerts = dateString.split("-");
		dataMap.put("year", datePaerts[0]);
		dataMap.put("month", datePaerts[1]);
		dataMap.put("day", datePaerts[2]);
				
		return dataMap;
	}

	/**
	 * @Description: 更新project
	 * @author:JackBauer
	 * @Date:2015年10月24日下午2:49:37
	 */
	@Override
	public void updateProject(ProjectCustom project) throws Exception {
		try {
			projectMapper.updateByPrimaryKeySelective(project);
		} catch (Exception e) {
			logger.error("updateProject failed!", e);
			throw e;
		}
	}

}
