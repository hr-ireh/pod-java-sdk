package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.CatalogMetadata;
import com.fanap.podSakku.exception.PodException;

public class ValidateMetadataVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , metadataVO are required parameters!";

    private BaseInfoVo baseInfoVo;
    private CatalogMetadata metadataVO;


    public ValidateMetadataVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.metadataVO = builder.getMetadataVO();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public CatalogMetadata getMetadataVO() {
        return metadataVO;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private CatalogMetadata metadataVO;

        public CatalogMetadata getMetadataVO() {
            return metadataVO;
        }

        public Builder setMetadataVO(CatalogMetadata metadataVO) {
            this.metadataVO = metadataVO;
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

        public ValidateMetadataVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.metadataVO != null)
                return new ValidateMetadataVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

