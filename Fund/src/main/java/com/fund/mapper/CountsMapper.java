package com.fund.mapper;

/**
 * @Description:计算数据库中的记录数
 * @author:JackBauer
 * @date:2015年10月17日 下午3:43:58
 */
public interface CountsMapper {
   
   int selectUnverifiedProtocolCount();//未审核的捐赠协议总数
   int selectVerifiedProtocolCount();//已审核的捐赠协议总数
   int selectUnverifiedNewsUrlCountByPid(Integer projectId);//未审核的新闻链接总数
   int selectVerifiedNewsUrlCountByPid(Integer projectId);//已审核的新闻链接总数
   int selectUsersCountByLevel(Integer level);//不同等级的用户总数
   int selectScAppsCountByBNId(Integer bNoticeId);//评审通知对应的奖学金申请表总数
   int selectStAppsCountByBNId(Integer bNoticeId);//评审通知对应的助学金申请表总数
   int selectUnverifiedScAppsCountByBNId(Integer bNoticeId);//评审通知对应的未审核奖学金申请表总数
   int selectUnverifiedStAppsCountByBNId(Integer bNoticeId);//评审通知对应的未审核助学金申请表总数
   int selectVerifiedScAppsCountByBNId(Integer bNoticeId);//评审通知对应的已审核奖学金申请表总数
   int selectVerifiedStAppsCountByBNId(Integer bNoticeId);//评审通知对应的已审核助学金申请表总数
   int selectBonusProjectsCountByUserId(Integer userId);//奖金项目总数
   int selectUnverifiedProjectsCount();//未审核的立项
   int selectVerifiedProjectsCount();//已审核的立项
   int selectInbillsCountBySerachKey(String key);//根据付款单位或财务项目编号查找到款单总数
}