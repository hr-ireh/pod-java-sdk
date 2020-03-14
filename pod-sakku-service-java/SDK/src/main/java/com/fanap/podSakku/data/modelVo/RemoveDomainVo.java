package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class RemoveDomainVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId and domain are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String domain;


    public RemoveDomainVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.domain = builder.getDomain();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getAppId() {
        return appId;
    }

    public String getDomain() {
        return domain;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private String domain;

        public String getDomain() {
            return domain;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
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

        public RemoveDomainVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.domain != null)
                return new RemoveDomainVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}
