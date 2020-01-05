package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.enums.Enum_Server_type_Percent;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.Voucher;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public class DefineDiscountPercentageVoucherVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, guildCode, expireDate, count, amount, name and description are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String guildCode;
    private String expireDate;
    private List<String> count;
    private List<String> amount;
    private List<String> discountPercentage;
    private List<String> entityId;
    private List<String> dealerBusinessId;
    private List<String> name;
    private List<String> description;
    private String limitedConsumerId;
    private String type;
    private String currencyCode;
    private List<String> hashCode;
    private Voucher[] vouchers;
    private static String scProductId;


    public DefineDiscountPercentageVoucherVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.expireDate = builder.getExpireDate();
        this.count = TypeConversionUtil.intToString(builder.getCount());
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.discountPercentage = TypeConversionUtil.intToString(builder.getDiscountPercentage());
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.dealerBusinessId = TypeConversionUtil.longToString(builder.getDealerBusinessId());
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.limitedConsumerId = TypeConversionUtil.longToString(builder.getLimitedConsumerId());
        this.type = TypeConversionUtil.intToString(builder.getType());
        this.currencyCode = builder.getCurrencyCode();
        this.hashCode = builder.getHashCode();

        this.vouchers = builder.getVouchers();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_DEFINE_DISCOUNT_PERCENTAGE_VOUCHER);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_DEFINE_DISCOUNT_PERCENTAGE_VOUCHER);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public List<String> getCount() {
        return count;
    }

    public List<String> getAmount() {
        return amount;
    }

    public List<String> getDiscountPercentage() {
        return discountPercentage;
    }

    public List<String> getEntityId() {
        return entityId;
    }

    public List<String> getDealerBusinessId() {
        return dealerBusinessId;
    }

    public List<String> getName() {
        return name;
    }

    public List<String> getDescription() {
        return description;
    }

    public String getLimitedConsumerId() {
        return limitedConsumerId;
    }

    public String getType() {
        return type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public List<String> getHashCode() {
        return hashCode;
    }

    public Voucher[] getVouchers() {
        return vouchers;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String guildCode;
        private String expireDate;
        private List<Integer> count;
        private List<Long> amount;
        private List<Integer> discountPercentage;
        private List<Long> entityId;
        private List<Long> dealerBusinessId;
        private List<String> name;
        private List<String> description;
        private Long limitedConsumerId;
        private Integer type;
        private String currencyCode;
        private List<String> hashCode;
        private Voucher[] vouchers;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getExpireDate() {
            return expireDate;
        }

        public Builder setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        public Builder setExpireDate(LocalDate date) {
            String s = date.toString();
            String[] q = s.split("-");
            int gy = Integer.parseInt(q[0]);
            int gm = Integer.parseInt(q[1]);
            int gd = Integer.parseInt(q[2]);
            String d = TypeConversionUtil.toShamsi(gy, gm, gd);
            this.expireDate = d;
            return this;

        }

        public List<Integer> getCount() {
            return count;
        }

        public Builder setCount(List<Integer> count) {
            this.count = count;
            return this;
        }

        public List<Long> getAmount() {
            return amount;
        }

        public Builder setAmount(List<Long> amount) {
            this.amount = amount;
            return this;
        }

        public List<Integer> getDiscountPercentage() {
            return discountPercentage;
        }

        public Builder setDiscountPercentage(List<Integer> discountPercentage) {
            this.discountPercentage = discountPercentage;
            return this;
        }

        public List<Long> getEntityId() {
            return entityId;
        }

        public Builder setEntityId(List<Long> productId) {
            this.entityId = productId;
            return this;
        }

        public List<Long> getDealerBusinessId() {
            return dealerBusinessId;
        }

        public Builder setDealerBusinessId(List<Long> dealerBusinessId) {
            this.dealerBusinessId = dealerBusinessId;
            return this;
        }

        public List<String> getName() {
            return name;
        }

        public Builder setName(List<String> name) {
            this.name = name;
            return this;
        }

        public List<String> getDescription() {
            return description;
        }

        public Builder setDescription(List<String> description) {
            this.description = description;
            return this;
        }

        public Long getLimitedConsumerId() {
            return limitedConsumerId;
        }

        public Builder setLimitedConsumerId(Long limitedConsumerId) {
            this.limitedConsumerId = limitedConsumerId;
            return this;
        }

        public Integer getType() {
            return type;
        }

        public Builder setType(Enum_Server_type_Percent type) {
            this.type = type.getType();
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public List<String> getHashCode() {
            return hashCode;
        }

        public Builder setHashCode(List<String> hash) {
            this.hashCode = hash;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public Voucher[] getVouchers() {
            return vouchers;
        }

        public Builder setVouchers(Voucher[] vouchers) {
            List<Integer> counts = new ArrayList<>();
            List<Long> amounts = new ArrayList<>();
            List<String> names = new ArrayList<>();
            List<String> descriptions = new ArrayList<>();
            for (int i = 0; i < vouchers.length; i++) {
                if (vouchers[i] != null) {
                    counts.add(i, vouchers[i].getCount());
                    amounts.add(i, vouchers[i].getAmount());
                    names.add(i, vouchers[i].getName());
                    descriptions.add(i, vouchers[i].getDescription());
                }
            }
            this.count = counts;
            this.amount = amounts;
            this.name = names;
            this.description = descriptions;
            return this;
        }

        public DefineDiscountPercentageVoucherVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.guildCode != null && this.expireDate != null
                    && this.count != null && this.amount != null && this.name != null && this.description != null && this.type != null)
                return new DefineDiscountPercentageVoucherVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}





