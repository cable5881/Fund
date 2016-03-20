package com.fund.po;

import java.util.List;

public class ProjecttypeCustom extends Projecttype {

	private List<Fundtype> fundtypesList;

	public List<Fundtype> getFundtypesList() {
		return fundtypesList;
	}

	public void setFundtypesList(List<Fundtype> fundtypesList) {
		this.fundtypesList = fundtypesList;
	}
	
}
