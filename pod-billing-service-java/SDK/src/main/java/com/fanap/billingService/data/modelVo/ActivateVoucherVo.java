package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.ScProductIdPodServicesProduction;
import com.fanap.billingService.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */

public class ActivateVoucherVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuerm and voucherId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String voucherId;
    private static String scProductId;


    public ActivateVoucherVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.voucherId = TypeConversionUtil.longToString(builder.getVoucherId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
        this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_ACTIVATE_VOUCHER);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_ACTIVATE_VOUCHER);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long voucherId;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Long getVoucherId() {
            return voucherId;
        }

        public Builder setVoucherId(Long id) {
            this.voucherId = id;
            return this;
        }


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public ActivateVoucherVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.voucherId != null)
                return new ActivateVoucherVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

