package com.fund.query;

import com.fund.po.Benificiarycontact;
import com.fund.po.Donationcontact;
import com.fund.po.Donationmode;
import com.fund.po.Donationunit;
import com.fund.po.Donor;
import com.fund.po.Project;

public class ProjectSetUpQuery {
	private Project project;
	private Benificiarycontact benificiaryContact;
	private Donationunit donationUnit;
	private Donationcontact donationContact;
	private Donor donor;
	private Donationmode donationMode;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Benificiarycontact getBenificiaryContact() {
		return benificiaryContact;
	}
	public void setBenificiaryContact(Benificiarycontact benificiaryContact) {
		this.benificiaryContact = benificiaryContact;
	}
	public Donationunit getDonationUnit() {
		return donationUnit;
	}
	public void setDonationUnit(Donationunit donationUnit) {
		this.donationUnit = donationUnit;
	}
	public Donationcontact getDonationContact() {
		return donationContact;
	}
	public void setDonationContact(Donationcontact donationContact) {
		this.donationContact = donationContact;
	}
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	public Donationmode getDonationMode() {
		return donationMode;
	}
	public void setDonationMode(Donationmode donationMode) {
		this.donationMode = donationMode;
	}
	
	
	
}
