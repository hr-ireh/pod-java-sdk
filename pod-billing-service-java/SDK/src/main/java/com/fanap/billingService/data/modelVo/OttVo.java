package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

import static com.fanap.billingService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class OttVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private static String scProductId;


    public OttVo(Builder builder) {

        this.baseInfoVo = builder.getBaseInfoVo();
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_OTT);
        else
            this.scProductId = com.fanap.podBaseService.util.TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_OTT);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Builder setScVoucherHash(List<String> scVoucherHash) {
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public OttVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new OttVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
