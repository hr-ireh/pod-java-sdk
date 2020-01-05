package com.fanap.podSubscription.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.util.ScProductIdPodServicesProduction;
import com.fanap.podSubscription.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 7/31/2019.
 */

public class SubscriptionListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset , size and subscriptionPlanId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private String subscriptionPlanId;
    private static String scProductId;


    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getSubscriptionPlanId() {
        return subscriptionPlanId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public SubscriptionListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = TypeConversionUtil.longToString(builder.getOffset());
        this.size = TypeConversionUtil.longToString(builder.getSize());
        this.subscriptionPlanId = TypeConversionUtil.longToString(builder.getSubscriptionPlanId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_SUBSCRIPTION_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_SUBSCRIPTION_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long offset;
        private Long size;
        private Long subscriptionPlanId;

        public Long getOffset() {
            return offset;
        }

        public Builder setOffset(Long offset) {
            this.offset = offset;
            return this;
        }

        public Long getSize() {
            return size;
        }

        public Builder setSize(Long size) {
            this.size = size;
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

        public SubscriptionListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.offset != null && this.size != null && this.subscriptionPlanId != null)
                return new SubscriptionListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}






