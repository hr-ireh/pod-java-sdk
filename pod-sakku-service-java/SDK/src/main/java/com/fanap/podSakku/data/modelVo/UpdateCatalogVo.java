package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.CatalogUpdate;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class UpdateCatalogVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , catalogAppId, catalogUpdate are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String catalogAppId;
    private CatalogUpdate catalogUpdate;


    public UpdateCatalogVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.catalogAppId = TypeConversionUtil.longToString(builder.getCatalogAppId());
        this.catalogUpdate = builder.getCatalogUpdate();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCatalogAppId() {
        return catalogAppId;
    }

    public CatalogUpdate getCatalogUpdate() {
        return catalogUpdate;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long catalogAppId;
        private CatalogUpdate catalogUpdate;

        public Long getCatalogAppId() {
            return catalogAppId;
        }

        public Builder setCatalogAppId(Long catalogAppId) {
            this.catalogAppId = catalogAppId;
            return this;
        }

        public CatalogUpdate getCatalogUpdate() {
            return catalogUpdate;
        }

        public Builder setCatalogUpdate(CatalogUpdate catalogUpdate) {
            this.catalogUpdate = catalogUpdate;
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

        public UpdateCatalogVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.catalogAppId != null && this.catalogUpdate != null)
                return new UpdateCatalogVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

