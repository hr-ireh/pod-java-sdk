package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class CreateCatalogAppVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , catalogId, addCatalogAppVo are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String catalogId;
    private AddCatalogAppVo addCatalogAppVo;


    public CreateCatalogAppVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.catalogId = TypeConversionUtil.longToString(builder.getCatalogId());
        this.addCatalogAppVo = builder.getAddCatalogAppVo();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public AddCatalogAppVo getAddCatalogAppVo() {
        return addCatalogAppVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long catalogId;
        private AddCatalogAppVo addCatalogAppVo;

        public Long getCatalogId() {
            return catalogId;
        }

        public Builder setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public AddCatalogAppVo getAddCatalogAppVo() {
            return addCatalogAppVo;
        }

        public Builder setAddCatalogAppVo(AddCatalogAppVo addCatalogAppVo) {
            this.addCatalogAppVo = addCatalogAppVo;
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

        public CreateCatalogAppVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.catalogId != null && this.addCatalogAppVo != null)
                return new CreateCatalogAppVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
