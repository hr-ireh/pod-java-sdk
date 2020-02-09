package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class TransferByInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType , amount, invoiceId, description, guildCode and wallet are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String guildCode;
    private String amount;
    private String invoiceId;
    private String description;
    private String currencyCode;
    private String uniqueId;
    private String wallet;

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

    public String getInvoiceId() {
        return invoiceId;
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

    public TransferByInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.guildCode = builder.getGuildCode();
        this.amount = TypeConversionUtil.longToString(builder.getAmount());
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.description = builder.getDescription();
        this.currencyCode = builder.getCurrencyCode();
        this.uniqueId = builder.getUniqueId();
        this.wallet = builder.getWallet();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_TRANSFER_BY_INVOICE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_TRANSFER_BY_INVOICE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String guildCode;
        private Long invoiceId;
        private Long amount;
        private Long customerAmount;
        private String currencyCode;
        private String description;
        private String wallet;
        private String uniqueId;


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

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public TransferByInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.amount != null && this.invoiceId != null && this.description != null && this.baseInfoVo.getServerType() != null)
                if (this.guildCode != null || this.wallet != null)
                    return new TransferByInvoiceVo(this);
            throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

