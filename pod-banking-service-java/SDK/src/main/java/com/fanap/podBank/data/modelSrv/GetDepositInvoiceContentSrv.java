package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDepositInvoiceContentSrv {
    @JsonProperty("TransactionDate")
    private String TransactionDate;
    @JsonProperty("DeptorAmount")
    private String DeptorAmount;
    @JsonProperty("CreditorAmount")
    private String CreditorAmount;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DocNumber")
    private String DocNumber;
    @JsonProperty("ChqNumber")
    private String ChqNumber;
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("PaymentId")
    private String PaymentId;
    @JsonProperty("BranchCode")
    private String BranchCode;
    @JsonProperty("BranchName")
    private String BranchName;
    @JsonProperty("TransactionSideSrcDepositNum")
    private String TransactionSideSrcDepositNum;
    @JsonProperty("TransactionSideLastName")
    private String TransactionSideLastName;
    @JsonProperty("TransactionSideDestDepositNum")
    private String TransactionSideDestDepositNum;
    @JsonProperty("TransactionSideFirstName")
    private String TransactionSideFirstName;
    @JsonProperty("TransactionCode")
    private String TransactionCode;

    public String getTransactionSideSrcDepositNum() {
        return TransactionSideSrcDepositNum;
    }

    public void setTransactionSideSrcDepositNum(String transactionSideSrcDepositNum) {
        TransactionSideSrcDepositNum = transactionSideSrcDepositNum;
    }

    public String getTransactionSideLastName() {
        return TransactionSideLastName;
    }

    public void setTransactionSideLastName(String transactionSideLastName) {
        TransactionSideLastName = transactionSideLastName;
    }

    public String getTransactionSideDestDepositNum() {
        return TransactionSideDestDepositNum;
    }

    public void setTransactionSideDestDepositNum(String transactionSideDestDepositNum) {
        TransactionSideDestDepositNum = transactionSideDestDepositNum;
    }

    public String getTransactionSideFirstName() {
        return TransactionSideFirstName;
    }

    public void setTransactionSideFirstName(String transactionSideFirstName) {
        TransactionSideFirstName = transactionSideFirstName;
    }

    public String getTransactionCode() {
        return TransactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        TransactionCode = transactionCode;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        TransactionDate = transactionDate;
    }

    public String getDeptorAmount() {
        return DeptorAmount;
    }

    public void setDeptorAmount(String deptorAmount) {
        DeptorAmount = deptorAmount;
    }

    public String getCreditorAmount() {
        return CreditorAmount;
    }

    public void setCreditorAmount(String creditorAmount) {
        CreditorAmount = creditorAmount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(String docNumber) {
        DocNumber = docNumber;
    }

    public String getChqNumber() {
        return ChqNumber;
    }

    public void setChqNumber(String chqNumber) {
        ChqNumber = chqNumber;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(String paymentId) {
        PaymentId = paymentId;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String branchCode) {
        BranchCode = branchCode;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }
}
