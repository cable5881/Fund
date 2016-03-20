package com.fund.mapper;

import com.fund.po.NewsUrlCustom;
import com.fund.po.Newsurl;
import com.fund.po.NewsurlExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NewsurlMapper {
    int countByExample(NewsurlExample example);

    int deleteByExample(NewsurlExample example);

    int deleteByPrimaryKey(Integer newsurlId);

    int insert(Newsurl record);

    int insertSelective(Newsurl record);

    List<NewsUrlCustom> selectByExample(NewsurlExample example);

    Newsurl selectByPrimaryKey(Integer newsurlId);

    int updateByExampleSelective(@Param("record") Newsurl record, @Param("example") NewsurlExample example);

    int updateByExample(@Param("record") Newsurl record, @Param("example") NewsurlExample example);

    int updateByPrimaryKeySelective(Newsurl record);

    int updateByPrimaryKey(Newsurl record);
    
    List<NewsUrlCustom> selectUnverifiedNewsUrl(Map<String, Object> map);//查找未审核的新闻链接
    
    List<NewsUrlCustom> selectVerifiedNewsUrl(Map<String, Object> map);//查找已审核的新闻链接
    
    List<NewsUrlCustom> selectNewsUrlByPid(Map<String, Object> map);//根据立项id查找对应的所有新闻链接
    
    NewsUrlCustom selectNewsUrlByNid(Integer newsurlId)throws Exception;
}