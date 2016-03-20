package com.fund.service.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.exception.FileException;
import com.fund.mapper.FilesMapper;
import com.fund.mapper.FiletypeMapper;
import com.fund.mapper.NewstypeMapper;
import com.fund.mapper.NewsurlMapper;
import com.fund.mapper.ProtocolMapper;
import com.fund.po.Files;
import com.fund.po.FilesExample;
import com.fund.po.Filetype;
import com.fund.po.FiletypeExample;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Newstype;
import com.fund.po.NewstypeExample;
import com.fund.po.Protocol;
import com.fund.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private FiletypeMapper fileTypeMapper;
	@Autowired
	private NewstypeMapper newsTypeMapper;
	@Autowired
	private NewsurlMapper newsUrlMapper;
	@Autowired
	private FilesMapper filesMapper;
	@Autowired
	private ProtocolMapper protocolMapper;
	
	
	/**
	 * @Description: 查找所有的文件类型
	 * @author:JackBauer
	 * @Date:2015年10月23日上午8:59:49
	 */
	@Override
	public List<Filetype> findAllFileTypes() throws Exception {
		try {
			FiletypeExample example = new FiletypeExample();
			FiletypeExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo((byte)1);
			return fileTypeMapper.selectByExample(example);
		} catch (Exception e) {
			logger.error("findAllFileTypes failed!", e);
			return null;
		}
	}

	/**
	 * @Description:查找所有的新闻链接类型
	 * @author:JackBauer
	 * @Date:2015年10月23日上午9:00:24
	 */
	@Override
	public List<Newstype> findAllNewsTypes() throws Exception {
		try {
			NewstypeExample example = new NewstypeExample();
			NewstypeExample.Criteria criteria = example.createCriteria();
			criteria.andStateEqualTo((byte) 1);
			return newsTypeMapper.selectByExample(example);
		} catch (Exception e) {
			logger.error("findAllNewsTypes failed!", e);
			return null;
		}
	}

	/**
	 * @Description: 上传新闻链接
	 * @author:JackBauer
	 * @Date:2015年10月23日上午9:00:51
	 */
	@Override
	public void insertNewsUrl(NewsUrlCustom newsUrl) throws Exception {
		try {
			newsUrlMapper.insertSelective(newsUrl);
		} catch (Exception e) {
			logger.error("insertNewsUrl failed!", e);
			throw new FileException("上传新闻失败！");
		}
	}

	/**
	 * @Description: 上传文件
	 * @author:JackBauer
	 * @Date:2015年10月23日上午9:04:00
	 */
	@Override
	public void insertFile(Files file) throws Exception {
		try {
			filesMapper.insertSelective(file);
		} catch (Exception e) {
			logger.error("insertFile failed!", e);
			throw new FileException("上传文件失败！");
		}
	}

	/**
	 * @Description: 根据文件id查找对应文件
	 * @author:JackBauer
	 * @Date:2015年10月23日上午9:03:40
	 */
	@Override
	public Files findFileByFid(Integer filesId) throws Exception {
		try {
			FilesExample example = new FilesExample();
			FilesExample.Criteria criteria = example.createCriteria();
			criteria.andFileIdEqualTo(filesId);
			criteria.andStateEqualTo((byte) 1);
			List<Files> fileList = filesMapper.selectByExample(example);
			if(fileList.size()==1)
				return fileList.get(0);
		} catch (Exception e) {
			logger.error("findFileByFid failed!", e);
		}
		
		return null;
	}

	/**
	 * @Description: 更新捐赠协议，主要是上传捐赠协议后重新指定其文件路径
	 * @author:JackBauer
	 * @Date:2015年8月30日上午10:35:47
	 */
	@Override
	public void updateProtocol(Protocol protocol) throws Exception {
		try {
			protocolMapper.updateByPrimaryKey(protocol);
		} catch (Exception e) {
			logger.error("updateProtocol failed!", e);
		}
	}

}
