package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.billingService.util.TypeConversionUtil;

import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class InvoiceWithBillNumberVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";
    private BaseInfoVo baseInfoVo;

    /**
     * * لیست شناسه محصولات برای بند های فاکتور. در صورتی که بند فاکتور محصول مرتبط ندارد مقدار آن 0 وارد شود
     */
    private List<String> productId;

    /**
     * * شماره قبض
     */
    private String billNumber;

    /**
     * * مبلغ بند فاکتور. برای استفاده از قیمت محصول وارد شده از مقدار auto استفاده نمایید
     */
    private List<String> price;

    /**
     * * لیست تعداد محصول در هر بند فاکتور
     */
    private List<String> quantity;

    /**
     * * توضیحات هر بند از فاکتور
     */
    private List<String> productDescription;

    /**
     * * کد صنف فاکتور
     */
    private String guildCode;

    /**
     * آدرس فراخوانی صادر کننده فاکتور
     */
    private String redirectURL;

    /**
     * شناسه کاربر مربوط به مشتری
     */
    private String userId;

    /**
     * توضیحات فاکتور
     */
    private String description;

    /**
     * تاریخ سررسید شمسی yyyy/mm/dd
     */
    private String deadline;

    /**
     * کد ارز
     */
    private String currencyCode;

    /**
     * شناسه یکی از آدرس های موجود کاربر
     */
    private String addressId;

    /**
     * پرداخت دومرحله ای true/false
     */
    private String verificationNeeded;

    private static String scProductId;

    public InvoiceWithBillNumberVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.productId = builder.getProductId();
        this.billNumber = builder.getBillNumber();
        this.price = builder.getPrice();
        this.quantity = builder.getQuantity();
        this.productDescription = builder.getProductDescription();
        this.guildCode = builder.getGuildCode();
        this.redirectURL = builder.getRedirectURL();
        this.userId = builder.getUserId();
        this.description = builder.getDescription();
        this.deadline = builder.getDeadline();
        this.currencyCode = builder.getCurrencyCode();
        this.addressId = builder.getAddressId();
        this.verificationNeeded = builder.getVerificationNeeded();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_invoice_With_Bill_Number);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_invoice_With_Bill_Number);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public List<String> getProductId() {
        return productId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public List<String> getPrice() {
        return price;
    }

    public List<String> getQuantity() {
        return quantity;
    }

    public List<String> getProductDescription() {
        return productDescription;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public String getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getVerificationNeeded() {
        return verificationNeeded;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private List<String> productId;
        private String billNumber;
        private List<String> price;
        private List<String> quantity;
        private List<String> productDescription;
        private String guildCode;
        private String redirectURL;
        private String userId;
        private String description;
        private String deadline;
        private String currencyCode;
        private String addressId;
        private String verificationNeeded;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public List<String> getProductId() {
            return productId;
        }

        public Builder setProductId(List<String> productId) {
            this.productId = productId;
            return this;
        }

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public List<String> getPrice() {
            return price;
        }

        public Builder setPrice(List<String> price) {
            this.price = price;
            return this;
        }

        public List<String> getQuantity() {
            return quantity;
        }

        public Builder setQuantity(List<String> quantity) {
            this.quantity = quantity;
            return this;
        }

        public List<String> getProductDescription() {
            return productDescription;
        }

        public Builder setProductDescription(List<String> productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getRedirectURL() {
            return redirectURL;
        }

        public Builder setRedirectURL(String redirectURL) {
            this.redirectURL = redirectURL;
            return this;
        }

        public String getUserId() {
            return userId;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getDeadline() {
            return deadline;
        }

        public Builder setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public String getAddressId() {
            return addressId;
        }

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public String getVerificationNeeded() {
            return verificationNeeded;
        }

        public Builder setVerificationNeeded(String verificationNeeded) {
            this.verificationNeeded = verificationNeeded;
            return this;
        }

        public InvoiceWithBillNumberVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new InvoiceWithBillNumberVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}