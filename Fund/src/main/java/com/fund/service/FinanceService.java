package com.fund.service;

import java.util.List;

import com.fund.po.Inbill;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.Outbill;
import com.fund.po.custom.ProjectCustom;
import com.fund.utils.Page;

public interface FinanceService {
	void insertInBill(Inbill inBill)throws Exception;
	void insertOutBill(Outbill outBill)throws Exception;
	List<Inbill> findInbillsByMCheckId(Integer mCheckId,Page page)throws Exception;
	List<Outbill> findOutbillsByMCheckId(Integer mCheckId,Page page)throws Exception;
	List<ProjectCustom> findMoneyProjects(Page page)throws Exception;
	int getInbillsCountByMCheckId(Integer mCheckId)throws Exception;
	int getOutbillsCountByMCheckId(Integer mCheckId)throws Exception;
	int updateMoneyCheck(MoneyCheckCustom mCheck)throws Exception;
	int deleteOutbill(Integer outbillId,Integer mCheckId,Double moneyOut) throws Exception;
	public int deleteInbill(Integer inbillId,Integer mCheckId,Double moneyIn)throws Exception;
}
