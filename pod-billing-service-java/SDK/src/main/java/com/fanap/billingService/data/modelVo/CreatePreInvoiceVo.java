package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.data.modelSrv.LinkSrv;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class CreatePreInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, ott, productInfos, guildCode, redirectUri and userId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String token;
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
    private String preferredTaxRate;
    private String verificationNeeded;
    private String callUrl;
    private static String scProductId;


    public String getCallUrl() {
        return callUrl;
    }

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

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public String getVerificationNeeded() {
        return verificationNeeded;
    }

    public String getToken() {
        return token;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public CreatePreInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.redirectURL = builder.getRedirectURL();
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.billNumber = builder.getBillNumber();
        this.description = builder.getDescription();
        this.deadline = builder.getDeadline();
        for (ProductInfo productInfo : builder.getProductInfos()) {
            this.entityId.add(productInfo.getProductId().toString());
            this.price.add(productInfo.getPrice().toString());
            this.quantity.add(productInfo.getQuantity().toString());
            this.productDescription.add(productInfo.getProductDescription());
        }
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.preferredTaxRate = TypeConversionUtil.decimalToString(builder.getPreferredTaxRate());
        this.verificationNeeded = builder.getVerificationNeeded();
        this.callUrl = builder.getCallUrl();
        this.token = builder.getToken();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.SERVICE_CREAT_PRE_INVOICE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.SERVICE_CREAT_PRE_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String token;
        private String redirectURL;
        private Long userId;
        private String billNumber;
        private String description;
        private String deadline;
        private List<ProductInfo> productInfos = new ArrayList<>();
        private String guildCode;
        private String currencyCode;
        private BigDecimal preferredTaxRate;
        private String verificationNeeded;
        private String callUrl;

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Builder setProductInfos(List<ProductInfo> productInfos) {
            this.productInfos = productInfos;
            return this;
        }

        public List<ProductInfo> getProductInfos() {
            return productInfos;
        }

        public String getCallUrl() {
            return callUrl;
        }

        public Builder setCallUrl(String callUrl) {
            this.callUrl = callUrl;
            return this;
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

        public BigDecimal getPreferredTaxRate() {
            return preferredTaxRate;
        }

        public Builder setPreferredTaxRate(BigDecimal preferredTaxRate) {
            this.preferredTaxRate = preferredTaxRate;
            return this;
        }

        public String getVerificationNeeded() {
            return verificationNeeded;
        }

        public Builder setVerificationNeeded(String verificationNeeded) {
            this.verificationNeeded = verificationNeeded;
            return this;
        }

        public CreatePreInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getOtt() != null && this.redirectURL != null &&

                    this.productInfos != null &&
                    this.productInfos.size() != 0 && this.guildCode != null)
                return new CreatePreInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


    public LinkSrv getLink(String hashCode) throws PodException {
        if (hashCode == null || hashCode.isEmpty() == true)

            throw PodException.invalidParameter("The field is required.");

        LinkSrv linkSrv = new LinkSrv();
        linkSrv.setHashCode(hashCode);
        linkSrv.setRedirectUrl("https://pay.pod.ir/v1/pbc/preinvoice/" + hashCode);

        return linkSrv;
    }
}




