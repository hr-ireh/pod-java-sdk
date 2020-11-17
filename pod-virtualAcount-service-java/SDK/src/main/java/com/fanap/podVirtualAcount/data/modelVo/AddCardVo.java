package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class AddCardVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String cardNumber;
    private String name;
    private String tag;
    private String cvv2;
    private String expiryMonth;
    private String order;
    private static String scProductId;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getCvv2() {
        return cvv2;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public String getOrder() {
        return order;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public AddCardVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.cardNumber = builder.getCardNumber();
        this.name = builder.getName();
        this.tag = builder.getTag();
        this.cvv2 = builder.getCvv2();
        this.expiryMonth = builder.getExpiryMonth();
        this.order = builder.getOrder();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_CARD);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_CARD);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String cardNumber;
        private String name;
        private String tag;
        private String cvv2;
        private String expiryMonth;
        private String order;

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

        public String getCardNumber() {
            return cardNumber;
        }

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getTag() {
            return tag;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        public String getCvv2() {
            return cvv2;
        }

        public Builder setCvv2(String cvv2) {
            this.cvv2 = cvv2;
            return this;
        }

        public String getExpiryMonth() {
            return expiryMonth;
        }

        public Builder setExpiryMonth(String expiryMonth) {
            this.expiryMonth = expiryMonth;
            return this;
        }

        public String getOrder() {
            return order;
        }

        public Builder setOrder(String order) {
            this.order = order;
            return this;
        }

        public AddCardVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && cardNumber != null && name != null && this.baseInfoVo.getServerType() != null)
                return new AddCardVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
