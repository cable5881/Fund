package com.fund.po;

import java.util.Date;

public class Project {
    private Integer projectId;

    private String projectNum;

    private Integer donationmodeId;

    private String projectName;

    private Integer fundtypeId;

    private Integer userId;

    private String leader;

    private Date setupTime;

    private String purpose;

    private Byte isUnit;

    private Integer benificiaryunitId;

    private Integer benificiarycontactId;

    private Integer donorId;

    private Integer donationunitId;

    private Integer donationcontactId;

    private Integer donationuserId;

    private Integer protocolId;

    private Integer moneycheckId;

    private Byte publicationState;

    private Integer appformId;

    private String notes;

    private Byte isPassed;

    private Byte state;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum == null ? null : projectNum.trim();
    }

    public Integer getDonationmodeId() {
        return donationmodeId;
    }

    public void setDonationmodeId(Integer donationmodeId) {
        this.donationmodeId = donationmodeId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Integer getFundtypeId() {
        return fundtypeId;
    }

    public void setFundtypeId(Integer fundtypeId) {
        this.fundtypeId = fundtypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public Byte getIsUnit() {
        return isUnit;
    }

    public void setIsUnit(Byte isUnit) {
        this.isUnit = isUnit;
    }

    public Integer getBenificiaryunitId() {
        return benificiaryunitId;
    }

    public void setBenificiaryunitId(Integer benificiaryunitId) {
        this.benificiaryunitId = benificiaryunitId;
    }

    public Integer getBenificiarycontactId() {
        return benificiarycontactId;
    }

    public void setBenificiarycontactId(Integer benificiarycontactId) {
        this.benificiarycontactId = benificiarycontactId;
    }

    public Integer getDonorId() {
        return donorId;
    }

    public void setDonorId(Integer donorId) {
        this.donorId = donorId;
    }

    public Integer getDonationunitId() {
        return donationunitId;
    }

    public void setDonationunitId(Integer donationunitId) {
        this.donationunitId = donationunitId;
    }

    public Integer getDonationcontactId() {
        return donationcontactId;
    }

    public void setDonationcontactId(Integer donationcontactId) {
        this.donationcontactId = donationcontactId;
    }

    public Integer getDonationuserId() {
        return donationuserId;
    }

    public void setDonationuserId(Integer donationuserId) {
        this.donationuserId = donationuserId;
    }

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    public Integer getMoneycheckId() {
        return moneycheckId;
    }

    public void setMoneycheckId(Integer moneycheckId) {
        this.moneycheckId = moneycheckId;
    }

    public Byte getPublicationState() {
        return publicationState;
    }

    public void setPublicationState(Byte publicationState) {
        this.publicationState = publicationState;
    }

    public Integer getAppformId() {
        return appformId;
    }

    public void setAppformId(Integer appformId) {
        this.appformId = appformId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Byte getIsPassed() {
        return isPassed;
    }

    public void setIsPassed(Byte isPassed) {
        this.isPassed = isPassed;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}