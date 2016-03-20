package com.fund.query;

import com.fund.po.Project;
import com.fund.po.Stappinfo;
import com.fund.po.Stindivinfo;
import com.fund.po.Stipendapp;

public class StipendappQuery {

	private Stipendapp stipendapp;
	private Stindivinfo stindivinfo;
	private Stappinfo stappinfo;
	private Project project;
	
	public Stipendapp getStipendapp() {
		return stipendapp;
	}
	public void setStipendapp(Stipendapp stipendapp) {
		this.stipendapp = stipendapp;
	}
	public Stindivinfo getStindivinfo() {
		return stindivinfo;
	}
	public void setStindivinfo(Stindivinfo stindivinfo) {
		this.stindivinfo = stindivinfo;
	}
	public Stappinfo getStappinfo() {
		return stappinfo;
	}
	public void setStappinfo(Stappinfo stappinfo) {
		this.stappinfo = stappinfo;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
}
