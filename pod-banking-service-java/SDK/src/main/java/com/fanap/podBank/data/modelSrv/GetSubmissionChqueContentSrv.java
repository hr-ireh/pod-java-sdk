package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSubmissionChqueContentSrv {
    @JsonProperty("Date")
    private String Date;
    @JsonProperty("Number")
    private String Number;
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("IssuerBank")
    private String IssuerBank;
    @JsonProperty("IssuerBankCode")
    private String IssuerBankCode;
    @JsonProperty("SubmitionDate")
    private String SubmitionDate;
    @JsonProperty("TransferMoneyBillNumber")
    private String TransferMoneyBillNumber;
    @JsonProperty("Status")
    private String Status;
    @JsonProperty("TypeCode")
    private String TypeCode;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getIssuerBank() {
        return IssuerBank;
    }

    public void setIssuerBank(String issuerBank) {
        IssuerBank = issuerBank;
    }

    public String getIssuerBankCode() {
        return IssuerBankCode;
    }

    public void setIssuerBankCode(String issuerBankCode) {
        IssuerBankCode = issuerBankCode;
    }

    public String getSubmitionDate() {
        return SubmitionDate;
    }

    public void setSubmitionDate(String submitionDate) {
        SubmitionDate = submitionDate;
    }

    public String getTransferMoneyBillNumber() {
        return TransferMoneyBillNumber;
    }

    public void setTransferMoneyBillNumber(String transferMoneyBillNumber) {
        TransferMoneyBillNumber = transferMoneyBillNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String typeCode) {
        TypeCode = typeCode;
    }
}
