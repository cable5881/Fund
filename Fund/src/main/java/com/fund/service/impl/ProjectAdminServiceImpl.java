package com.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.NewsUrlException;
import com.fund.exception.ProtocolException;
import com.fund.mapper.NewsurlMapper;
import com.fund.mapper.ProtocolMapper;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newsurl;
import com.fund.po.NewsurlExample;
import com.fund.po.Protocol;
import com.fund.service.ProjectAdminService;
import com.fund.utils.Page;

@Service
public class ProjectAdminServiceImpl implements ProjectAdminService {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ProtocolMapper protocolMapper;
	@Autowired
	private NewsurlMapper newsUrlMapper;
	
	/*
	 * 更新捐赠协议，审核通过或者失败
	 */
	@Override
	public void updateProtocal(Protocol protocol) throws Exception {
		try {
			protocolMapper.updateByPrimaryKeySelective(protocol);
		} catch (Exception e) {
			logger.error("updateProtocal failed!", e);
			throw new ProtocolException("更新捐赠协议失败！");
		}
	}

	/*
	 * 更新新闻链接，审核通过或者失败
	 */
	@Override
	public void updateNewsUrl(Newsurl newsurl) throws Exception {
		try {
			newsUrlMapper.updateByPrimaryKeySelective(newsurl);
		} catch (Exception e) {
			logger.error("updateNewsUrl failed!", e);
			throw new NewsUrlException("更新新闻链接失败！");
		}
	}

	/**
	 * @Description: 根据立项id找出对应的未审核的新闻链接
	 * @author:JackBauer
	 * @Date:2015年9月18日下午8:41:43
	 */
	@Override
	public List<NewsUrlCustom> findUnverifiedNewsUrlsByPid(Page page, Integer projectId) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("page", page);
		map.put("projectId", projectId);
		map.put("order", "upload_Time desc");
		return newsUrlMapper.selectUnverifiedNewsUrl(map);
	}

	/**
	 * 
	 * @Description: 根据立项id找出对应的已审核的新闻链接
	 * @author:JackBauer
	 * @Date:2015年9月18日下午8:41:43
	 */
	@Override
	public List<NewsUrlCustom> findVerifiedNewsUrlsByPid(Page page, Integer projectId) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("page", page);
		map.put("projectId", projectId);
		map.put("order", "upload_Time desc");
		return newsUrlMapper.selectVerifiedNewsUrl(map);
	}

	/**
	 * @Description: 根据立项id计算出对应的未审核的新闻链接的总记录数
	 * @author:JackBauer
	 * @Date:2015年9月18日下午8:53:28
	 */
	@Override
	public int getUnverifiedNewsUrlsCountByPid(Integer projectId) throws Exception {
		NewsurlExample example = new NewsurlExample();
		NewsurlExample.Criteria criteria = example.createCriteria();
		criteria.andProjectIdEqualTo(projectId);
		criteria.andIsPassedEqualTo((byte) 0);
		criteria.andStateEqualTo((byte) 1);
		return newsUrlMapper.countByExample(example);
	}

	/**
	 * @Description: 根据立项id计算出对应的已审核的新闻链接的总记录数
	 * @author:JackBauer
	 * @Date:2015年9月18日下午8:53:28
	 */
	@Override
	public int getVerifiedNewsUrlsCountByPid(Integer projectId) throws Exception {
		NewsurlExample example = new NewsurlExample();
		NewsurlExample.Criteria criteria = example.createCriteria();
		criteria.andProjectIdEqualTo(projectId);
		criteria.andIsPassedGreaterThan((byte) 0);
		criteria.andStateEqualTo((byte) 1);
		return newsUrlMapper.countByExample(example);
	}

	@Override
	public NewsUrlCustom findNewsUrlByNid(Integer newsurlId) throws Exception {
		try {
			return newsUrlMapper.selectNewsUrlByNid(newsurlId);
		} catch (Exception e) {
			logger.error("findNewsUrlByNid failed!", e);
		}
		return null;
	}
}
