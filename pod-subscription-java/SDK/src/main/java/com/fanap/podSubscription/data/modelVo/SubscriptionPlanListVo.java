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
public class SubscriptionPlanListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String periodTypeCode;
    private String periodTypeCountFrom;
    private String periodTypeCountTo;
    private String fromPrice;
    private String toPrice;
    private String offset;
    private String size;
    private String enable;
    private List<String> permittedGuildCode;
    private List<String> permittedBusinessId;
    private List<String> permittedProductId;
    private String typeCode;
    private String currencyCode;
    private static String scProductId;


    public SubscriptionPlanListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.fromPrice = TypeConversionUtil.decimalToString(builder.getFromPrice());
        this.permittedGuildCode = builder.getPermittedGuildCode();
        this.permittedBusinessId = TypeConversionUtil.longToString(builder.getPermittedBusinessId());
        this.permittedProductId = TypeConversionUtil.longToString(builder.getPermittedProductId());
        this.periodTypeCode = builder.getPeriodTypeCode();
        this.typeCode = builder.getTypeCode();
        this.currencyCode = builder.getCurrencyCode();
        this.size = TypeConversionUtil.longToString(builder.getSize());
        this.offset = TypeConversionUtil.longToString(builder.getOffset());
        this.periodTypeCountFrom = TypeConversionUtil.longToString(builder.getPeriodTypeCountFrom());
        this.periodTypeCountTo = TypeConversionUtil.longToString(builder.getPeriodTypeCountTo());
        this.toPrice = TypeConversionUtil.decimalToString(builder.getToPrice());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_SUBSCRIPTION_PLAN_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_SUBSCRIPTION_PLAN_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getPeriodTypeCountTo() {
        return periodTypeCountTo;
    }

    public String getFromPrice() {
        return fromPrice;
    }

    public String getToPrice() {
        return toPrice;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getEnable() {
        return enable;
    }

    public String getPeriodTypeCountFrom() {
        return periodTypeCountFrom;
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

    public String getPeriodTypeCode() {
        return periodTypeCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private String periodTypeCode;
        private Long periodTypeCountFrom;
        private Long periodTypeCountTo;
        private BigDecimal fromPrice;
        private BigDecimal toPrice;
        private Long offset;
        private Long size;
        private Boolean enable;
        private List<String> permittedGuildCode;
        private List<Long> permittedBusinessId;
        private List<Long> permittedProductId;
        private String typeCode;
        private String currencyCode;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Long getPeriodTypeCountFrom() {
            return periodTypeCountFrom;
        }

        public Builder setPeriodTypeCountFrom(Long periodTypeCountFrom) {
            this.periodTypeCountFrom = periodTypeCountFrom;
            return this;
        }

        public Long getPeriodTypeCountTo() {
            return periodTypeCountTo;
        }

        public Builder setPeriodTypeCountTo(Long periodTypeCountTo) {
            this.periodTypeCountTo = periodTypeCountTo;
            return this;
        }

        public BigDecimal getFromPrice() {
            return fromPrice;
        }

        public Builder setFromPrice(BigDecimal fromPrice) {
            this.fromPrice = fromPrice;
            return this;
        }

        public BigDecimal getToPrice() {
            return toPrice;
        }

        public Builder setToPrice(BigDecimal toPrice) {
            this.toPrice = toPrice;
            return this;
        }

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

        public Boolean getEnable() {
            return enable;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public String getTypeCode() {
            return typeCode;
        }

        public Builder setTypeCode(String typeCode) {
            this.typeCode = typeCode;
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

        public String getPeriodTypeCode() {
            return periodTypeCode;
        }

        public Builder setPeriodTypeCode(String periodTypeCode) {
            this.periodTypeCode = periodTypeCode;
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

        public SubscriptionPlanListVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.offset != null &&
                    this.size != null)
                return new SubscriptionPlanListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
