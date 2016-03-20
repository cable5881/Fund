package com.fund.po;

public class Scholarshipapp {
    private Integer scholarshipappId;

    private Integer bonusnoticeId;

    private String stuNum;

    private Integer scindivinfoId;

    private Integer scappinfoId;

    private Integer fileId;

    private String notes;

    private Byte isPassed;

    private Byte state;

    public Integer getScholarshipappId() {
        return scholarshipappId;
    }

    public void setScholarshipappId(Integer scholarshipappId) {
        this.scholarshipappId = scholarshipappId;
    }

    public Integer getBonusnoticeId() {
        return bonusnoticeId;
    }

    public void setBonusnoticeId(Integer bonusnoticeId) {
        this.bonusnoticeId = bonusnoticeId;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum == null ? null : stuNum.trim();
    }

    public Integer getScindivinfoId() {
        return scindivinfoId;
    }

    public void setScindivinfoId(Integer scindivinfoId) {
        this.scindivinfoId = scindivinfoId;
    }

    public Integer getScappinfoId() {
        return scappinfoId;
    }

    public void setScappinfoId(Integer scappinfoId) {
        this.scappinfoId = scappinfoId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
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