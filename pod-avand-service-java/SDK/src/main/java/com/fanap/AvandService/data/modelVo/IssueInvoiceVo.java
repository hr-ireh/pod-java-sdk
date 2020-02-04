package com.fanap.AvandService.data.modelVo;

import com.fanap.AvandService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class IssueInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, redirectUri, price, userId and businessId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String redirectUri;
    private String userId;
    private String businessId;
    private String price;
    private static String scProductId;

    public String getUserId() {
        return userId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getBusinessId() {
        return businessId;
    }

    public String getPrice() {
        return price;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public IssueInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.redirectUri = builder.getRedirectUri();
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.price = TypeConversionUtil.doubleToString(builder.getPrice());
//        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ISSUE_INVOICE);
//        else
//            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ISSUE_INVOICE);
//
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String redirectUri;
        private Long userId;
        private Long businessId;
        private Double price;


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

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

        public Double getPrice() {
            return price;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public IssueInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.redirectUri != null
                    && this.userId != null && this.businessId != null && this.price != null)
                return new IssueInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
