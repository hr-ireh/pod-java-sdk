package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeployAppFromCatalogVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , catalogAppId, settings are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String catalogAppId;
    private String settings;
    private String files;


    public DeployAppFromCatalogVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.catalogAppId = TypeConversionUtil.longToString(builder.getCatalogAppId());
        this.settings = builder.getSettings();
//        this.files = builder.getFiles();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCatalogAppId() {
        return catalogAppId;
    }

    public String getSettings() {
        return settings;
    }

    public String getFiles() {
        return files;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long catalogAppId;
        private String settings;
        private String files;

        public Long getCatalogAppId() {
            return catalogAppId;
        }

        public Builder setCatalogAppId(Long catalogAppId) {
            this.catalogAppId = catalogAppId;
            return this;
        }

        public String getSettings() {
            return settings;
        }

        public Builder setSettings(String settings) {
            this.settings = settings;
            return this;
        }

        public String getFiles() {
            return files;
        }

        public Builder setFiles(String files) {
            this.files = files;
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

        public DeployAppFromCatalogVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.catalogAppId != null && this.settings != null)
                return new DeployAppFromCatalogVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
