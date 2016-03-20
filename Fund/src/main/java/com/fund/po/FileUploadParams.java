package com.fund.po;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadParams {
	private MultipartFile[] files;
	private Files dbFile;
	
	public MultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
	public Files getDbFile() {
		return dbFile;
	}
	public void setDbFile(Files dbFile) {
		this.dbFile = dbFile;
	}
}
