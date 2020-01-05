package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class IssueInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ott, productInfos, userId and guildCode are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String redirectURL;
    private String userId;
    private String billNumber;
    private String description;
    private String deadline;
    private List<String> entityId = new ArrayList<>();
    private List<String> price = new ArrayList<>();
    private List<String> quantity = new ArrayList<>();
    private List<String> productDescription = new ArrayList<>();
    private String guildCode;
    private String currencyCode;
    private String addressId;
    private List<String> voucherHash;
    private String preferredTaxRate;
    private String verificationNeeded;
    private String verifyAfterTimeout;
    private String preview;
    private String metadata;
    private String safe;
    private String postVoucherEnabled;
    private String hasEvent;
    private String eventTitle;
    private String eventTimeZone;
    private List<String> eventReminders;
    private String eventDescription;
    private String eventMetadata;
    private String cellphoneNumber;
    private static String scProductId;


    public String getRedirectURL() {
        return redirectURL;
    }

    public String getUserId() {
        return userId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public List<String> getEntityId() {
        return entityId;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public List<String> getVoucherHash() {
        return voucherHash;
    }

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public String getVerificationNeeded() {
        return verificationNeeded;
    }

    public String getVerifyAfterTimeout() {
        return verifyAfterTimeout;
    }

    public String getPreview() {
        return preview;
    }

    public String getMetadata() {
        return metadata;
    }

    public String getSafe() {
        return safe;
    }

    public String getPostVoucherEnabled() {
        return postVoucherEnabled;
    }

    public String getHasEvent() {
        return hasEvent;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventTimeZone() {
        return eventTimeZone;
    }

    public List<String> getEventReminders() {
        return eventReminders;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventMetadata() {
        return eventMetadata;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public IssueInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.redirectURL = builder.getRedirectURL();
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.billNumber = builder.getBillNumber();
        this.description = builder.getDescription();
        this.deadline = builder.getDeadline();
        for (ProductInfo productInfo : builder.getProductInfos()) {
            this.entityId.add(TypeConversionUtil.longToString(productInfo.getProductId()));
            this.price.add(TypeConversionUtil.decimalToString(productInfo.getPrice()));
            this.quantity.add(TypeConversionUtil.decimalToString(productInfo.getQuantity()));
            this.productDescription.add(productInfo.getProductDescription());
        }
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.addressId = TypeConversionUtil.longToString(builder.getAddressId());
        this.voucherHash = builder.getVoucherHash();
        this.preferredTaxRate = TypeConversionUtil.doubleToString(builder.getPreferredTaxRate());
        this.verificationNeeded = TypeConversionUtil.booleanToString(builder.getVerificationNeeded());
        this.verifyAfterTimeout = TypeConversionUtil.booleanToString(builder.getVerifyAfterTimeout());
        this.preview = TypeConversionUtil.booleanToString(builder.getPreview());
        this.metadata = builder.getMetadata();
        this.safe = TypeConversionUtil.booleanToString(builder.getSafe());
        this.postVoucherEnabled =TypeConversionUtil.booleanToString(builder.getPostVoucherEnabled());
        this.hasEvent = TypeConversionUtil.booleanToString(builder.getHasEvent());
        this.eventTitle = builder.getEventTitle();
        this.eventTimeZone = builder.getEventTimeZone();
        this.eventReminders = builder.getEventReminders();
        this.eventDescription = builder.getEventDescription();
        this.eventMetadata = builder.getEventMetadata();
        this.cellphoneNumber = builder.getCellphoneNumber();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ISSUE_INVOICE);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ISSUE_INVOICE);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String redirectURL;
        private Long userId;
        private String billNumber;
        private String description;
        private String deadline;
        private List<ProductInfo> productInfos = new ArrayList<>();
        private String guildCode;
        private String currencyCode;
        private Long addressId;
        private List<String> voucherHash = new ArrayList<>();
        private Double preferredTaxRate;
        private Boolean verificationNeeded;
        private Boolean verifyAfterTimeout;
        private Boolean preview;
        private String metadata;
        private Boolean safe;
        private Boolean postVoucherEnabled;
        private Boolean hasEvent;
        private String eventTitle;
        private String eventTimeZone;
        private List<String> eventReminders;
        private String eventDescription;
        private String eventMetadata;
        private String cellphoneNumber;

        public List<ProductInfo> getProductInfos() {
            return productInfos;
        }

        public Builder setProductInfos(List<ProductInfo> productInfos) {
            this.productInfos = productInfos;
            return this;
        }

        public List<String> getEventReminders() {
            return eventReminders;
        }

        public Builder setEventReminders(List<String> eventReminders) {
            this.eventReminders = eventReminders;
            return this;
        }

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

        public String getRedirectURL() {
            return redirectURL;
        }

        public Builder setRedirectURL(String redirectURL) {
            this.redirectURL = redirectURL;
            return this;
        }

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
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

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Long getAddressId() {
            return addressId;
        }

        public Builder setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public List<String> getVoucherHash() {
            return voucherHash;
        }

        public Builder setVoucherHash(List<String> voucherHash) {
            this.voucherHash = voucherHash;
            return this;
        }

        public Double getPreferredTaxRate() {
            return preferredTaxRate;
        }

        public Builder setPreferredTaxRate(Double preferredTaxRate) {
            this.preferredTaxRate = preferredTaxRate;
            return this;
        }

        public Boolean getVerificationNeeded() {
            return verificationNeeded;
        }

        public Builder setVerificationNeeded(Boolean verificationNeeded) {
            this.verificationNeeded = verificationNeeded;
            return this;
        }

        public Boolean getVerifyAfterTimeout() {
            return verifyAfterTimeout;
        }

        public Builder setVerifyAfterTimeout(Boolean verifyAfterTimeout) {
            this.verifyAfterTimeout = verifyAfterTimeout;
            return this;
        }

        public Boolean getPreview() {
            return preview;
        }

        public Builder setPreview(Boolean preview) {
            this.preview = preview;
            return this;
        }

        public String getMetadata() {
            return metadata;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public Boolean getSafe() {
            return safe;
        }

        public Builder setSafe(Boolean safe) {
            this.safe = safe;
            return this;
        }

        public Boolean getPostVoucherEnabled() {
            return postVoucherEnabled;
        }

        public Builder setPostVoucherEnabled(Boolean postVoucherEnabled) {
            this.postVoucherEnabled = postVoucherEnabled;
            return this;
        }

        public Boolean getHasEvent() {
            return hasEvent;
        }

        public Builder setHasEvent(Boolean hasEvent) {
            this.hasEvent = hasEvent;
            return this;
        }

        public String getEventTitle() {
            return eventTitle;
        }

        public Builder setEventTitle(String eventTitle) {
            this.eventTitle = eventTitle;
            return this;
        }

        public String getEventTimeZone() {
            return eventTimeZone;
        }

        public Builder setEventTimeZone(String eventTimeZone) {
            this.eventTimeZone = eventTimeZone;
            return this;
        }


        public String getEventDescription() {
            return eventDescription;
        }

        public Builder setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }

        public String getEventMetadata() {
            return eventMetadata;
        }

        public Builder setEventMetadata(String eventMetadata) {
            this.eventMetadata = eventMetadata;
            return this;
        }

        public String getCellphoneNumber() {
            return cellphoneNumber;
        }

        public Builder setCellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public IssueInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getOtt() != null &&
                    this.productInfos != null &&
                    this.productInfos.size() != 0 &&
                    this.guildCode != null && this.userId != null)
                return new IssueInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
