package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardToCardListContentSrv {
    @JsonProperty("SourceCardNumber")
    private String SourceCardNumber;
    @JsonProperty("SourceDepositNumber")
    private String SourceDepositNumber;
    @JsonProperty("DestinationCardNumber")
    private String DestinationCardNumber;
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("TransactionDate")
    private String TransactionDate;
    @JsonProperty("RefrenceNumber")
    private String RefrenceNumber;
    @JsonProperty("SequenceNumber")
    private String SequenceNumber;
    @JsonProperty("SourceNote")
    private String SourceNote;
    @JsonProperty("DestinationNote")
    private String DestinationNote;
    @JsonProperty("IsSuccess")
    private String IsSuccess;
    @JsonProperty("IpgMessageCode")
    private String IpgMessageCode;
    @JsonProperty("Message")
    private String Message;


    public String getSourceCardNumber() {
        return SourceCardNumber;
    }

    public void setSourceCardNumber(String sourceCardNumber) {
        SourceCardNumber = sourceCardNumber;
    }

    public String getSourceDepositNumber() {
        return SourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        SourceDepositNumber = sourceDepositNumber;
    }

    public String getDestinationCardNumber() {
        return DestinationCardNumber;
    }

    public void setDestinationCardNumber(String destinationCardNumber) {
        DestinationCardNumber = destinationCardNumber;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        TransactionDate = transactionDate;
    }

    public String getRefrenceNumber() {
        return RefrenceNumber;
    }

    public void setRefrenceNumber(String refrenceNumber) {
        RefrenceNumber = refrenceNumber;
    }

    public String getSequenceNumber() {
        return SequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        SequenceNumber = sequenceNumber;
    }

    public String getSourceNote() {
        return SourceNote;
    }

    public void setSourceNote(String sourceNote) {
        SourceNote = sourceNote;
    }

    public String getDestinationNote() {
        return DestinationNote;
    }

    public void setDestinationNote(String destinationNote) {
        DestinationNote = destinationNote;
    }

    public String getIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        IsSuccess = isSuccess;
    }

    public String getIpgMessageCode() {
        return IpgMessageCode;
    }

    public void setIpgMessageCode(String ipgMessageCode) {
        IpgMessageCode = ipgMessageCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
