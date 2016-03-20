package com.fund.po;

import java.util.Date;

public class Newsurl {
    private Integer newsurlId;

    private Integer newstypeId;

    private String newsTitle;

    private String launchUrl;

    private Date uploadTime;

    private Integer projectId;

    private String notes;

    private Byte isPassed;

    private Byte state;

    public Integer getNewsurlId() {
        return newsurlId;
    }

    public void setNewsurlId(Integer newsurlId) {
        this.newsurlId = newsurlId;
    }

    public Integer getNewstypeId() {
        return newstypeId;
    }

    public void setNewstypeId(Integer newstypeId) {
        this.newstypeId = newstypeId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getLaunchUrl() {
        return launchUrl;
    }

    public void setLaunchUrl(String launchUrl) {
        this.launchUrl = launchUrl == null ? null : launchUrl.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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