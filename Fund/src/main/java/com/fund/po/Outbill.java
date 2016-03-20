package com.fund.po;

import java.util.Date;

public class Outbill {
    private Integer outbillId;

    private Integer moneycheckId;

    private Double moneyOut;

    private Date timeOut;

    private Byte state;

    public Integer getOutbillId() {
        return outbillId;
    }

    public void setOutbillId(Integer outbillId) {
        this.outbillId = outbillId;
    }

    public Integer getMoneycheckId() {
        return moneycheckId;
    }

    public void setMoneycheckId(Integer moneycheckId) {
        this.moneycheckId = moneycheckId;
    }

    public Double getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(Double moneyOut) {
        this.moneyOut = moneyOut;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}