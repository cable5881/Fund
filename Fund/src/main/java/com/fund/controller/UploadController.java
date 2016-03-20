package com.fund.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.fund.po.FileMeta;
import com.fund.po.FileUploadParams;
import com.fund.po.Files;
import com.fund.po.JsonResult;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Protocol;
import com.fund.po.User;
import com.fund.po.custom.ProjectCustom;
import com.fund.service.FileService;
import com.fund.service.ProjectService;
import com.fund.utils.Const;

@Controller
@RequestMapping("/upload")
public class UploadController extends UploadActionBase{
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private FileService fileService;
	
	LinkedList<FileMeta> files = new LinkedList<FileMeta>();
	FileMeta fileMeta = null;
	/***************************************************
	 * URL: /rest/controller/upload  
	 * upload(): receives files
	 * @param request : MultipartHttpServletRequest auto passed
	 * @param response : HttpServletResponse auto passed
	 * @return LinkedList<FileMeta> as json format
	 ****************************************************/
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public @ResponseBody LinkedList<FileMeta> upload(MultipartHttpServletRequest request, HttpServletResponse response) {
 
		//1. build an iterator
		 Iterator<String> itr =  request.getFileNames();
		 MultipartFile mpf = null;

		 //2. get each file
		 while(itr.hasNext()){
			 
			 //2.1 get next MultipartFile
			 mpf = request.getFile(itr.next()); 
			 System.out.println(mpf.getOriginalFilename() +" uploaded! "+files.size());

			 //2.2 if files > 10 remove the first from the list
			 if(files.size() >= 10)
				 files.pop();
			 
			 //2.3 create new fileMeta
			 fileMeta = new FileMeta();
			 fileMeta.setFileName(mpf.getOriginalFilename());
			 fileMeta.setFileSize(mpf.getSize()/1024+" Kb");
			 fileMeta.setFileType(mpf.getContentType());
			 
			 try {
				fileMeta.setBytes(mpf.getBytes());
				
				// copy file to local disk (make sure the path "e.g. D:/temp/files" exists)
				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream("D:/temp/files/"+mpf.getOriginalFilename()));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 //2.4 add to files
			 files.add(fileMeta);
			 
		 }
		 
		// result will be like this
		// [{"fileName":"app_engine-85x77.png","fileSize":"8 Kb","fileType":"image/png"},...]
		return files;
 
	}
	/***************************************************
	 * URL: /rest/controller/get/{value}
	 * get(): get file as an attachment
	 * @param response : passed by the server
	 * @param value : value from the URL
	 * @return void
	 ****************************************************/
	@RequestMapping(value = "/get/{value}", method = RequestMethod.GET)
	 public void get(HttpServletResponse response,@PathVariable String value){
		 FileMeta getFile = files.get(Integer.parseInt(value));
		 try {		
			 	response.setContentType(getFile.getFileType());
			 	response.setHeader("Content-disposition", "attachment; filename=\""+getFile.getFileName()+"\"");
		        FileCopyUtils.copy(getFile.getBytes(), response.getOutputStream());
		 }catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
	 }
	@RequestMapping("/toUpload")
	public ModelAndView toUpload(HttpSession session,Integer projectId) throws Exception{
		ModelAndView mv = new ModelAndView();
		ProjectCustom p = projectService.findProjectByPid(projectId);
		if(p!=null && p.getIsPassed()==2){
			session.setAttribute("projectId", projectId);
			mv.addObject("fileTypeList", fileService.findAllFileTypes());
			mv.addObject("newsTypeList", fileService.findAllNewsTypes());
			mv.setViewName(forWardToUploadPage( (User)session.getAttribute(Const.SESSION_USER) ));
		}else{
			mv.setViewName("404");
		}
		return mv;
	}
	
	/*
	 * 上传新闻链接
	 */
	@RequestMapping(value = "/uploadNewsUrl",method = RequestMethod.POST)
	public @ResponseBody JsonResult uploadNewsUrl(HttpSession session,NewsUrlCustom newsUrl)throws Exception{
		JsonResult jResult = new JsonResult();
		try {
			int projectId = (int)session.getAttribute("projectId");
			newsUrl.setProjectId(projectId);
			fileService.insertNewsUrl(newsUrl);
			jResult.setResultCode(1);
		} catch (Exception e) {
			jResult.setResultCode(0);
			jResult.setResultMessage("新闻上传失败！");
		}
		return jResult;
	}
	
	@RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
	public void uploadFile(FileUploadParams uploadParams, HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		int projectId = (int) session.getAttribute("projectId");
		
		String filePathPrefix = session.getServletContext().getRealPath("/");
		super.uploads(uploadParams.getFiles(), filePathPrefix);
		String[] filePaths = super.getFilePaths();
		
		for(int i = 0;i < uploadParams.getFiles().length;i++){
			Files dbFile = uploadParams.getDbFile();
			dbFile.setProjectId(projectId);
			dbFile.setSource(filePaths[i]);
			fileService.insertFile(dbFile);
			
			if(dbFile.getFiletypeId()==1){
				updateProtocol(dbFile.getFileId());
			}
		}
			response.getWriter().print(new String("<script>alert('Success!');history.go(-1);</script>".getBytes("ISO-8859-1"),"UTF-8"));
	}
	
	/*
	 * 返回到不同的角色的上传首页地址
	 */
	public String forWardToUploadPage(User user)throws Exception{
		if(user.getPositionId()==5){
			return "user/benificiary/upload";//受益方界面
		}else if(user.getPositionId()==1){
			return "user/sysAdmin/upload";//系统管理员界面
		}else{
			return "404";
		}
	}
	
	/*
	 * 上传捐赠协议，需要覆盖原来自动生成的
	 */
	public void updateProtocol(int fileId)throws Exception{
		Protocol protocol = new Protocol();
		protocol.setFileId(fileId);
		fileService.updateProtocol(protocol);
	} 
	
	@RequestMapping("/toUpload2")
	public void toUpload2(HttpServletRequest request,HttpServletResponse response)throws Exception{
//		response.sendRedirect("Fund/WEB-INF/jsp/upload.html");
		request.getRequestDispatcher("/WEB-INF/jsp/upload.html").forward(request, response);
	}
}
