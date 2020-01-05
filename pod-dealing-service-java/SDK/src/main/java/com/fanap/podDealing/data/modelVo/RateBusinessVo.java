package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class RateBusinessVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , businessId  and rate  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String rate;
    private static String scProductId;


    public String getRate() {
        return rate;
    }

    public String getBusinessId() {
        return businessId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public RateBusinessVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.rate = TypeConversionUtil.longToString(builder.getRate());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_RATE_BUSINESS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_RATE_BUSINESS);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private Long rate;


        public Long getRate() {
            return rate;
        }

        public Builder setRate(Long rate) {
            this.rate = rate;
            return this;
        }

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
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

        public RateBusinessVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.businessId != null && this.rate != null)
                return new RateBusinessVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

















