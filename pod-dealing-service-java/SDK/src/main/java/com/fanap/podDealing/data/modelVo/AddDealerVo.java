package com.fanap.podDealing.data.modelVo;


import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class AddDealerVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, dealerBizId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String dealerBizId;
    private String allProductAllow;
    private static String scProductId;


    public AddDealerVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
        this.allProductAllow = TypeConversionUtil.booleanToString(builder.isAllProductAllow());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_DEALER);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_DEALER);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealerBizId() {
        return dealerBizId;
    }

    public String getAllProductAllow() {
        return allProductAllow;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long dealerBizId;
        private Boolean allProductAllow;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getDealerBizId() {
            return dealerBizId;
        }

        public Builder setDealerBizId(Long dealerBizId) {
            this.dealerBizId = dealerBizId;
            return this;
        }

        public Boolean isAllProductAllow() {
            return allProductAllow;
        }

        public Builder setAllProductAllow(Boolean allProductAllow) {
            this.allProductAllow = allProductAllow;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public AddDealerVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.dealerBizId != null)
                return new AddDealerVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


