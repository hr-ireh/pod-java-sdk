package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class IssueWithdrawRuleByPlanVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, planId, businessId and serverType are required parameters!";
    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String planId;
    private String redirectUri;
    private String callUri;

    public IssueWithdrawRuleByPlanVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.planId = TypeConversionUtil.longToString(builder.getPlanId());
        this.redirectUri = builder.getRedirectUri();
        this.callUri = builder.getCallUri();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getBusinessId() {
        return businessId;
    }

    public String getPlanId() {
        return planId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getCallUri() {
        return callUri;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private Long planId;
        private String redirectUri;
        private String callUri;
        ;


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

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

        public Long getPlanId() {
            return planId;
        }

        public Builder setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public String getCallUri() {
            return callUri;
        }

        public Builder setCallUri(String callUri) {
            this.callUri = callUri;
            return this;
        }

        public IssueWithdrawRuleByPlanVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType() != null &&
                    this.businessId != null && this.planId != null)
                return new IssueWithdrawRuleByPlanVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    public String getLink() {
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            return "https://pay.pod.ir/v1/pbc/issueWithdrawRuleByPlan/?businessId=" + businessId + "&planId=" + planId + "&redirectUri=" + redirectUri + "&callUri=" + callUri;
        else
            return "https://sandbox.pod.ir:1033/v1/pbc/issueWithdrawRuleByPlan/?businessId=" + businessId + "&planId=" + planId + "&redirectUri=" + redirectUri + "&callUri=" + callUri;
    }

}

