package com.fanap.podSubscription.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.util.ScProductIdPodServicesProduction;
import com.fanap.podSubscription.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.math.BigDecimal;
import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class AddSubscriptionPlanVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, id, periodTypeCount, permittedGuildCode, permittedBusinessId, permittedProductId, productId, name, price, periodTypeCode, type, guildCode and currencyCode are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String periodTypeCount;
    private List<String> permittedGuildCode;
    private List<String> permittedBusinessId;
    private List<String> permittedProductId;
    private String entityId;
    private String name;
    private String price;
    private String periodTypeCode;
    private String type;
    private String guildCode;
    private String currencyCode;
    private String usageCountLimit;
    private String usageAmountLimit;
    private static String scProductId;

    public AddSubscriptionPlanVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.periodTypeCount = TypeConversionUtil.longToString(builder.getPeriodTypeCount());
        this.permittedGuildCode = builder.getPermittedGuildCode();
        this.permittedBusinessId = TypeConversionUtil.longToString(builder.getPermittedBusinessId());
        this.permittedProductId = TypeConversionUtil.longToString(builder.getPermittedProductId());
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.name = builder.getName();
        this.price = TypeConversionUtil.decimalToString(builder.getPrice());
        this.periodTypeCode = builder.getPeriodTypeCode();
        this.type = builder.getType();
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.usageAmountLimit = TypeConversionUtil.longToString(builder.getUsageAmountLimit());
        this.usageCountLimit = TypeConversionUtil.longToString(builder.getUsageCountLimit());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_SUBSCRIPTION_PLAN);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_SUBSCRIPTION_PLAN);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getUsageCountLimit() {
        return usageCountLimit;
    }

    public String getUsageAmountLimit() {
        return usageAmountLimit;
    }

    public String getPeriodTypeCount() {
        return periodTypeCount;
    }

    public List<String> getPermittedGuildCode() {
        return permittedGuildCode;
    }

    public List<String> getPermittedBusinessId() {
        return permittedBusinessId;
    }

    public List<String> getPermittedProductId() {
        return permittedProductId;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPeriodTypeCode() {
        return periodTypeCode;
    }

    public String getType() {
        return type;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long periodTypeCount;
        private List<String> permittedGuildCode;
        private List<Long> permittedBusinessId;
        private List<Long> permittedProductId;
        private Long entityId;
        private String name;
        private BigDecimal price;
        private String periodTypeCode;
        private String type;
        private String guildCode;
        private String currencyCode;
        private Long usageCountLimit;
        private Long usageAmountLimit;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getUsageAmountLimit() {
            return usageAmountLimit;
        }

        public Builder setUsageAmountLimit(Long usageAmountLimit) {
            this.usageAmountLimit = usageAmountLimit;
            return this;
        }

        public Long getUsageCountLimit() {
            return usageCountLimit;
        }

        public Builder setUsageCountLimit(Long usageCountLimit) {
            this.usageCountLimit = usageCountLimit;
            return this;
        }

        public Long getPeriodTypeCount() {
            return periodTypeCount;
        }

        public Builder setPeriodTypeCount(Long periodTypeCount) {
            this.periodTypeCount = periodTypeCount;
            return this;
        }

        public List<String> getPermittedGuildCode() {
            return permittedGuildCode;
        }

        public Builder setPermittedGuildCode(List<String> permittedGuildCode) {
            this.permittedGuildCode = permittedGuildCode;
            return this;
        }

        public List<Long> getPermittedBusinessId() {
            return permittedBusinessId;
        }

        public Builder setPermittedBusinessId(List<Long> permittedBusinessId) {
            this.permittedBusinessId = permittedBusinessId;
            return this;
        }

        public List<Long> getPermittedProductId() {
            return permittedProductId;
        }

        public Builder setPermittedProductId(List<Long> permittedProductId) {
            this.permittedProductId = permittedProductId;
            return this;
        }

        public Long getEntityId() {
            return entityId;
        }

        public Builder setEntityId(Long productId) {
            this.entityId = productId;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public String getPeriodTypeCode() {
            return periodTypeCode;
        }

        public Builder setPeriodTypeCode(String periodTypeCode) {
            this.periodTypeCode = periodTypeCode;
            return this;
        }

        public String getType() {
            return type;
        }

        public Builder setType(String type) {
            this.type = type;
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

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public AddSubscriptionPlanVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.periodTypeCode != null &&
                    this.permittedBusinessId != null &&
                    this.permittedBusinessId.size() != 0 &&
                    this.entityId != null &&
                    this.name != null &&
                    this.price != null &&
                    this.type != null &&
                    this.guildCode != null &&
                    this.currencyCode != null)
                return new AddSubscriptionPlanVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
