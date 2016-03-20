package com.fund.po.custom;
import java.util.List;

import com.fund.po.BenificiaryUnit;
import com.fund.po.Benificiarycontact;
import com.fund.po.Bonusnotice;
import com.fund.po.DonationModeCustom;
import com.fund.po.Donationcontact;
import com.fund.po.Donationunit;
import com.fund.po.Donor;
import com.fund.po.Fundtype;
import com.fund.po.MoneyCheckCustom;
import com.fund.po.NewsUrlCustom;
import com.fund.po.Project;
import com.fund.po.Projecttype;
import com.fund.po.Protocol;

public class ProjectCustom extends Project{
	private Benificiarycontact benificiaryContact;
	private BenificiaryUnit benificiaryUnit;
	private Donationunit donationUnit;
	private Donationcontact donationContact;
	private Donor donor;
	private DonationModeCustom donationMode;
	private MoneyCheckCustom moneyCheck;
	private Fundtype fundType;
	private Projecttype projectType;
	private Protocol protocol;
	private Bonusnotice bonusNotice;
	private List<NewsUrlCustom> newsList;
	private Integer mode;
	
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
	public DonationModeCustom getDonationMode() {
		return donationMode;
	}
	public void setDonationMode(DonationModeCustom donationMode) {
		this.donationMode = donationMode;
	}
	public MoneyCheckCustom getMoneyCheck() {
		return moneyCheck;
	}
	public void setMoneyCheck(MoneyCheckCustom moneyCheck) {
		this.moneyCheck = moneyCheck;
	}
	public Fundtype getFundType() {
		return fundType;
	}
	public void setFundType(Fundtype fundType) {
		this.fundType = fundType;
	}
	public Projecttype getProjectType() {
		return projectType;
	}
	public void setProjectType(Projecttype projectType) {
		this.projectType = projectType;
	}
	public Protocol getProtocol() {
		return protocol;
	}
	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	public List<NewsUrlCustom> getNewsList() {
		return newsList;
	}
	public void setNewsList(List<NewsUrlCustom> newsList) {
		this.newsList = newsList;
	}
	public Bonusnotice getBonusNotice() {
		return bonusNotice;
	}
	public void setBonusNotice(Bonusnotice bonusNotice) {
		this.bonusNotice = bonusNotice;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public BenificiaryUnit getBenificiaryUnit() {
		return benificiaryUnit;
	}
	public void setBenificiaryUnit(BenificiaryUnit benificiaryUnit) {
		this.benificiaryUnit = benificiaryUnit;
	}
	
}
