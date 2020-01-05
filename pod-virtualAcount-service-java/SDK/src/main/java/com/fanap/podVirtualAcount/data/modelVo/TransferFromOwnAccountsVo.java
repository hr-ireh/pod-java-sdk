package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;

import java.util.ArrayList;
import java.util.List;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class TransferFromOwnAccountsVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and serverType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private List<String> guildCode;
    private List<String> amount;
    private String customerAmount;
    private String currencyCode;
    private String description;
    private String wallet;
    private String uniqueId;
    private GuildAmount guildAmount;
    private static String scProductId;


    public List<String> getAmount() {
        return amount;
    }

    public String getWallet() {
        return wallet;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getCustomerAmount() {
        return customerAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDescription() {
        return description;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public TransferFromOwnAccountsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.customerAmount = TypeConversionUtil.longToString(builder.getCustomerAmount());
        this.currencyCode = builder.getCurrencyCode();
        this.description = builder.getDescription();
        this.wallet = builder.getWallet();
        this.uniqueId =builder.getUniqueId();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_TRANSFER_FROM_OWN_ACCOUNTS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_TRANSFER_FROM_OWN_ACCOUNTS);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private List<String> guildCode;
        private List<Long> amount;
        private Long customerAmount;
        private String currencyCode;
        private String description;
        private String wallet;
        private GuildAmount guildAmount;
        private String uniqueId;


        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public Long getCustomerAmount() {
            return customerAmount;
        }

        public Builder setCustomerAmount(Long customerAmount) {
            this.customerAmount = customerAmount;
            return this;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public Builder setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
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

        public GuildAmount getGuildAmount() {
            return guildAmount;
        }

        public Builder setGuildAmount(GuildAmount[] guildAmounts) {
            List<String> guildCodes = new ArrayList<>();
            List<Long> amounts = new ArrayList<>();
            for (int i = 0; i < guildAmounts.length; i++) {
                if (guildAmounts[i] != null) {
                    guildCodes.add(i, guildAmounts[i].getGuildCode());
                    amounts.add(i, guildAmounts[i].getAmount());
                }
            }
            this.guildCode = guildCodes;
            this.amount = amounts;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public List<Long> getAmount() {
            return amount;
        }

        public TransferFromOwnAccountsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType()!=null)
                return new TransferFromOwnAccountsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}
