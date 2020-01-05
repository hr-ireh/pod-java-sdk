package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

public class RequestGuildSettlementVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,ott ,guildCode and amount are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String firstName;
    private String lastName;
    private String sheba;
    private String amount;
    private String guildCode;
    private String currencyCode;
    private String uniqueId;
    private String description;
    private static String scProductId;


    public RequestGuildSettlementVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.sheba = builder.getSheba();
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.guildCode = builder.getGuildCode();
        this.currencyCode = builder.getCurrencyCode();
        this.uniqueId = builder.getUniqueId();
        this.description = builder.getDescription();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_REQUEST_SETTLEMENT);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_REQUEST_SETTLEMENT);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSheba() {
        return sheba;
    }

    public String getAmount() {
        return amount;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getDescription() {
        return description;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String firstName;
        private String lastName;
        private String sheba;
        private Long amount;
        private String guildCode;
        private String currencyCode;
        private String uniqueId;
        private String description;

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) {
            this.sheba = sheba;
            return this;
        }

        public Long getAmount() {
            return amount;
        }

        public Builder setAmount(Long amount) {
            this.amount = amount;
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

        public Builder setCurrencyCode(String currenncyCode) {
            this.currencyCode = currenncyCode;
            return this;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
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


        public RequestGuildSettlementVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getOtt() != null && this.amount != null && this.guildCode != null)
                return new RequestGuildSettlementVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }


}

