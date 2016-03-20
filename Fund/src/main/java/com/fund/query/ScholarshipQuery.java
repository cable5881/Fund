package com.fund.query;

import com.fund.po.Bonusnotice;
import com.fund.po.Project;
import com.fund.po.Scappinfo;
import com.fund.po.Scholarshipapp;
import com.fund.po.Scindivinfo;

public class ScholarshipQuery {
	
	private Scappinfo scappinfo;
	private Scindivinfo scindivinfo;
	private Scholarshipapp scholarshipapp;
	private Project project;
	private Bonusnotice bonusnotice;
	
	public Scappinfo getScappinfo() {
		return scappinfo;
	}
	public void setScappinfo(Scappinfo scappinfo) {
		this.scappinfo = scappinfo;
	}
	public Scindivinfo getScindivinfo() {
		return scindivinfo;
	}
	public void setScindivinfo(Scindivinfo scindivinfo) {
		this.scindivinfo = scindivinfo;
	}
	public Scholarshipapp getScholarshipapp() {
		return scholarshipapp;
	}
	public void setScholarshipapp(Scholarshipapp scholarshipapp) {
		this.scholarshipapp = scholarshipapp;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Bonusnotice getBonusnotice() {
		return bonusnotice;
	}
	public void setBonusnotice(Bonusnotice bonusnotice) {
		this.bonusnotice = bonusnotice;
	}
	
}
