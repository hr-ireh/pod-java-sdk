package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class NLUMobilePhoneChargingContentSrv {
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("subIntent")
    private String subIntent;
    @JsonProperty("originAccount")
    private String originAccount;
    @JsonProperty("mobileOperator")
    private int mobileOperator;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("chargeType")
    private int chargeType;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("timeToGo")
    private Timestamp timeToGo;

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getSubIntent() {
        return subIntent;
    }

    public void setSubIntent(String subIntent) {
        this.subIntent = subIntent;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public int getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(int mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getChargeType() {
        return chargeType;
    }

    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Timestamp getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(Timestamp timeToGo) {
        this.timeToGo = timeToGo;
    }
}
