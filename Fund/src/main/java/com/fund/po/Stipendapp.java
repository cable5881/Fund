package com.fund.po;

public class Stipendapp {
    private Integer stipendappId;

    private Integer bonusnoticeId;

    private String stuNum;

    private Integer stindivinfoId;

    private Integer stappinfoId;

    private Integer fileId;

    private String notes;

    private Byte isPassed;

    private Byte state;

    public Integer getStipendappId() {
        return stipendappId;
    }

    public void setStipendappId(Integer stipendappId) {
        this.stipendappId = stipendappId;
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

    public Integer getStindivinfoId() {
        return stindivinfoId;
    }

    public void setStindivinfoId(Integer stindivinfoId) {
        this.stindivinfoId = stindivinfoId;
    }

    public Integer getStappinfoId() {
        return stappinfoId;
    }

    public void setStappinfoId(Integer stappinfoId) {
        this.stappinfoId = stappinfoId;
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