package com.fund.service;

import java.util.List;

import com.fund.po.Files;
import com.fund.po.Filetype;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newstype;
import com.fund.po.Protocol;

public interface FileService {
	public List<Filetype> findAllFileTypes()throws Exception;
	public List<Newstype> findAllNewsTypes()throws Exception;
	public void insertNewsUrl(NewsUrlCustom newsUrl)throws Exception;
	public void insertFile(Files file)throws Exception;
	public Files findFileByFid(Integer filesId)throws Exception;
	public void updateProtocol(Protocol protocol)throws Exception;
}
