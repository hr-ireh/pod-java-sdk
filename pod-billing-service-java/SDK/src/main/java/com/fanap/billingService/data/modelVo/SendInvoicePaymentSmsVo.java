package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class SendInvoicePaymentSmsVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private String callbackUri;
    private String redirectUri;
    private String delegationId;
    private String forceDelegation;
    private String wallet;
    private static String scProductId;


    public SendInvoicePaymentSmsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.callbackUri = builder.getCallbackUri();
        this.redirectUri = builder.getRedirectUri();
        this.delegationId = TypeConversionUtil.longToString(builder.getDelegationId());
        this.forceDelegation = TypeConversionUtil.booleanToString(builder.getForceDelegation());
        this.wallet = builder.getWallet();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_SEND_INVOICE_PAYMENT_SMS);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_SEND_INVOICE_PAYMENT_SMS);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCallbackUri() {
        return callbackUri;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getDelegationId() {
        return delegationId;
    }

    public String getForceDelegation() {
        return forceDelegation;
    }

    public String getWallet() {
        return wallet;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private String callbackUri;
        private String redirectUri;
        private Long delegationId;
        private Boolean forceDelegation;
        private String wallet;

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

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public String getCallbackUri() {
            return callbackUri;
        }

        public Builder setCallbackUri(String callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public Long getDelegationId() {
            return delegationId;
        }

        public Builder setDelegationId(Long delegationId) {
            this.delegationId = delegationId;
            return this;
        }

        public Boolean getForceDelegation() {
            return forceDelegation;
        }

        public Builder setForceDelegation(Boolean forceDelegation) {
            this.forceDelegation = forceDelegation;
            return this;
        }

        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public SendInvoicePaymentSmsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getInvoiceId() != null)
                return new SendInvoicePaymentSmsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
