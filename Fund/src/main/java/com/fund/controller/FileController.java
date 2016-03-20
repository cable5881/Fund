package com.fund.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fund.po.FileUploadParams;
import com.fund.po.Files;
import com.fund.po.JsonResult;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Protocol;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.FileService;


@Controller
@RequestMapping("/file")
public class FileController extends UploadActionBase{
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private FileService fileService;
	
	//根据不用用户跳转到各自的上传界面
	@RequestMapping("/toUpload")
	public String toUpload(HttpSession session,Integer index) throws Exception{
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		User user = (User)session.getAttribute("user");
		if(index==null || project==null){
			return forWardToIndex(user);
		}
		session.setAttribute("fileTypeList", fileService.findAllFileTypes());
		session.setAttribute("newsTypeList", fileService.findAllNewsTypes());
		session.setAttribute("p", project);
		session.setAttribute("index", index);
		return forwardToUpload(user);
	}
	
	/*
	 * 上传新闻链接
	 */
	@RequestMapping("/uploadNewsUrl")
	public @ResponseBody JsonResult uploadNewsUrl(HttpSession session,NewsUrlCustom newsUrl)throws Exception{
		ProjectCustom project = (ProjectCustom)session.getAttribute("p");
		JsonResult jResult = new JsonResult();
		if(project != null){
			newsUrl.setProjectId(project.getProjectId());
			fileService.insertNewsUrl(newsUrl);
			jResult.setResultCode(1);
		}else{
			jResult.setResultCode(0);
		}
		return jResult;
	}
	
	@RequestMapping("/uploadFile")
	public void uploadFile(FileUploadParams uploadParams, HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		
		if(project != null && project.getIsPassed() == 2)
		{
			String filePathPrefix = session.getServletContext().getRealPath("/");
			super.uploads(uploadParams.getFiles(), filePathPrefix);
			String[] filePaths = super.getFilePaths();
			
			for(int i = 0;i < uploadParams.getFiles().length;i++){
				Files dbFile = uploadParams.getDbFile();
				dbFile.setProjectId(project.getProjectId());
				dbFile.setSource(filePaths[i]);
				fileService.insertFile(dbFile);
				
				if(dbFile.getFiletypeId()==1 && project.getProtocol()!=null){
					updateProtocol(project.getProtocol(), dbFile.getFileId());
				}
			}
			
			response.getWriter().print(new String("<script>alert('Success!');history.go(-1);</script>".getBytes("ISO-8859-1"),"UTF-8"));
		}else{
			request.getRequestDispatcher("/WEB-INF/jsp/404.jsp").forward(request, response);
		}
	}
	
	@RequestMapping("/downloadProtocol")
	public void downloadProtocol(HttpSession session,HttpServletResponse response)throws Exception{
		ProjectCustom project = (ProjectCustom) session.getAttribute("p");
		Protocol protocol = project.getProtocol();
		if(protocol == null){
			return;
		}
		
		Integer fileId = protocol.getFileId();
		Files dbFile = fileService.findFileByFid(fileId);
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try{
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
				e.printStackTrace();
		}finally {
			if(out!=null)
				out.close();
			if(in!=null)
				in.close();
		}
	}
	
	@RequestMapping("/downloadFile")
	public void downloadFile(Integer fileId,HttpServletResponse response)throws Exception{
		
		Files dbFile = fileService.findFileByFid(fileId);
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try{
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
				
		}finally {
			if(out!=null)
				out.close();
			if(in!=null)
				in.close();
		}
	}
	
	/**
	 * @Description: 上传捐赠协议，需要覆盖原来自动生成的
	 * @author:JackBauer
	 * @Date:2015年8月30日上午10:30:01
	 */
	public void updateProtocol(Protocol protocol,Integer fileId)throws Exception{
		protocol.setFileId(fileId);
		fileService.updateProtocol(protocol);
	} 
	
	
	/*
	 * 根据不同用户返回不同的上传页面
	 */
	public String forwardToUpload(User user)throws Exception{
		if(user.getPositionId()==5){
			return "user/benificiary/upload";//受益方界面
		}else if(user.getPositionId()==1){
			return "user/sysAdmin/upload";//系统管理员界面
		}else{
			return "404";
		}
	}
	
	/*
	 * 返回到首页
	 */
	public String forWardToIndex(User user)throws Exception{
		if(user.getPositionId()==5){
			return "user/benificiary/index";//受益方界面
		}else if(user.getPositionId()==1){
			return "user/sysAdmin/index";//系统管理员界面
		}else{
			return "404";
		}
	}
	
	/*
	 * 返回用户的身份名称,用于跳转用
	 */
	public String getPosition(User user)throws Exception{
		if(user.getPositionId()==5){
			return "benificiary";
		}else{
			return "sysAdmin";
		}
	}
}
