package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeleteBasicAuthUsersVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId, basicAuthId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String basicAuthId;


    public DeleteBasicAuthUsersVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.basicAuthId = TypeConversionUtil.longToString(builder.getBasicAuthId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getBasicAuthId() {
        return basicAuthId;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private Long basicAuthId;

        public Long getBasicAuthId() {
            return basicAuthId;
        }

        public Builder setBasicAuthId(Long basicAuthId) {
            this.basicAuthId = basicAuthId;
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

        public DeleteBasicAuthUsersVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.basicAuthId != null)
                return new DeleteBasicAuthUsersVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
