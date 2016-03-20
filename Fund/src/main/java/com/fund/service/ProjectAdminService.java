package com.fund.service;

import java.util.List;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newsurl;
import com.fund.po.Protocol;
import com.fund.utils.Page;

/**
 * 
 * @Description:项目管理老师专用
 * @author:JackBauer
 * @date:2015年8月25日 下午5:40:45
 */
public interface ProjectAdminService {
	void updateProtocal(Protocol protocol)throws Exception;
	void updateNewsUrl(Newsurl newsUrl)throws Exception;
	List<NewsUrlCustom> findUnverifiedNewsUrlsByPid(Page page,Integer projectId)throws Exception;
	List<NewsUrlCustom> findVerifiedNewsUrlsByPid(Page page,Integer projectId)throws Exception;
	NewsUrlCustom findNewsUrlByNid(Integer newsurlId)throws Exception;
	int getUnverifiedNewsUrlsCountByPid(Integer projectId)throws Exception;
	int getVerifiedNewsUrlsCountByPid(Integer projectId)throws Exception;
}
