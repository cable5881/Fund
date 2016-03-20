package com.fund.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.exception.FinanceException;
import com.fund.mapper.InbillMapper;
import com.fund.mapper.MoneycheckMapper;
import com.fund.mapper.OutbillMapper;
import com.fund.mapper.ProjectMapper;
import com.fund.po.Inbill;
import com.fund.po.InbillExample;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.Outbill;
import com.fund.po.OutbillExample;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.FinanceService;
import com.fund.utils.Page;

@Service
public class FinanceServiceImpl implements FinanceService {

	private Logger logger = Logger.getLogger(getClass()); 
	
	@Autowired
	private InbillMapper inBillMapper;
	@Autowired
	private OutbillMapper outBillMapper;
	@Autowired
	private MoneycheckMapper mCheckMapper;
	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public void insertInBill(Inbill inBill) throws Exception {
		try {
			inBillMapper.insertSelective(inBill);
		} catch (Exception e) {
			logger.error("insertInBill failed!", e);
			throw new FinanceException("插入到款单失败！");
		}
	}

	@Override
	public void insertOutBill(Outbill outBill) throws Exception {
		try {
			outBillMapper.insertSelective(outBill);
		} catch (Exception e) {
			logger.error("insertOutBill failed!", e);
			throw new FinanceException("插入发放单失败！");
		}
	}

	/**
	 * @Description: 财务管理老师查找所有立项
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:15:32
	 */
	@Override
	public List<ProjectCustom> findMoneyProjects(Page page) throws Exception {
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("page", page);
			return projectMapper.selectMoneyProjects(params);
		} catch (Exception e) {
			logger.error("findMoneyProjects failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 查询到账单
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:54:48
	 */
	@Override
	public List<Inbill> findInbillsByMCheckId(Integer mCheckId, Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("moneyCheckId", mCheckId);
			map.put("page", page);
			return inBillMapper.selectInbillsByMCheckId(map);
		} catch (Exception e) {
			logger.error("findInbillsByMCheckId failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 查询发放账单
	 * @author:JackBauer
	 * @Date:2015年10月27日下午7:54:48
	 */
	@Override
	public List<Outbill> findOutbillsByMCheckId(Integer mCheckId, Page page) throws Exception {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("moneyCheckId", mCheckId);
			map.put("page", page);
			return outBillMapper.selectOutbillsByMCheckId(map);
		} catch (Exception e) {
			logger.error("findOutbillsByMCheckId failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 到款账单总数
	 * @author:JackBauer
	 * @Date:2015年10月27日下午8:03:15
	 */
	@Override
	public int getInbillsCountByMCheckId(Integer mCheckId) throws Exception {
		try {
			InbillExample example = new InbillExample();
			InbillExample.Criteria criteria = example.createCriteria();
			criteria.andMoneycheckIdEqualTo(mCheckId);
			criteria.andStateEqualTo((byte) 1);
			return inBillMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getInbillsCountByMCheckId failed!", e);
			return 0;
		}
	}

	/**
	 * @Description: 发放账单总数
	 * @author:JackBauer
	 * @Date:2015年10月27日下午8:03:15
	 */
	@Override
	public int getOutbillsCountByMCheckId(Integer mCheckId) throws Exception {
		try {
			OutbillExample example = new OutbillExample();
			OutbillExample.Criteria criteria = example.createCriteria();
			criteria.andMoneycheckIdEqualTo(mCheckId);
			criteria.andStateEqualTo((byte) 1);
			return outBillMapper.countByExample(example);
		} catch (Exception e) {
			logger.error("getOutbillsCountByMCheckId failed!", e);
			return 0;
		}
	}

	/**
	 * @Description: 更新账单
	 * @author:JackBauer
	 * @Date:2015年10月28日下午8:09:30
	 */
	@Override
	public int updateMoneyCheck(MoneyCheckCustom mCheck) throws Exception {
		try {
			return mCheckMapper.updateByPrimaryKeySelective(mCheck);
		} catch (Exception e) {
			logger.error("updateMoneyCheck failed!", e);
			throw new FinanceException("更新MoneyCheck失败！");
		}
	}
	
	/**
	 * @Description: 删除一条到款记录
	 * @author:JackBauer
	 * @Date:2015年11月1日上午8:31:25
	 */
	@Override
	public int deleteInbill(Integer inbillId,Integer mCheckId,Double moneyIn)throws Exception{
		int resultCode = 0;
		try {
			MoneyCheckCustom mCheck = findMoneyCheckByMCheckId(mCheckId);
			double originalMoneyInSum = mCheck.getMoneyInCount();
			double updatingMoneyInSum = originalMoneyInSum - moneyIn;
			double originalMoneyOutSum = mCheck.getMoneyOutCount();
			if(updatingMoneyInSum < originalMoneyOutSum){
				//如果到款数小于发放数，则无法删除到款记录，返回-1
				return -1;
			}
			mCheck.setMoneyInCount(updatingMoneyInSum);
			mCheck.setMoneycheckId(mCheckId);
			resultCode = updateMoneyCheck(mCheck);
			
			if(resultCode == 1){
				Inbill record = new Inbill();
				record.setInbillId(inbillId);
				record.setState((byte) 0);
				resultCode = inBillMapper.updateByPrimaryKeySelective(record);//删除到款记录
			}
			return resultCode;
		} catch (Exception e) {
			logger.error("deleteInbill failed!", e);
			return 0;
		}
	}
	
	/**
	 * @Description: 删除一条发放记录
	 * @author:JackBauer
	 * @Date:2015年11月1日上午8:31:37
	 */
	@Override
	public int deleteOutbill(Integer outbillId,Integer mCheckId,Double moneyOut)throws Exception{
		int resultCode = 0;
		try {
			MoneyCheckCustom mCheck = findMoneyCheckByMCheckId(mCheckId);
			mCheck.setMoneyOutCount(mCheck.getMoneyOutCount() - moneyOut);//到账总额减去到款记录的数目
			mCheck.setMoneycheckId(mCheckId);
			resultCode = updateMoneyCheck(mCheck);
			
			if(resultCode==1){
				Outbill record = new Outbill();
				record.setOutbillId(outbillId);
				record.setState((byte) 0);
				resultCode = outBillMapper.updateByPrimaryKeySelective(record);
			}
			return resultCode;
		} catch (Exception e) {
			logger.error("deleteOutbill failed!", e);
			return 0;
		}
	}
	
	public MoneyCheckCustom findMoneyCheckByMCheckId(Integer mCheckId)throws Exception{
		try {
			return mCheckMapper.selectByPrimaryKey(mCheckId);
		} catch (Exception e) {
			logger.error("findMoneyCheckByMCheckId failed!", e);
			throw new FinanceException("查找MoneyCheck失败！");
		}
	}
	
}
