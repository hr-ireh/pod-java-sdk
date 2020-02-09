package com.fanap.podVirtualAccount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class AccountBillItemSrv implements Serializable {
    private String accountName;
    private long issuanceDate;
    private BigDecimal amount;
    private boolean debtor;
    private BigDecimal afterTxAmount;
    private String description;
    private long documentId;
    private String txNumber;
    private String issuerName;
    private boolean canceled;
    private CurrencySrv currency;
    private Long invoiceId;
    private String invoiceBillNumber;
    private Boolean invoiceClosed;
    private Boolean billSettled;
    private Boolean withdrawable;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(long issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isDebtor() {
        return debtor;
    }

    public void setDebtor(boolean debtor) {
        this.debtor = debtor;
    }

    public BigDecimal getAfterTxAmount() {
        return afterTxAmount;
    }

    public void setAfterTxAmount(BigDecimal afterTxAmount) {
        this.afterTxAmount = afterTxAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

    public String getTxNumber() {
        return txNumber;
    }

    public void setTxNumber(String txNumber) {
        this.txNumber = txNumber;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceBillNumber() {
        return invoiceBillNumber;
    }

    public void setInvoiceBillNumber(String invoiceBillNumber) {
        this.invoiceBillNumber = invoiceBillNumber;
    }

    public Boolean getInvoiceClosed() {
        return invoiceClosed;
    }

    public void setInvoiceClosed(Boolean invoiceClosed) {
        this.invoiceClosed = invoiceClosed;
    }

    public Boolean getBillSettled() {
        return billSettled;
    }

    public void setBillSettled(Boolean billSettled) {
        this.billSettled = billSettled;
    }

    public Boolean getWithdrawable() {
        return withdrawable;
    }

    public void setWithdrawable(Boolean withdrawable) {
        this.withdrawable = withdrawable;
    }
}
