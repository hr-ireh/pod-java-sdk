package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class TransferToContactVo {

        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, amount and contactId  are required parameters!";

        private BaseInfoVo baseInfoVo;
        private String contactId ;
        private String amount ;
        private String wallet;
        private String currencyCode;
        private String description;
        private String uniqueId;
        private static String scProductId;

        public String getUniqueId() {
            return uniqueId;
        }

    public String getContactId() {
        return contactId;
    }

    public String getAmount() {
        return amount;
    }

    public String getWallet() {
        return wallet;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDescription() {
        return description;
    }

    public static String getScProductId() {
            return scProductId;
        }

        public TransferToContactVo(Builder builder) {
            this.baseInfoVo = builder.getBaseInfoVo();
            this.contactId = TypeConversionUtil.longToString(builder.getContactId());
            this.amount = TypeConversionUtil.longToString(builder.getAmount());
            this.wallet = builder.getWallet();
            this.currencyCode = builder.getCurrencyCode();
            this.description=builder.getDescription();
            this.uniqueId =builder.getUniqueId();
            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_TRANSFER_TO_CONTACT);
            else
                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_TRANSFER_TO_CONTACT);

        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public static class Builder {
            private BaseInfoVo baseInfoVo;
            private Long contactId ;
            private Long amount ;
            private String wallet;
            private String currencyCode;
            private String description;
            private String uniqueId;

            public Long getContactId() {
                return contactId;
            }

            public Builder setContactId(Long contactId) {
                this.contactId = contactId;
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

            public TransferToContactVo build() throws PodException {
                if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                        this.baseInfoVo.getToken_issuer() != null && this.amount!=null && this.contactId!=null
                && this.baseInfoVo.getServerType()!=null)
                    return new TransferToContactVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }


        }
    }

