package com.fund.po;

import java.util.Date;

public class DonationModeCustom extends Donationmode {
	
	private Date startTime;

	private Double yearAmount;
	
	private Double oneTimeAmount;

	private Date deadline;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		if(startTime!=null){
			this.setExecuteTime(startTime);
			this.startTime = startTime;
		}			
	}

	public Double getYearAmount() {
		return yearAmount;
	}

	public void setYearAmount(Double yearAmount) {
		if(yearAmount!=null){
			this.setAmount(yearAmount);
			this.yearAmount = yearAmount;
		}
	}

	public Double getOneTimeAmount() {
		return oneTimeAmount;
	}

	public void setOneTimeAmount(Double oneTimeAmount) {
		if(oneTimeAmount!=null){
			this.setAmount(oneTimeAmount);
			this.oneTimeAmount = oneTimeAmount;
		}
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		if(deadline!=null){
			this.setExecuteTime(deadline);
			this.deadline = deadline;
		}			
	}

}
