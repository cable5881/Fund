package com.fund.po;

public class Fundtype {
    private Integer fundtypeId;

    private Integer projecttypeId;

    private String fundName;

    private Byte state;

    public Integer getFundtypeId() {
        return fundtypeId;
    }

    public void setFundtypeId(Integer fundtypeId) {
        this.fundtypeId = fundtypeId;
    }

    public Integer getProjecttypeId() {
        return projecttypeId;
    }

    public void setProjecttypeId(Integer projecttypeId) {
        this.projecttypeId = projecttypeId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}