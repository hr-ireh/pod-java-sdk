package com.fanap.podBank.data.modelVo;

public class BatchPayaItemInfoContents {
    private Long Amount;
    private String BeneficiaryFullName;
    private String Description;
    private String DestShebaNumber;
    private String BillNumber;


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
