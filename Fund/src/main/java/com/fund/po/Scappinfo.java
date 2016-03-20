package com.fund.po;

public class Scappinfo {
    private Integer scappinfoId;

    private String description;

    private String scCase;

    private String viewClass;

    private String viewInstitute;

    private String viewJudge;

    private String notes;

    private Byte state;

    public Integer getScappinfoId() {
        return scappinfoId;
    }

    public void setScappinfoId(Integer scappinfoId) {
        this.scappinfoId = scappinfoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getScCase() {
        return scCase;
    }

    public void setScCase(String scCase) {
        this.scCase = scCase == null ? null : scCase.trim();
    }

    public String getViewClass() {
        return viewClass;
    }

    public void setViewClass(String viewClass) {
        this.viewClass = viewClass == null ? null : viewClass.trim();
    }

    public String getViewInstitute() {
        return viewInstitute;
    }

    public void setViewInstitute(String viewInstitute) {
        this.viewInstitute = viewInstitute == null ? null : viewInstitute.trim();
    }

    public String getViewJudge() {
        return viewJudge;
    }

    public void setViewJudge(String viewJudge) {
        this.viewJudge = viewJudge == null ? null : viewJudge.trim();
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