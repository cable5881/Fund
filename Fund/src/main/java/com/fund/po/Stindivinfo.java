package com.fund.po;

import java.util.Date;

public class Stindivinfo {
    private Integer stindivinfoId;

    private String stName;

    private Byte stSex;

    private Date stBirthday;

    private String stStuid;

    private String institute;

    private String degrees;

    private String major;

    private String classes;

    private String nation;

    private Date enrolledTime;

    private String politicalStatus;

    private String phone;

    private String stEmail;

    private String stAddress;

    private String photoUrl;

    private String notes;

    private Byte state;

    public Integer getStindivinfoId() {
        return stindivinfoId;
    }

    public void setStindivinfoId(Integer stindivinfoId) {
        this.stindivinfoId = stindivinfoId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public Byte getStSex() {
        return stSex;
    }

    public void setStSex(Byte stSex) {
        this.stSex = stSex;
    }

    public Date getStBirthday() {
        return stBirthday;
    }

    public void setStBirthday(Date stBirthday) {
        this.stBirthday = stBirthday;
    }

    public String getStStuid() {
        return stStuid;
    }

    public void setStStuid(String stStuid) {
        this.stStuid = stStuid == null ? null : stStuid.trim();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail == null ? null : stEmail.trim();
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress == null ? null : stAddress.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}