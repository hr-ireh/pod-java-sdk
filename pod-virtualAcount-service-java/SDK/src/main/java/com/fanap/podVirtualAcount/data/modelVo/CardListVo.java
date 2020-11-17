package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class CardListVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String offset;
    private String size;
    private String cardNumber;
    private String id;
    private String name;
    private String tag;
    private static String scProductId;

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public CardListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.offset = builder.getOffset();
        this.size = builder.getSize();
        this.cardNumber = builder.getCarNumber();
        this.id = builder.getId();
        this.name = builder.getName();
        this.tag = builder.getTag();

        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_CARD_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_CARD_LIST);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String offset;
        private String size;
        private String cardNumber;
        private String id;
        private String name;
        private String tag;

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

        public String getOffset() {
            return offset;
        }

        public Builder setOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public String getSize() {
            return size;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public String getCarNumber() {
            return cardNumber;
        }

        public Builder setCarNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public String getId() {
            return id;
        }

        public Builder setId(String id) {
            this.id = id;
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

        public CardListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && size != null && offset != null && this.baseInfoVo.getServerType() != null)
                return new CardListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}