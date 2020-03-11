package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class NLUPayBillContentSrv {
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("subIntent")
    private String subIntent;
    @JsonProperty("originAccount")
    private String originAccount;
    @JsonProperty("billId")
    private String billId;
    @JsonProperty("payId")
    private String payId;
    @JsonProperty("beneficiary")
    private String beneficiary;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("barcodeReader")
    private boolean barcodeReader;
    @JsonProperty("billType")
    private int billType;
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

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isBarcodeReader() {
        return barcodeReader;
    }

    public void setBarcodeReader(boolean barcodeReader) {
        this.barcodeReader = barcodeReader;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public Timestamp getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(Timestamp timeToGo) {
        this.timeToGo = timeToGo;
    }
}
