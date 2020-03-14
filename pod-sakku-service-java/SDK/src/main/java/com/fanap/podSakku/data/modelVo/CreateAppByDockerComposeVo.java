package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class CreateAppByDockerComposeVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , composeFile are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String composeFile;

    public CreateAppByDockerComposeVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.composeFile = builder.getComposeFile();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getComposeFile() {
        return composeFile;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String composeFile;

        public String getComposeFile() {
            return composeFile;
        }

        public Builder setComposeFile(String composeFile) {
            this.composeFile = composeFile;
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

        public CreateAppByDockerComposeVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.composeFile != null)
                return new CreateAppByDockerComposeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
