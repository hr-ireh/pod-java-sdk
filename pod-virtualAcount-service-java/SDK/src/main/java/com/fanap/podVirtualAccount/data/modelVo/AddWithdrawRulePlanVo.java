package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.enums.EnumTypeCode;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class AddWithdrawRulePlanVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, subscriptionDays, maxAmount, maxCount, typeCode, and serverType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String subscriptionDays;
    private String maxAmount;
    private String maxCount;
    private String typeCode;
    private static String scProductId;


    public static String getScProductId() {
        return scProductId;
    }

    public AddWithdrawRulePlanVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.subscriptionDays = TypeConversionUtil.intToString(builder.getSubscriptionDays());
        this.maxAmount = TypeConversionUtil.longToString(builder.getMaxAmount());
        this.maxCount = TypeConversionUtil.longToString(builder.getMaxCount());
        this.typeCode = builder.getTypeCode().getValue();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.ADD_WITH_DRAW_RULE_PLAN);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.ADD_WITH_DRAW_RULE_PLAN);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getSubscriptionDays() {
        return subscriptionDays;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public String getMaxCount() {
        return maxCount;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Integer subscriptionDays;
        private Long maxAmount;
        private Long maxCount;
        private EnumTypeCode typeCode;


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

        public Integer getSubscriptionDays() {
            return subscriptionDays;
        }

        public Builder setSubscriptionDays(Integer subscriptionDays) {
            this.subscriptionDays = subscriptionDays;
            return this;
        }

        public Long getMaxAmount() {
            return maxAmount;
        }

        public Builder setMaxAmount(Long maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }

        public Long getMaxCount() {
            return maxCount;
        }

        public Builder setMaxCount(Long maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public EnumTypeCode getTypeCode() {
            return typeCode;
        }

        public Builder setTypeCode(EnumTypeCode typeCode) {
            this.typeCode = typeCode;
            return this;
        }

        public AddWithdrawRulePlanVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null && this.maxAmount != null && this.maxCount != null
                    && this.subscriptionDays != null && this.typeCode != null)
                return new AddWithdrawRulePlanVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}

