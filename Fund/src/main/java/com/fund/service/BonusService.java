package com.fund.service;

import java.util.List;

import com.fund.po.Bonusnotice;
import com.fund.po.BonusnoticeCustom;
import com.fund.po.Project;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.Scholarshipapp;
import com.fund.po.StipendAppCustom;
import com.fund.po.Stipendapp;
import com.fund.po.SubmittedBonusForm;
import com.fund.po.User;
import com.fund.query.ScholarshipQuery;
import com.fund.query.StipendappQuery;
import com.fund.utils.Page;

public interface BonusService {

	//插入学生的申请表
	void insertScholarshipForm(ScholarshipQuery scholarshipQuery,User user,Project project )throws Exception;
	//找出所有的奖学金项目
	List<BonusnoticeCustom> selectScholarshipCustom()throws Exception;
	//判断学生是否申请过奖学金
	boolean judgeScholarship(Integer projectId,User user)throws Exception;
	//根据学生id找出申请过的奖学金
	List<SubmittedBonusForm> selectScholarshipappCustom(User user)throws Exception;
	//找出学生申请过得某项目对应的奖学金申请表
	ScholarshipQuery selectScholarshipForm(Project project,User user)throws Exception;
	//根据立项id获取立项
	Project selectProject(Integer projectId)throws Exception;
	//根据立项id找出所有对应的奖学金申请表
	List<ScholarshipAppCustom> findAllScAppsByBid(Integer bonusNoticeId)throws Exception;
	//更新奖学金申请表
	void updateScApp(Scholarshipapp scApp)throws Exception;
	
	//插入评审通知，表示开始评审
	void insertBonusNotice(Bonusnotice bonusNotice)throws Exception;
	//更新评审通知，主要用于奖学金报名
	void updateBonusNotice(Bonusnotice bonusNotice)throws Exception;
	
	void insertStipendappForm(StipendappQuery stipendappQuery,User user,Project project)throws Exception;
	List<BonusnoticeCustom> selectStipendCustom()throws Exception;
	boolean judgeStipend(Integer projectId,User user)throws Exception;
	List<SubmittedBonusForm> selectStipendappCustom(User user)throws Exception;
	StipendappQuery selectStipendForm(Project project,User user)throws Exception;
	List<StipendAppCustom> findAllStAppsByBid(Integer bonusNoticeId)throws Exception;
	void updateStApp(Stipendapp stApp)throws Exception;
	
	ScholarshipAppCustom findScAppByAppId(Integer appId)throws Exception;
	StipendAppCustom findStAppByAppId(Integer appId)throws Exception;
	Bonusnotice findBonusNoticeByBNoticeId(Integer bonusNoticeId)throws Exception;
	
    int getUnverifiedScAppsCountByBNId(Integer bNoticeId)throws Exception;//评审通知对应的未审核奖学金申请表总数
    int getUnverifiedStAppsCountByBNId(Integer bNoticeId)throws Exception;//评审通知对应的未审核助学金申请表总数
    int getVerifiedScAppsCountByBNId(Integer bNoticeId)throws Exception;//评审通知对应的已审核奖学金申请表总数
    int getVerifiedStAppsCountByBNId(Integer bNoticeId)throws Exception;//评审通知对应的已审核助学金申请表总数
    
    List<ScholarshipAppCustom> findUnverifiedScAppsByBNoticeId(Integer bNoticeId,Page page)throws Exception;//根据评审通知查找未审核的奖学金申请表
    List<StipendAppCustom> findUnverifiedStAppsByBNoticeId(Integer bNoticeId,Page page)throws Exception;//根据评审通知查找未审核的助学金申请表
    List<ScholarshipAppCustom> findVerifiedScAppsByBNoticeId(Integer bNoticeId,Page page)throws Exception;//根据评审通知查找已审核的奖学金申请表
    List<StipendAppCustom> findVerifiedStAppsByBNoticeId(Integer bNoticeId,Page page)throws Exception;//根据评审通知查找已审核的助学金申请表
}
