package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;
/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class TransferToFollowerAndCashoutVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, description, amount, guildCode, wallet and userId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String guildCode;
    private String amount;
    private String userId;
    private String description;
    private String currencyCode;
    private String wallet;
    private String uniqueId;
    private String toolCode;
    private static String scProductId;


    public String getAmount() {
        return amount;
    }

    public String getWallet() {
        return wallet;
    }

    public String getGuildCode() {
        return guildCode;
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

    public String getUserId() {
        return userId;
    }

    public String getToolCode() {
        return toolCode;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public TransferToFollowerAndCashoutVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.userId = TypeConversionUtil.longToString(builder.getUserId());
        this.currencyCode = builder.getCurrencyCode();
        this.description = builder.getDescription();
        this.wallet = builder.getWallet();
        this.toolCode = builder.getToolCode();
        this.uniqueId = builder.getUniqueId();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_TRANSFER_TO_FOLLOWER_AND_CASHOUT);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_TRANSFER_TO_FOLLOWER_AND_CASHOUT);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String guildCode;
        private Long amount;
        private Long userId;
        private String description;
        private String currencyCode;
        private String wallet;
        private String toolCode;
        private String uniqueId;

        public String getToolCode() {
            return toolCode;
        }

        public Builder setToolCode(String toolCode) {
            this.toolCode = toolCode;
            return this;
        }

        public Long getAmount() {
            return amount;
        }

        public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
        }


        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public Long getUserId() {
            return userId;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
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

        public TransferToFollowerAndCashoutVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.guildCode != null &&
                    this.amount != null && this.userId != null && this.description != null
                    && this.wallet != null && this.baseInfoVo.getServerType() != null)
                return new TransferToFollowerAndCashoutVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}

