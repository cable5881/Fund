package com.fund.service;

import java.util.List;

import com.fund.po.BonusnoticeCustom;
import com.fund.po.custom.ProjectCustom;

public interface ScholarshipService {
	public List<BonusnoticeCustom> findBonusNoticesByPid(ProjectCustom project)throws Exception;
}
