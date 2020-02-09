package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BuyCreditVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and serevrType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String redirectUri;
    private String callUri;

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getCallUri() {
        return callUri;
    }

    public BuyCreditVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.redirectUri = builder.getRedirectUri();
        this.callUri = builder.getCallUri();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String redirectUri;
        private String callUri;


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

        public BuyCreditVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null)
                return new BuyCreditVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }

    }

    public String getLink() {
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            return "https://pay.pod.ir/v1/pbc/BuyCredit/?redirectUri=" + redirectUri + "&callUri=" + callUri;
        else
            return "https://sandbox.pod.ir:1033/v1/pbc/BuyCredit/?redirectUri=" + redirectUri + "&callUri=" + callUri;
    }

}
