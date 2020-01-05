package com.fanap.podBank.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBank.util.ScProductIdPodServicesProduction;
import com.fanap.podBank.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Z.gholinia on 11/9/2019.
 */

public class GetShebaInfoVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType ,productId,apiKey, path are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String sheba;
    private static String scProductId;

    public GetShebaInfoVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.sheba = builder.getSheba();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_GET_SHEBA_INFO);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_GET_SHEBA_INFO);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getScProductId() {
        return scProductId;
    }

    public String getSheba() {
        return sheba;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String sheba;

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) {
            this.sheba = sheba;
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

        public GetShebaInfoVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.sheba != null && this.baseInfoVo.getServerType() != null)
                return new GetShebaInfoVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}



