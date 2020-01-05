package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;


import java.time.LocalDate;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public class GetVoucherListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, Offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String consumerId;
    private String hashCode;
    private String name;
    private String type;
    private List<String> guildCode;
    private String currencyCode;
    private String amountFrom;
    private String amountTo;
    private String discountPercentageFrom;
    private String discountPercentageTo;
    private String expireDateFrom;
    private String expireDateTo;
    private List<String> entityId;
    private String consumDateFrom;
    private String consumDateTo;
    private String usedAmountFrom;
    private String usedAmountTo;
    private String active;
    private String used;
    private String offset;
    private String size;
    private static String scProductId;

    public GetVoucherListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.consumerId = TypeConversionUtil.longToString(builder.getConsumerId());
        this.hashCode = builder.getHashCode();
        this.name = builder.getName();
        this.type = TypeConversionUtil.intToString(builder.getType());
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.amountFrom = TypeConversionUtil.longToString(builder.getAmountFrom());
        this.amountTo = TypeConversionUtil.longToString(builder.getAmountTo());
        this.discountPercentageFrom = TypeConversionUtil.longToString(builder.getDiscountPercentageFrom());
        this.discountPercentageTo = TypeConversionUtil.longToString(builder.getDiscountPercentageTo());
        this.guildCode = builder.getGuildCode();
        this.expireDateFrom = builder.getExpireDateFrom();
        this.expireDateTo = builder.getExpireDateTo();
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.consumDateFrom = builder.getConsumDateFrom();
        this.consumDateTo = builder.getConsumDateTo();
        this.usedAmountFrom = TypeConversionUtil.longToString(builder.getUsedAmountFrom());
        this.usedAmountTo = TypeConversionUtil.longToString(builder.getUsedAmountTo());
        this.active = TypeConversionUtil.booleanToString(builder.getActive());
        this.used = TypeConversionUtil.booleanToString(builder.getUsed());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_GET_VOUCHER_LIST);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_GET_VOUCHER_LIST);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public String getHashCode() {
        return hashCode;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getAmountFrom() {
        return amountFrom;
    }

    public String getAmountTo() {
        return amountTo;
    }

    public String getDiscountPercentageFrom() {
        return discountPercentageFrom;
    }

    public String getDiscountPercentageTo() {
        return discountPercentageTo;
    }

    public String getExpireDateFrom() {
        return expireDateFrom;
    }

    public String getExpireDateTo() {
        return expireDateTo;
    }

    public List<String> getEntityId() {
        return entityId;
    }

    public String getConsumDateFrom() {
        return consumDateFrom;
    }

    public String getConsumDateTo() {
        return consumDateTo;
    }

    public String getUsedAmountFrom() {
        return usedAmountFrom;
    }

    public String getUsedAmountTo() {
        return usedAmountTo;
    }

    public String getActive() {
        return active;
    }

    public String getUsed() {
        return used;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long consumerId;
        private String hashCode;
        private String name;
        private Integer type;
        private List<String> guildCode;
        private String currencyCode;
        private Long amountFrom;
        private Long amountTo;
        private Long discountPercentageFrom;
        private Long discountPercentageTo;
        private String expireDateFrom;
        private String expireDateTo;
        private List<Long> entityId;
        private String consumDateFrom;
        private String consumDateTo;
        private Long usedAmountFrom;
        private Long usedAmountTo;
        private Boolean active;
        private Boolean used;
        private Integer offset;
        private Integer size;


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

        public Long getConsumerId() {
            return consumerId;
        }

        public Builder setConsumerId(Long consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        public String getHashCode() {
            return hashCode;
        }

        public Builder setHashCode(String hash) {
            this.hashCode = hash;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getType() {
            return type;
        }

        public Builder setType(Integer type) {
            this.type = type;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(List<String> guildCode) {
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

        public Long getAmountFrom() {
            return amountFrom;
        }

        public Builder setAmountFrom(Long amountFrom) {
            this.amountFrom = amountFrom;
            return this;
        }

        public Long getAmountTo() {
            return amountTo;
        }

        public Builder setAmountTo(Long amountTo) {
            this.amountTo = amountTo;
            return this;
        }

        public Long getDiscountPercentageFrom() {
            return discountPercentageFrom;
        }

        public Builder setDiscountPercentageFrom(Long discountPercentageFrom) {
            this.discountPercentageFrom = discountPercentageFrom;
            return this;
        }

        public Long getDiscountPercentageTo() {
            return discountPercentageTo;
        }

        public Builder setDiscountPercentageTo(Long discountPercentageTo) {
            this.discountPercentageTo = discountPercentageTo;
            return this;
        }

        public String getExpireDateFrom() {
            return expireDateFrom;
        }

        public Builder setExpireDateFrom(String expireDateFrom) {
            this.expireDateFrom = expireDateFrom;
            return this;
        }

        public Builder setExpireDateFrom(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.expireDateFrom = d;
            return this;

        }

        public String getExpireDateTo() {
            return expireDateTo;
        }

        public Builder setExpireDateTo(String expireDateTo) {
            this.expireDateTo = expireDateTo;
            return this;
        }

        public Builder setExpireDateTo(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.expireDateTo = d;
            return this;

        }

        public List<Long> getEntityId() {
            return entityId;
        }

        public Builder setEntityId(List<Long> productId) {
            this.entityId = productId;
            return this;
        }

        public String getConsumDateFrom() {
            return consumDateFrom;
        }

        public Builder setConsumDateFrom(String consumDateFrom) {
            this.consumDateFrom = consumDateFrom;
            return this;
        }

        public Builder setConsumDateFrom(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.consumDateFrom = d;
            return this;

        }

        public String getConsumDateTo() {
            return consumDateTo;
        }

        public Builder setConsumDateTo(String consumDateTo) {
            this.consumDateTo = consumDateTo;
            return this;
        }

        public Builder setConsumDateTo(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.consumDateTo = d;
            return this;

        }


        public Long getUsedAmountFrom() {
            return usedAmountFrom;
        }

        public Builder setUsedAmountFrom(Long usedAmountFrom) {
            this.usedAmountFrom = usedAmountFrom;
            return this;
        }

        public Long getUsedAmountTo() {
            return usedAmountTo;
        }

        public Builder setUsedAmountTo(Long usedAmountTo) {
            this.usedAmountTo = usedAmountTo;
            return this;
        }

        public Boolean getActive() {
            return active;
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Boolean getUsed() {
            return used;
        }

        public Builder setUsed(Boolean used) {
            this.used = used;
            return this;
        }

        public Integer getOffset() {
            return offset;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public GetVoucherListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.offset != null &&
                    this.size != null)
                return new GetVoucherListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


