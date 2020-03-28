package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.ApplicationBaseConfig;
import com.fanap.podSakku.exception.PodException;

public class CreateAppByStateMachineVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , config  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private ApplicationBaseConfig config;


    public CreateAppByStateMachineVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.config = builder.getConfig();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public ApplicationBaseConfig getConfig() {
        return config;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private ApplicationBaseConfig config;

        public ApplicationBaseConfig getConfig() {
            return config;
        }

        public Builder setConfig(ApplicationBaseConfig config) {
            this.config = config;
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

        public CreateAppByStateMachineVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.config != null)
                return new CreateAppByStateMachineVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
