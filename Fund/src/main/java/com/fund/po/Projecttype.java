package com.fund.po;

public class Projecttype {
    private Integer projecttypeId;

    private String projecttypeName;

    private Byte state;

    public Integer getProjecttypeId() {
        return projecttypeId;
    }

    public void setProjecttypeId(Integer projecttypeId) {
        this.projecttypeId = projecttypeId;
    }

    public String getProjecttypeName() {
        return projecttypeName;
    }

    public void setProjecttypeName(String projecttypeName) {
        this.projecttypeName = projecttypeName == null ? null : projecttypeName.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}