package com.fanap.AvandService.data.modelSrv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class InvoiceSrv implements Serializable {
    private long id;
    private BigDecimal totalAmountWithoutDiscount;
    private BigDecimal delegationAmount;
    private BigDecimal totalAmount;
    private BigDecimal payableAmount;
    private BigDecimal vat;
    private long issuanceDate;
    private long deliveryDate;
    private String billNumber;
    private String issuancePersianDate;
    private String paymentBillNumber;
    private BankGatewaySrv bankGateway;
    private String transactionReferenceId;
    private String uniqueNumber;
    private Long trackerId;
    private Long terminalNumber;
    private String description;
    private long paymentDate;
    private boolean payed;
    private long serial;
    private boolean canceled;
    private long cancelDate;
    private BusinessSoftSrv business;
    private List<InvoiceItemSrv> invoiceItemSrvs;
    private GuildSrv guildSrv;
    private AddressSrv addressSrv;
    private UserSrv userSrv;
    private String phoneNumber;
    private String cellphoneNumber;
    private boolean closed;
    private boolean verificationNeeded;
    private Long verificationDate;
    private boolean isWaiting;
    private Long editedInvoiceId;
    private boolean isEdited;
    private String wallet;
    private String metadata;
    private boolean isSubInvoice;
    private InvoiceSrv customerInvoice;
    private List<InvoiceSrv> subInvoices;
    private boolean safe;
    private boolean postVoucherEnabled;
    private String referenceNumber;
    private String lastFourDigitOfCardNumber;
    private String maskedCardNumber;
    private UserSrv issuerSrv;
    private Long willBePaidAt;
    private boolean willBeBlocked;
    private Long willBlockedFor;
    private boolean willBePaid;

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

    public UserSrv getIssuerSrv() {
        return issuerSrv;
    }

    public void setIssuerSrv(UserSrv issuerSrv) {
        this.issuerSrv = issuerSrv;
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

    public String getIssuancePersianDate() {
        return issuancePersianDate;
    }

    public void setIssuancePersianDate(String issuancePersianDate) {
        this.issuancePersianDate = issuancePersianDate;
    }

    public String getPaymentBillNumber() {
        return paymentBillNumber;
    }

    public void setPaymentBillNumber(String paymentBillNumber) {
        this.paymentBillNumber = paymentBillNumber;
    }

    public BankGatewaySrv getBankGateway() {
        return bankGateway;
    }

    public void setBankGateway(BankGatewaySrv bankGateway) {
        this.bankGateway = bankGateway;
    }

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Long getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Long trackerId) {
        this.trackerId = trackerId;
    }

    public Long getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(Long terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public AddressSrv getAddressSrv() {
        return addressSrv;
    }

    public void setAddressSrv(AddressSrv addressSrv) {
        this.addressSrv = addressSrv;
    }

    public UserSrv getUserSrv() {
        return userSrv;
    }

    public void setUserSrv(UserSrv userSrv) {
        this.userSrv = userSrv;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
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

    public Long getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Long verificationDate) {
        this.verificationDate = verificationDate;
    }

    public boolean isWaiting() {
        return isWaiting;
    }

    public void setWaiting(boolean waiting) {
        isWaiting = waiting;
    }

    public Long getEditedInvoiceId() {
        return editedInvoiceId;
    }

    public void setEditedInvoiceId(Long editedInvoiceId) {
        this.editedInvoiceId = editedInvoiceId;
    }

    public boolean isEdited() {
        return isEdited;
    }

    public void setEdited(boolean edited) {
        isEdited = edited;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public boolean isSubInvoice() {
        return isSubInvoice;
    }

    public void setSubInvoice(boolean subInvoice) {
        isSubInvoice = subInvoice;
    }

    public InvoiceSrv getCustomerInvoice() {
        return customerInvoice;
    }

    public void setCustomerInvoice(InvoiceSrv customerInvoice) {
        this.customerInvoice = customerInvoice;
    }

    public List<InvoiceSrv> getSubInvoices() {
        return subInvoices;
    }

    public void setSubInvoices(List<InvoiceSrv> subInvoices) {
        this.subInvoices = subInvoices;
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

    public String getLastFourDigitOfCardNumber() {
        return lastFourDigitOfCardNumber;
    }

    public void setLastFourDigitOfCardNumber(String lastFourDigitOfCardNumber) {
        this.lastFourDigitOfCardNumber = lastFourDigitOfCardNumber;
    }

    public Long getWillBePaidAt() {
        return willBePaidAt;
    }

    public void setWillBePaidAt(Long willBePaidAt) {
        this.willBePaidAt = willBePaidAt;
    }

    public boolean isWillBeBlocked() {
        return willBeBlocked;
    }

    public void setWillBeBlocked(boolean willBeBlocked) {
        this.willBeBlocked = willBeBlocked;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public Long getWillBlockedFor() {
        return willBlockedFor;
    }

    public void setWillBlockedFor(Long willBlockedFor) {
        this.willBlockedFor = willBlockedFor;
    }

    public boolean isWillBePaid() {
        return willBePaid;
    }

    public void setWillBePaid(boolean willBePaid) {
        this.willBePaid = willBePaid;
    }
}
