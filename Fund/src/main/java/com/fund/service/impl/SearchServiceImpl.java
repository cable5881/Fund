package com.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.mapper.CountsMapper;
import com.fund.mapper.InbillMapper;
import com.fund.po.Inbill;
import com.fund.service.SearchService;
import com.fund.utils.Page;

@Service
public class SearchServiceImpl implements SearchService {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private InbillMapper inbillMapper;
	@Autowired
	private CountsMapper countsMapper;
	
	/**
	 * @Description: 根据付款单位或财务项目编号查找到款单
	 * @author:JackBauer
	 * @Date:2015年10月30日下午1:21:11
	 */
	@Override
	public List<Inbill> findInbillByPayerOrMoneyNum(String key,Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("key", key);
			map.put("key", key);
			map.put("page", page);
			return inbillMapper.selectInbillByPayerOrMoneyNum(map);
		} catch (Exception e) {
			logger.error("findInbillByPayerOrMoneyNum failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 根据付款单位或财务项目编号查找到款单总数
	 * @author:JackBauer
	 * @Date:2015年10月30日下午2:03:15
	 */
	@Override
	public int getInbillsCountBySerachKey(String key)throws Exception{
		
		try {
			return countsMapper.selectInbillsCountBySerachKey(key);
		} catch (Exception e) {
			logger.error("getInbillsCountBySerachKey failed!", e);
			return 0;
		}
	}
}
