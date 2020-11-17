package com.fanap.billingService.data.modelSrv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class InvoiceWithBillNumberSrv implements Serializable {
    private long id;
    private BigDecimal totalAmountWithoutDiscount;
    private BigDecimal delegationAmount;
    private BigDecimal totalAmount;
    private BigDecimal payableAmount;
    private BigDecimal vat;
    private long issuanceDate;
    private long deliveryDate;
    private String billNumber;
    private String paymentBillNumber;
    private String uniqueNumber;
    private long paymentDate;
    private boolean payed;
    private long serial;
    private boolean canceled;
    private long cancelDate;
    private BusinessSoftSrv business;
    private List<InvoiceItemSrv> invoiceItemSrvs;
    private GuildSrv guildSrv;
    private boolean closed;
    private boolean verificationNeeded;
    private boolean safe;
    private boolean postVoucherEnabled;
    private String referenceNumber;
    private UserSrv issuerSrv;
    private boolean willBeBlocked;
    private boolean willBePaid;
    private int unsafeCloseTimeOut;
    private boolean withdrawable;
    private int shaparakTransactionDate;
    private String depositId;
    private String depositBillId;
    private boolean edited;
    private boolean waiting;
    private boolean subInvoice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getTotalAmountWithoutDiscount() {
        return totalAmountWithoutDiscount;
    }

    public void setTotalAmountWithoutDiscount(BigDecimal totalAmountWithoutDiscount) {
        this.totalAmountWithoutDiscount = totalAmountWithoutDiscount;
    }

    public BigDecimal getDelegationAmount() {
        return delegationAmount;
    }

    public void setDelegationAmount(BigDecimal delegationAmount) {
        this.delegationAmount = delegationAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public long getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(long issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getPaymentBillNumber() {
        return paymentBillNumber;
    }

    public void setPaymentBillNumber(String paymentBillNumber) {
        this.paymentBillNumber = paymentBillNumber;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public long getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(long paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public long getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(long cancelDate) {
        this.cancelDate = cancelDate;
    }

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public List<InvoiceItemSrv> getInvoiceItemSrvs() {
        return invoiceItemSrvs;
    }

    public void setInvoiceItemSrvs(List<InvoiceItemSrv> invoiceItemSrvs) {
        this.invoiceItemSrvs = invoiceItemSrvs;
    }

    public GuildSrv getGuildSrv() {
        return guildSrv;
    }

    public void setGuildSrv(GuildSrv guildSrv) {
        this.guildSrv = guildSrv;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isVerificationNeeded() {
        return verificationNeeded;
    }

    public void setVerificationNeeded(boolean verificationNeeded) {
        this.verificationNeeded = verificationNeeded;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public boolean isPostVoucherEnabled() {
        return postVoucherEnabled;
    }

    public void setPostVoucherEnabled(boolean postVoucherEnabled) {
        this.postVoucherEnabled = postVoucherEnabled;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public UserSrv getIssuerSrv() {
        return issuerSrv;
    }

    public void setIssuerSrv(UserSrv issuerSrv) {
        this.issuerSrv = issuerSrv;
    }

    public boolean isWillBeBlocked() {
        return willBeBlocked;
    }

    public void setWillBeBlocked(boolean willBeBlocked) {
        this.willBeBlocked = willBeBlocked;
    }

    public boolean isWillBePaid() {
        return willBePaid;
    }

    public void setWillBePaid(boolean willBePaid) {
        this.willBePaid = willBePaid;
    }

    public int getUnsafeCloseTimeOut() {
        return unsafeCloseTimeOut;
    }

    public void setUnsafeCloseTimeOut(int unsafeCloseTimeOut) {
        this.unsafeCloseTimeOut = unsafeCloseTimeOut;
    }

    public boolean isWithdrawable() {
        return withdrawable;
    }

    public void setWithdrawable(boolean withdrawable) {
        this.withdrawable = withdrawable;
    }

    public int getShaparakTransactionDate() {
        return shaparakTransactionDate;
    }

    public void setShaparakTransactionDate(int shaparakTransactionDate) {
        this.shaparakTransactionDate = shaparakTransactionDate;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getDepositBillId() {
        return depositBillId;
    }

    public void setDepositBillId(String depositBillId) {
        this.depositBillId = depositBillId;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public boolean isWaiting() {
        return waiting;
    }

    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    public boolean isSubInvoice() {
        return subInvoice;
    }

    public void setSubInvoice(boolean subInvoice) {
        this.subInvoice = subInvoice;
    }
}
