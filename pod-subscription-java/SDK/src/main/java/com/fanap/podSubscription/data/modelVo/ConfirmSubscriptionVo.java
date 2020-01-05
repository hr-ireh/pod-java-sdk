package com.fanap.podSubscription.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.util.ScProductIdPodServicesProduction;
import com.fanap.podSubscription.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class ConfirmSubscriptionVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, subscriptionId , code are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String code;
    private String subscriptionId;
    private static String scProductId;


    public String getCode() {
        return code;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public ConfirmSubscriptionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.code = TypeConversionUtil.longToString(builder.getCode());
        this.subscriptionId = TypeConversionUtil.longToString(builder.getSubscriptionId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_CONFIRM_SUBSCRIPTION);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_CONFIRM_SUBSCRIPTION);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long code;
        private Long subscriptionId;


        public Long getCode() {
            return code;
        }

        public Builder setCode(Long code) {
            this.code = code;
            return this;
        }

        public Long getSubscriptionId() {
            return subscriptionId;
        }

        public Builder setSubscriptionId(Long subscriptionId) {
            this.subscriptionId = subscriptionId;
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

        public ConfirmSubscriptionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.code != null && this.subscriptionId != null)
                return new ConfirmSubscriptionVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}



