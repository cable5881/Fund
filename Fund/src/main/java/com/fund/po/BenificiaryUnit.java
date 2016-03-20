package com.fund.po;

public class BenificiaryUnit {
    private Integer bunitId;

    private String bunitName;

    private Byte state;

    public Integer getBunitId() {
        return bunitId;
    }

    public void setBunitId(Integer bunitId) {
        this.bunitId = bunitId;
    }

    public String getBunitName() {
        return bunitName;
    }

    public void setBunitName(String bunitName) {
        this.bunitName = bunitName == null ? null : bunitName.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}