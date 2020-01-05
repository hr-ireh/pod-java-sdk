package com.fanap.podSubscription.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.util.ScProductIdPodServicesProduction;
import com.fanap.podSubscription.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 7/31/2019.
 */

public class UpdateSubscriptionPlanVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String periodTypeCode;
    private String periodTypeCount;
    private String usageCountLimit;
    private String name;
    private String Price;
    private String enable;
    private static String scProductId;


    public String getId() {
        return id;
    }

    public String getPeriodTypeCode() {
        return periodTypeCode;
    }

    public String getPeriodTypeCount() {
        return periodTypeCount;
    }

    public String getUsageCountLimit() {
        return usageCountLimit;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return Price;
    }

    public String getEnable() {
        return enable;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public UpdateSubscriptionPlanVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.periodTypeCode = builder.getPeriodTypeCode();
        this.periodTypeCount = TypeConversionUtil.longToString(builder.getPeriodTypeCount());
        this.name = builder.getName();
        this.enable = builder.getEnable();
        this.usageCountLimit = TypeConversionUtil.longToString(builder.getUsageCountLimit());
        this.Price = TypeConversionUtil.longToString(builder.getPrice());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_UPDATE_SUBSCRIPTION_PLAN);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_UPDATE_SUBSCRIPTION_PLAN);
    }


    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private String periodTypeCode;
        private Long periodTypeCount;
        private Long usageCountLimit;
        private String name;
        private Long Price;
        private String enable;


        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getPeriodTypeCode() {
            return periodTypeCode;
        }

        public Builder setPeriodTypeCode(String periodTypeCode) {
            this.periodTypeCode = periodTypeCode;
            return this;
        }

        public Long getPeriodTypeCount() {
            return periodTypeCount;
        }

        public Builder setPeriodTypeCount(Long periodTypeCount) {
            this.periodTypeCount = periodTypeCount;
            return this;
        }

        public Long getUsageCountLimit() {
            return usageCountLimit;
        }

        public Builder setUsageCountLimit(Long usageCountLimit) {
            this.usageCountLimit = usageCountLimit;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Long getPrice() {
            return Price;
        }

        public Builder setPrice(Long price) {
            Price = price;
            return this;
        }

        public String getEnable() {
            return enable;
        }

        public Builder setEnable(String enable) {
            this.enable = enable;
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

        public UpdateSubscriptionPlanVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null)
                return new UpdateSubscriptionPlanVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}



