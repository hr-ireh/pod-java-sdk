package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.enums.EnumBaseURLPrivate;
import com.fanap.billingService.exception.PodException;

public class PayInvoiceByUniqueNumberVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and uniqueNumber are required parameters!";

    public BaseInfoVo baseInfoVo;
    public String uniqueNumber;
    public String redirectUri;
    public String callUri;
    public String gateway;


    public PayInvoiceByUniqueNumberVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.uniqueNumber = builder.getUniqueNumber();
        this.redirectUri = builder.getRedirectUri();
        this.callUri = builder.getCallUri();
        this.gateway = builder.getGateway();

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getCallUri() {
        return callUri;
    }

    public String getGateway() {
        return gateway;
    }


    public static class Builder {

        public BaseInfoVo baseInfoVo;
        public String uniqueNumber;
        public String redirectUri;
        public String callUri;
        public String gateway;

        public String getUniqueNumber() {
            return uniqueNumber;
        }

        public Builder setUniqueNumber(String uniqueNumber) {
            this.uniqueNumber = uniqueNumber;
            return this;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public String getCallUri() {
            return callUri;
        }

        public Builder setCallUri(String callUri) {
            this.callUri = callUri;
            return this;
        }

        public String getGateway() {
            return gateway;
        }

        public Builder setGateway(String gateway) {
            this.gateway = gateway;
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


        public PayInvoiceByUniqueNumberVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getUniqueNumber() != null)
                return new PayInvoiceByUniqueNumberVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }

    public String getLink() {
        String link = EnumBaseURLPrivate.PRODUCTION.getValue() + "/v1/pbc/payInvoiceByUniqueNumber/?uniqueNumber=" + uniqueNumber + "&gateway=" + gateway + "&redirectUri=" + redirectUri + "&callUri=" + callUri;
        return link;
    }


}











