package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

import java.util.List;

public class CreatePipelineVo {
        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , config  are required parameters!";

        private BaseInfoVo baseInfoVo;
        private List<ConfigContentVo> config;


        public CreatePipelineVo(Builder builder) {
            this.baseInfoVo = builder.getBaseInfoVo();
            this.config = builder.getConfig();
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public List<ConfigContentVo> getConfig() {
            return config;
        }

        public static class Builder {
            private BaseInfoVo baseInfoVo;
            private List<ConfigContentVo> config;

            public List<ConfigContentVo> getConfig() {
                return config;
            }

            public Builder setConfig(List<ConfigContentVo> config) {
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

            public CreatePipelineVo build() throws PodException {
                if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                        this.config != null)
                    return new CreatePipelineVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }
        }
    }
