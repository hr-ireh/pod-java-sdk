package com.fanap.podBank.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBank.util.ScProductIdPodServicesProduction;
import com.fanap.podBank.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.EnumBaseURLPlatform.PRODUCTION;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class GetDebitCardInfoVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, path are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String cardNumber;
    private static String scProductId;

    public GetDebitCardInfoVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.cardNumber = builder.getCardNumber();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_GET_DEBIT_CARD_INFO);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_DEBIT_CARD_INFO);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String cardNumber;

        public String getCardNumber() {
            return cardNumber;
        }

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
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

        public GetDebitCardInfoVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.cardNumber != null && this.baseInfoVo.getServerType() != null)
                return new GetDebitCardInfoVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
