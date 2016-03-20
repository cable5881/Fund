package com.fund.po;

import java.util.Date;

public class SubmittedBonusForm {

	private Date startDate;
	private String projectName;
	private Integer projectId;
	private Byte isPassed;
	private Integer fundType;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Byte getIsPassed() {
		return isPassed;
	}
	public void setIsPassed(Byte isPassed) {
		this.isPassed = isPassed;
	}
	public Integer getFundType() {
		return fundType;
	}
	public void setFundType(Integer fundType) {
		this.fundType = fundType;
	}
	
	
}
