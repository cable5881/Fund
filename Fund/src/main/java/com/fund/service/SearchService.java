package com.fund.service;

import java.util.List;
import com.fund.po.Inbill;
import com.fund.utils.Page;

/**
 * @Description:查找业务
 * @author:JackBauer
 * @date:2015年10月30日 下午1:08:16
 */
public interface SearchService {
	List<Inbill> findInbillByPayerOrMoneyNum(String key,Page page)throws Exception;
	int getInbillsCountBySerachKey(String key) throws Exception;
}
