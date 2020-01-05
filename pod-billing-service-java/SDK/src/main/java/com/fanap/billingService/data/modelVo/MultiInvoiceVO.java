package com.fanap.billingService.data.modelVo;


import java.io.Serializable;
import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class MultiInvoiceVO implements Serializable {
    private Long preferedTrackerId;
    private Long paymentTerminalNumber;
    private String redirectURL;
    private Long userId;
    private String deadline;
    private String currencyCode;
    private Long addressId;
    private List<String> voucherHashs;
    private Double preferredTaxRate;
    private boolean verificationNeeded;
    private boolean verifyAfterTimeout;
    private boolean preview;
    private SubInvoiceVO mainInvoice;
    private List<SubInvoiceVO> subInvoices;
    private String customerDescription;
    private String customerMetadata;
    private List<InvoiceItemVO> customerInvoiceItemVOs;
    private boolean safe;
    private boolean postVoucherEnabled;
    private InvoiceEventVO event;

    public Long getPreferedTrackerId() {
        return preferedTrackerId;
    }

    public void setPreferedTrackerId(Long preferedTrackerId) {
        this.preferedTrackerId = preferedTrackerId;
    }

    public Long getPaymentTerminalNumber() {
        return paymentTerminalNumber;
    }

    public void setPaymentTerminalNumber(Long paymentTerminalNumber) {
        this.paymentTerminalNumber = paymentTerminalNumber;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public List<String> getVoucherHashs() {
        return voucherHashs;
    }

    public void setVoucherHashs(List<String> voucherHashs) {
        this.voucherHashs = voucherHashs;
    }

    public Double getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public void setPreferredTaxRate(Double preferredTaxRate) {
        this.preferredTaxRate = preferredTaxRate;
    }

    public boolean getVerificationNeeded() {
        return verificationNeeded;
    }

    public void setVerificationNeeded(boolean verificationNeeded) {
        this.verificationNeeded = verificationNeeded;
    }

    public boolean getVerifyAfterTimeout() {
        return verifyAfterTimeout;
    }

    public void setVerifyAfterTimeout(boolean verifyAfterTimeout) {
        this.verifyAfterTimeout = verifyAfterTimeout;
    }

    public boolean getPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

    public SubInvoiceVO getMainInvoice() {
        return mainInvoice;
    }

    public void setMainInvoice(SubInvoiceVO mainInvoice) {
        this.mainInvoice = mainInvoice;
    }

    public List<SubInvoiceVO> getSubInvoices() {
        return subInvoices;
    }

    public void setSubInvoices(List<SubInvoiceVO> subInvoices) {
        this.subInvoices = subInvoices;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public String getCustomerMetadata() {
        return customerMetadata;
    }

    public void setCustomerMetadata(String customerMetadata) {
        this.customerMetadata = customerMetadata;
    }

    public List<InvoiceItemVO> getCustomerInvoiceItemVOs() {
        return customerInvoiceItemVOs;
    }

    public void setCustomerInvoiceItemVOs(List<InvoiceItemVO> customerInvoiceItemVOs) {
        this.customerInvoiceItemVOs = customerInvoiceItemVOs;
    }

    public boolean getSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public boolean getPostVoucherEnabled() {
        return postVoucherEnabled;
    }

    public void setPostVoucherEnabled(boolean postVoucherEnabled) {
        this.postVoucherEnabled = postVoucherEnabled;
    }

    public InvoiceEventVO getEvent() {
        return event;
    }

    public void setEvent(InvoiceEventVO event) {
        this.event = event;
    }
}
