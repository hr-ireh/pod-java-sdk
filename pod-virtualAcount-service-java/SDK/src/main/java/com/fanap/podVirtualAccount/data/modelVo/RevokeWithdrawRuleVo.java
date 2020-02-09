package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAccount.util.ScProductIdPodServicesSandBox;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class RevokeWithdrawRuleVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ruleId and serverType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String ruleId;
    private static String scProductId;


    public static String getScProductId() {
        return scProductId;
    }

    public RevokeWithdrawRuleVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.ruleId = TypeConversionUtil.longToString(builder.getRuleId());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.REVOKE_WITH_DRAW_RULE);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.REVOKE_WITH_DRAW_RULE);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getRuleId() {
        return ruleId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long ruleId;


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

        public Long getRuleId() {
            return ruleId;
        }

        public Builder setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public RevokeWithdrawRuleVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null
                    && this.ruleId != null)
                return new RevokeWithdrawRuleVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}
