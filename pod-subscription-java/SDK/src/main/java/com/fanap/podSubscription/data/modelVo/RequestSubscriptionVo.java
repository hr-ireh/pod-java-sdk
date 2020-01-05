package com.fanap.podSubscription.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.util.ScProductIdPodServicesProduction;
import com.fanap.podSubscription.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class RequestSubscriptionVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, subscriptionPlanId  and userId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String userId;
    private String subscriptionPlanId;
    private static String scProductId;


    public String getUserId() {
        return userId;
    }

    public String getSubscriptionPlanId() {
        return subscriptionPlanId;
    }


    public static String getScProductId() {
        return scProductId;
    }

    public RequestSubscriptionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.subscriptionPlanId = TypeConversionUtil.longToString(builder.getSubscriptionPlanId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_REQUEST_SUBSCRIPTION);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_REQUEST_SUBSCRIPTION);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long userId;
        private Long subscriptionPlanId;

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Long getSubscriptionPlanId() {
            return subscriptionPlanId;
        }

        public Builder setSubscriptionPlanId(Long subscriptionPlanId) {
            this.subscriptionPlanId = subscriptionPlanId;
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

        public RequestSubscriptionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.userId != null && this.subscriptionPlanId != null)
                return new RequestSubscriptionVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}




