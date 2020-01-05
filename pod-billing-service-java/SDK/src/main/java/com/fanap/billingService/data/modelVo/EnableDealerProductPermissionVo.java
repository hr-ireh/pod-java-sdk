package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.PodServicesEnum;
import com.fanap.billingService.util.TypeConversionUtil;

public class EnableDealerProductPermissionVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, entity and dealerBizId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String dealerBizId;
    private String entityId;
    private static String scProductId;

    public String getEntityId() {
        return entityId;
    }

    public EnableDealerProductPermissionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_ENABLE_DEALER_PRODUCT_PERMISSION);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealerBizId() {
        return dealerBizId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long dealerBizId;
        private Long entityId;

        public Long getEntityId() {
            return entityId;
        }


        public Builder setEntityId(Long productId) {
            this.entityId = productId;
            return this;
        }

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


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public EnableDealerProductPermissionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.dealerBizId != null && this.entityId != null)
                return new EnableDealerProductPermissionVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}












