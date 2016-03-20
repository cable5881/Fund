package com.fund.po;

import java.util.Date;

public class Scindivinfo {
    private Integer scindivinfoId;

    private String scName;

    private Byte scSex;

    private Date scBirthday;

    private String scStuid;

    private String institute;

    private String degrees;

    private String major;

    private String classes;

    private String nation;

    private Date enrolledTime;

    private String politicalStatus;

    private String acaScore;

    private String alltestLevel;

    private String phoneNumber;

    private String scEmail;

    private String scAddress;

    private String photoUrl;

    private Byte state;

    public Integer getScindivinfoId() {
        return scindivinfoId;
    }

    public void setScindivinfoId(Integer scindivinfoId) {
        this.scindivinfoId = scindivinfoId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Byte getScSex() {
        return scSex;
    }

    public void setScSex(Byte scSex) {
        this.scSex = scSex;
    }

    public Date getScBirthday() {
        return scBirthday;
    }

    public void setScBirthday(Date scBirthday) {
        this.scBirthday = scBirthday;
    }

    public String getScStuid() {
        return scStuid;
    }

    public void setScStuid(String scStuid) {
        this.scStuid = scStuid == null ? null : scStuid.trim();
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute == null ? null : institute.trim();
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees == null ? null : degrees.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getEnrolledTime() {
        return enrolledTime;
    }

    public void setEnrolledTime(Date enrolledTime) {
        this.enrolledTime = enrolledTime;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getAcaScore() {
        return acaScore;
    }

    public void setAcaScore(String acaScore) {
        this.acaScore = acaScore == null ? null : acaScore.trim();
    }

    public String getAlltestLevel() {
        return alltestLevel;
    }

    public void setAlltestLevel(String alltestLevel) {
        this.alltestLevel = alltestLevel == null ? null : alltestLevel.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getScEmail() {
        return scEmail;
    }

    public void setScEmail(String scEmail) {
        this.scEmail = scEmail == null ? null : scEmail.trim();
    }

    public String getScAddress() {
        return scAddress;
    }

    public void setScAddress(String scAddress) {
        this.scAddress = scAddress == null ? null : scAddress.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}