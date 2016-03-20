package com.fund.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.fund.mapper.BonusnoticeMapper;
import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeCustom;
import com.fund.po.BonusnoticeExample;
import com.fund.po.Project;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.ScholarshipService;

public class ScholarshipServiceImpl implements ScholarshipService{
	
	@Autowired
	private BonusnoticeMapper bNoticeMapper;
	
	@Override
	public List<BonusnoticeCustom> findBonusNoticesByPid(ProjectCustom project) throws Exception {
		BonusnoticeExample bonusnoticeExample=new BonusnoticeExample();
		BonusnoticeExample.Criteria criteria=bonusnoticeExample.createCriteria();
		criteria.andStateEqualTo((byte)1);
		criteria.andProjectIdEqualTo(project.getProjectId());
		List<Bonusnotice> bonusnoticeList=bNoticeMapper.selectByExample(bonusnoticeExample);
		List<BonusnoticeCustom> bonusnoticeCustomsList=new ArrayList<BonusnoticeCustom>();
		for (Bonusnotice bonusnotice : bonusnoticeList){
			BonusnoticeCustom bonusnoticeCustom=new BonusnoticeCustom();
			BeanUtils.copyProperties(bonusnoticeCustom, bonusnotice);
			bonusnoticeCustom.setProject(project);
			bonusnoticeCustomsList.add(bonusnoticeCustom);
		}
		return bonusnoticeCustomsList;
	}

}
