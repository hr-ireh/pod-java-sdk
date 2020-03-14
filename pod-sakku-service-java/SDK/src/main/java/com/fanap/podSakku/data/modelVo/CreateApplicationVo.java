package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class CreateApplicationVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , config  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private ConfigContentVo config;


    public CreateApplicationVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.config = builder.getConfig();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public ConfigContentVo getConfig() {
        return config;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private ConfigContentVo config;

        public ConfigContentVo getConfig() {
            return config;
        }

        public Builder setConfig(ConfigContentVo config) {
            this.config =config;
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

        public CreateApplicationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.config != null)
                return new CreateApplicationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
