package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class BusinessFavoriteVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , businessId  and disfavorite  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String disfavorite;
    private static String scProductId;

    public String getDisfavorite() {
        return disfavorite;
    }

    public String getBusinessId() {
        return businessId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public BusinessFavoriteVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.disfavorite = TypeConversionUtil.booleanToString(builder.getDisfavorite());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BUSINESS_FAVORITE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BUSINESS_FAVORITE);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private Boolean disfavorite;


        public Boolean getDisfavorite() {
            return disfavorite;
        }

        public Builder setDisfavorite(Boolean disfavorite) {
            this.disfavorite = disfavorite;
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

        public BusinessFavoriteVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.businessId != null && this.disfavorite != null)
                return new BusinessFavoriteVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}



