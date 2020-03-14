package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

import java.util.List;

public class AddBasicAuthUserVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId, basicAuthenticationVo  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private List<BasicAuthenticationVo> basicAuthenticationVo;


    public AddBasicAuthUserVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.basicAuthenticationVo = builder.getBasicAuthenticationVo();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public List<BasicAuthenticationVo> getBasicAuthenticationVo() {
        return basicAuthenticationVo;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private List<BasicAuthenticationVo> basicAuthenticationVo;

        public List<BasicAuthenticationVo> getBasicAuthenticationVo() {
            return basicAuthenticationVo;
        }

        public Builder setBasicAuthenticationVo(List<BasicAuthenticationVo> basicAuthenticationVo) {
            this.basicAuthenticationVo = basicAuthenticationVo;
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

        public AddBasicAuthUserVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.basicAuthenticationVo != null)
                return new AddBasicAuthUserVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
