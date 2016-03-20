package com.fund.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import com.fund.utils.UrlUtil;

public class UploadActionBase {
	private String allowSuffix = "jpg,png,gif,jpeg,doc,docx,pdf,rar,zip";// 允许文件格式
	private long allowSize = 1L;// 允许文件大小
	private String fileName;
	private String[] filePaths;

	public String getAllowSuffix() {
		return allowSuffix;
	}

	public void setAllowSuffix(String allowSuffix) {
		this.allowSuffix = allowSuffix;
	}

	public long getAllowSize() {
		return allowSize * 1024 * 1024 * 1024;//2GB
	}

	public void setAllowSize(long allowSize) {
		this.allowSize = allowSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String[] getFilePaths() {
		return filePaths;
	}

	public void setFilePaths(String[] filePaths) {
		this.filePaths = filePaths;
	}

	/**
	 * @author wangsheng
	 * @date 2014年9月25日
	 * @return
	 */
	private String getFileNameNew(String oldFileName) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return formatter.format(new Date()) + uuid + "_" + oldFileName;
	}
	
	/**
	 * @author wangsheng
	 * @date 2014年9月25日
	 */
	public void uploads(MultipartFile[] files, String filePathPrefix) throws Exception {
//		String path = request.getContextPath();
//		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
		try {
			filePaths = new String[files.length];
			int index = 0;
			for (MultipartFile file : files) {
				String oldFileName = file.getOriginalFilename();
				String suffix = oldFileName.substring(file.getOriginalFilename().lastIndexOf(".") + 1);
				int length = getAllowSuffix().indexOf(suffix);
				if (length == -1) {
					throw new Exception("请上传允许格式的文件");
				}
				if (file.getSize() > getAllowSize()) {
					throw new Exception("您上传的文件大小已经超出范围");
				}
			
				File destDir = new File(UrlUtil.getFileDir(filePathPrefix));
				if (!destDir.exists()) {
					destDir.mkdirs();
				}
				String fileNameNew = getFileNameNew(oldFileName) + "." + suffix;//
				File f = new File(destDir+"/",fileNameNew);
				file.transferTo(f);
				f.createNewFile();
//				fileNames[index++] = basePath + destDir + fileNameNew;
				filePaths[index++] = f.getAbsolutePath();
				
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @author wangsheng
	 * @date 2014年9月25日
	 */
	public void upload(MultipartFile file, String destDir, HttpServletRequest request) throws Exception {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
		try {
			String oldFileName = file.getOriginalFilename();
			String suffix = oldFileName.substring(file.getOriginalFilename().lastIndexOf(".") + 1);
			int length = getAllowSuffix().indexOf(suffix);
			if (length == -1) {
				throw new Exception("请上传允许格式的文件");
			}
			if (file.getSize() > getAllowSize()) {
				throw new Exception("您上传的文件大小已经超出范围");
			}

			String realPath = request.getSession().getServletContext().getRealPath("/");
			File destFile = new File(realPath + destDir);
			if (!destFile.exists()) {
				destFile.mkdirs();
			}
			String fileNameNew = getFileNameNew(oldFileName) + "." + suffix;
			File f = new File(destFile.getAbsoluteFile() + "/" + fileNameNew);
			file.transferTo(f);
			f.createNewFile();
			fileName = basePath + destDir + fileNameNew;
		} catch (Exception e) {
			throw e;
		}
	}
}
