package com.fund.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fund.po.Files;
import com.fund.po.Protocol;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.FileService;

@Controller
@RequestMapping("/download")
public class DownloadController {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private FileService fileService;
	
	/**
	 * @Description: 下载捐赠协议
	 * @author:JackBauer
	 * @Date:2015年10月23日下午3:11:11
	 */
	@RequestMapping("/downloadProtocol")
	public void downloadProtocol(HttpSession session,HttpServletResponse response)throws Exception{
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		Protocol protocol = project.getProtocol();
		if(protocol != null){
			downloadFileByFid(protocol.getFileId(), response);
		}
	}
	
	/**
	 * @Description: 下载普通文件
	 * @author:JackBauer
	 * @Date:2015年10月23日下午3:14:19
	 */
	@RequestMapping("/downloadFile")
	public void downloadFile(Integer filesId,HttpServletResponse response)throws Exception{
		downloadFileByFid(filesId, response);
	}
	
	
	
	/**
	 * @Description: 下载文件共用方法
	 * @author:JackBauer
	 * @Date:2015年10月23日下午3:09:51
	 */
	public void downloadFileByFid(Integer fileId,HttpServletResponse response)throws Exception{
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try{
			Files dbFile = fileService.findFileByFid(fileId);
			File file = new File(dbFile.getSource());
			
			response.addHeader("Content-Length", "" + file.length());
			response.addHeader("Content-Disposition", "attachment;filename="+new String(file.getName().getBytes("ISO8859-1"), "utf-8"));
			response.setContentType("application/octet-stream");
			
			in = new BufferedInputStream(new FileInputStream(file));
            out = new BufferedOutputStream(response.getOutputStream());
            byte[] b = new byte[4096];
            int length;
            while ((length = in.read(b)) > 0) {
                out.write(b, 0, length);
            }
            
		}catch (Exception e) {
				logger.error("downloadFile failed!", e);
				
		}finally {
			if(out!=null)
				out.close();
			if(in!=null)
				in.close();
		}
	}
}
