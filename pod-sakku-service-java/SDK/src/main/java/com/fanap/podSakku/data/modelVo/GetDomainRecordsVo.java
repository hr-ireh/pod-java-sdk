package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class GetDomainRecordsVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization and domain are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String domain;


    public GetDomainRecordsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.domain = builder.getDomain();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDomain() {
        return domain;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String domain;

        public String getDomain() {
            return domain;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
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

        public GetDomainRecordsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null && this.domain != null)
                return new GetDomainRecordsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
