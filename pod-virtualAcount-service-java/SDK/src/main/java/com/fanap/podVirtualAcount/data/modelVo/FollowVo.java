package com.fanap.podVirtualAcount.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesProduction;
import com.fanap.podVirtualAcount.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class FollowVo {

        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, businessId and follow  are required parameters!";

        private BaseInfoVo baseInfoVo;
        private String businessId ;
        private String follow ;
        private static String scProductId;


    public String getBusinessId() {
        return businessId;
    }

    public String getFollow() {
        return follow;
    }

    public static String getScProductId() {
            return scProductId;
        }

        public FollowVo(Builder builder) {
            this.baseInfoVo = builder.getBaseInfoVo();
            this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
            this.follow = TypeConversionUtil.booleanToString(builder.getFollow());
            if (getBaseInfoVo().getServerType().equals(PRODUCTION))
                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_FOLLOW);
            else
                this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_FOLLOW);

        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public static class Builder {
            private BaseInfoVo baseInfoVo;
            private Long businessId ;
            private Boolean follow ;


            public Long getBusinessId() {
                return businessId;
            }

            public Builder setBusinessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            public Boolean getFollow() {
                return follow;
            }

            public Builder setFollow(Boolean follow) {
                this.follow = follow;
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

            public FollowVo build() throws PodException {
                if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                        this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getServerType()!=null &&
                        this.businessId != null && this.follow!=null)
                    return new FollowVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }


        }
    }
