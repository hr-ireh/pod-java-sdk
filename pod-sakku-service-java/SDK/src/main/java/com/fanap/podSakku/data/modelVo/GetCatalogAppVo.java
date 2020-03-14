package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class GetCatalogAppVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , catalogAppId, catalogId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String catalogAppId;
    private String catalogId;


    public GetCatalogAppVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.catalogAppId = TypeConversionUtil.longToString(builder.getCatalogAppId());
        this.catalogId = TypeConversionUtil.longToString(builder.getCatalogId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCatalogAppId() {
        return catalogAppId;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long catalogAppId;
        private Long catalogId;

        public Long getCatalogAppId() {
            return catalogAppId;
        }

        public Builder setCatalogAppId(Long catalogAppId) {
            this.catalogAppId = catalogAppId;
            return this;
        }

        public Long getCatalogId() {
            return catalogId;
        }

        public Builder setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
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

        public GetCatalogAppVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.catalogAppId != null && this.catalogId != null)
                return new GetCatalogAppVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
