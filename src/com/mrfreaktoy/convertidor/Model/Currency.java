package com.mrfreaktoy.convertidor.Model;

public class Currency extends Units {
    private String currencySymbol;

    public Currency(){

    }

    public Currency(String currencyCode, String currencyName, String currencySymbol) {
        super(currencyCode,currencyName);
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }


}
