package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PayaSeriviceContentSrv {
    @JsonProperty("ReferenceNumber")
    private String ReferenceNumber;
    @JsonProperty("DestinationBankName")
    private String DestinationBankName;
    @JsonProperty("State")
    private String State;
    @JsonProperty("BatchNumber")
    private Long BatchNumber;
    @JsonProperty("BatchTransferId")
    private Long BatchTransferId;
    @JsonProperty("Amount")
    private Long Amount;
    @JsonProperty("BeneficiaryFullName")
    private String BeneficiaryFullName;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DestShebaNumber")
    private String DestShebaNumber;
    @JsonProperty("BillNumber")
    private String BillNumber;
    @JsonProperty("InquiryName")
    private String InquiryName;

    public Long getBatchNumber() {
        return BatchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        BatchNumber = batchNumber;
    }

    public Long getBatchTransferId() {
        return BatchTransferId;
    }

    public void setBatchTransferId(Long batchTransferId) {
        BatchTransferId = batchTransferId;
    }

    public String getInquiryName() {
        return InquiryName;
    }

    public void setInquiryName(String inquiryName) {
        InquiryName = inquiryName;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public String getDestinationBankName() {
        return DestinationBankName;
    }

    public void setDestinationBankName(String destinationBankName) {
        DestinationBankName = destinationBankName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
        Amount = amount;
    }

    public String getBeneficiaryFullName() {
        return BeneficiaryFullName;
    }

    public void setBeneficiaryFullName(String beneficiaryFullName) {
        BeneficiaryFullName = beneficiaryFullName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDestShebaNumber() {
        return DestShebaNumber;
    }

    public void setDestShebaNumber(String destShebaNumber) {
        DestShebaNumber = destShebaNumber;
    }

    public String getBillNumber() {
        return BillNumber;
    }

    public void setBillNumber(String billNumber) {
        BillNumber = billNumber;
    }
}
