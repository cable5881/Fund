package com.fund.po;

public class Moneycheck {
    private Integer moneycheckId;

    private Double moneyInCount;

    private Double moneyOutCount;

    private Byte moneystate;

    private Byte state;

    public Integer getMoneycheckId() {
        return moneycheckId;
    }

    public void setMoneycheckId(Integer moneycheckId) {
        this.moneycheckId = moneycheckId;
    }

    public Double getMoneyInCount() {
        return moneyInCount;
    }

    public void setMoneyInCount(Double moneyInCount) {
        this.moneyInCount = moneyInCount;
    }

    public Double getMoneyOutCount() {
        return moneyOutCount;
    }

    public void setMoneyOutCount(Double moneyOutCount) {
        this.moneyOutCount = moneyOutCount;
    }

    public Byte getMoneystate() {
        return moneystate;
    }

    public void setMoneystate(Byte moneystate) {
        this.moneystate = moneystate;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}