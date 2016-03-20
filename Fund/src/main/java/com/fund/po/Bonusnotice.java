package com.fund.po;

import java.util.Date;

public class Bonusnotice {
    private Integer bonusnoticeId;

    private Integer projectId;

    private Date startDate;

    private Date endDate;

    private Byte judgeWay;

    private Byte judgeState;

    private Byte state;

    public Integer getBonusnoticeId() {
        return bonusnoticeId;
    }

    public void setBonusnoticeId(Integer bonusnoticeId) {
        this.bonusnoticeId = bonusnoticeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getJudgeWay() {
        return judgeWay;
    }

    public void setJudgeWay(Byte judgeWay) {
        this.judgeWay = judgeWay;
    }

    public Byte getJudgeState() {
        return judgeState;
    }

    public void setJudgeState(Byte judgeState) {
        this.judgeState = judgeState;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}