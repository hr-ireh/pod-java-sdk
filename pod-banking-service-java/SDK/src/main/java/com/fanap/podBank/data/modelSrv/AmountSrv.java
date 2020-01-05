package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AmountSrv {
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("CurrencySwiftCode")
    private String CurrencySwiftCode;
    @JsonProperty("CurrencyISOCode")
    private String CurrencyISOCode;
    @JsonProperty("CurrencyName")
    private String CurrencyName;

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getCurrencySwiftCode() {
        return CurrencySwiftCode;
    }

    public void setCurrencySwiftCode(String currencySwiftCode) {
        CurrencySwiftCode = currencySwiftCode;
    }

    public String getCurrencyISOCode() {
        return CurrencyISOCode;
    }

    public void setCurrencyISOCode(String currencyISOCode) {
        CurrencyISOCode = currencyISOCode;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }
}
