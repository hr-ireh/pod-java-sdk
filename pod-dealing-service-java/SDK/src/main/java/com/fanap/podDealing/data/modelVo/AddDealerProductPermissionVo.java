package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class AddDealerProductPermissionVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , entityId and dealerBizId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String entityId;
    private String dealerBizId;
    private static String scProductId;


    public AddDealerProductPermissionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ADD_DEALER_PRODUCT_PERMISSION);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ADD_DEALER_PRODUCT_PERMISSION);
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealerBizId() {
        return dealerBizId;
    }


    public String getEntityId() {
        return entityId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long dealerBizId;
        private Long entityId;


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

        public Long getEntityId() {
            return entityId;
        }

        public Builder setEntityId(Long productId) {
            this.entityId = productId;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public AddDealerProductPermissionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.dealerBizId != null && this.entityId != null)
                return new AddDealerProductPermissionVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}








