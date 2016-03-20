package com.fund.po;

import java.util.Date;

public class Inbill {
    private Integer inbillId;

    private Integer moneycheckId;

    private String moneyNum;

    private String payer;

    private Double moneyIn;

    private Date timeIn;

    private Byte state;

    public Integer getInbillId() {
        return inbillId;
    }

    public void setInbillId(Integer inbillId) {
        this.inbillId = inbillId;
    }

    public Integer getMoneycheckId() {
        return moneycheckId;
    }

    public void setMoneycheckId(Integer moneycheckId) {
        this.moneycheckId = moneycheckId;
    }

    public String getMoneyNum() {
        return moneyNum;
    }

    public void setMoneyNum(String moneyNum) {
        this.moneyNum = moneyNum == null ? null : moneyNum.trim();
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public Double getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(Double moneyIn) {
        this.moneyIn = moneyIn;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}