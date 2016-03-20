package com.fund.po;

public class Stappinfo {
    private Integer stappinfoId;

    private String description;

    private String stCase;

    private String viewClass;

    private String viewInstitute;

    private String viewJudge;

    private String notes;

    private Byte state;

    public Integer getStappinfoId() {
        return stappinfoId;
    }

    public void setStappinfoId(Integer stappinfoId) {
        this.stappinfoId = stappinfoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStCase() {
        return stCase;
    }

    public void setStCase(String stCase) {
        this.stCase = stCase == null ? null : stCase.trim();
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