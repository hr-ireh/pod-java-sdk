package com.fanap.billingService.data.modelVo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class MultiInvoiceDataVo implements Serializable {


    private String redirectURL;
    private Long userId;
    private String currencyCode;
    private List<String> voucherHashs;
    private String preferredTaxRate;
    private String verificationNeeded;
    private String preview;
    private MainInvoiceVo mainInvoice;
    private List<SubInvoiceVO> subInvoices;
    private String customerDescription;
    private String customerMetadata;
    private List<InvoiceItemVO> customerInvoiceItems;


    public MultiInvoiceDataVo setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
        return this;
    }

    public MultiInvoiceDataVo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public MultiInvoiceDataVo setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public MultiInvoiceDataVo setVoucherHashs(List<String> voucherHashs) {
        this.voucherHashs = voucherHashs;
        return this;
    }

    public MultiInvoiceDataVo setPreferredTaxRate(String preferredTaxRate) {
        this.preferredTaxRate = preferredTaxRate;
        return this;
    }

    public MultiInvoiceDataVo setVerificationNeeded(String verificationNeeded) {
        this.verificationNeeded = verificationNeeded;
        return this;
    }

    public MultiInvoiceDataVo setPreview(String preview) {
        this.preview = preview;
        return this;
    }

    public MultiInvoiceDataVo setMainInvoice(MainInvoiceVo mainInvoice) {
        this.mainInvoice = mainInvoice;
        return this;
    }

    public MultiInvoiceDataVo setSubInvoices(List<SubInvoiceVO> subInvoices) {
        this.subInvoices = subInvoices;
        return this;
    }

    public MultiInvoiceDataVo setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
        return this;
    }

    public MultiInvoiceDataVo setCustomerMetadata(String customerMetadata) {
        this.customerMetadata = customerMetadata;
        return this;
    }

    public MultiInvoiceDataVo setCustomerInvoiceItemVOs(List<InvoiceItemVO> customerInvoiceItemVOs) {
        this.customerInvoiceItems = customerInvoiceItemVOs;
        return this;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public Long getUserId() {
        return userId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public List<String> getVoucherHashs() {
        return voucherHashs;
    }

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public String getVerificationNeeded() {
        return verificationNeeded;
    }

    public String getPreview() {
        return preview;
    }


    public MainInvoiceVo getMainInvoice() {
        return mainInvoice;
    }

    public List<SubInvoiceVO> getSubInvoices() {
        return subInvoices;
    }

    public List<InvoiceItemVO> getCustomerInvoiceItemVOs() {
        return customerInvoiceItems;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public String getCustomerMetadata() {
        return customerMetadata;
    }


}



