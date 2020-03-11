package com.fanap.podAIPlatform.data.modelVo;

import com.fanap.podAIPlatform.util.ScProductIdPodServicesProduction;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

public class NLUMobilePhoneChargingVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, text, apiKey are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String text;
    private static String scProductId;

    public NLUMobilePhoneChargingVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.text = builder.getText();
//            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NLU_BANKING);
//            else
//                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getText() {
        return text;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String text;

        public String getText() {
            return text;
        }

        public Builder setText(String text) {
            this.text = text;
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

        public NLUMobilePhoneChargingVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getScApiKey() != null && this.text != null)
                return new NLUMobilePhoneChargingVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
