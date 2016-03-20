package com.fund.po;

import java.util.Date;

public class Donationmode {
    private Integer donationmodeId;

    private Byte realEstate;

    private Byte isOnetime;

    private Double amount;

    private Integer currencytypeId;

    private Byte form;

    private String fundPrincipal;

    private Date executeTime;

    private Integer span;

    private Byte state;

    public Integer getDonationmodeId() {
        return donationmodeId;
    }

    public void setDonationmodeId(Integer donationmodeId) {
        this.donationmodeId = donationmodeId;
    }

    public Byte getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(Byte realEstate) {
        this.realEstate = realEstate;
    }

    public Byte getIsOnetime() {
        return isOnetime;
    }

    public void setIsOnetime(Byte isOnetime) {
        this.isOnetime = isOnetime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCurrencytypeId() {
        return currencytypeId;
    }

    public void setCurrencytypeId(Integer currencytypeId) {
        this.currencytypeId = currencytypeId;
    }

    public Byte getForm() {
        return form;
    }

    public void setForm(Byte form) {
        this.form = form;
    }

    public String getFundPrincipal() {
        return fundPrincipal;
    }

    public void setFundPrincipal(String fundPrincipal) {
        this.fundPrincipal = fundPrincipal == null ? null : fundPrincipal.trim();
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public Integer getSpan() {
        return span;
    }

    public void setSpan(Integer span) {
        this.span = span;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}