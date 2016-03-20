package com.fund.po;

public class CurrencyType {
    private Integer currencytypeId;

    private String currencyName;

    private String symbol;

    private Byte state;

    public Integer getCurrencytypeId() {
        return currencytypeId;
    }

    public void setCurrencytypeId(Integer currencytypeId) {
        this.currencytypeId = currencytypeId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}