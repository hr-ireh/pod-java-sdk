package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class RemoveAppFromNetworkVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId and name are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String name;


    public RemoveAppFromNetworkVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.name = builder.getName();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getAppId() {
        return appId;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private String name;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
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

        public RemoveAppFromNetworkVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.name != null)
                return new RemoveAppFromNetworkVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
