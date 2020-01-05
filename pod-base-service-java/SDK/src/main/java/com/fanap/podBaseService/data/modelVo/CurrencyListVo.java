package com.fanap.podBaseService.data.modelVo;


import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class CurrencyListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and serverType, are required parameters!";

    private BaseInfoVo baseInfoVo;
    private static String scProductId;


    public CurrencyListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_CURRENCY_LIST);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_CURRENCY_LIST);

    }

    public static String getScProductId() {
        return scProductId;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public static class Builder {

        private BaseInfoVo baseInfoVo;

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


        public CurrencyListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getServerType() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new CurrencyListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }


}
