package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class AddUserFeedbackCatalogsVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , catalogFeedbackVo and Description, subject, type in catalogFeedbackVo are required parameters!";

    private BaseInfoVo baseInfoVo;
    private CatalogFeedbackVo catalogFeedbackVo;


    public AddUserFeedbackCatalogsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.catalogFeedbackVo = builder.getCatalogFeedbackVo();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public CatalogFeedbackVo getCatalogFeedbackVo() {
        return catalogFeedbackVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private CatalogFeedbackVo catalogFeedbackVo;


        public CatalogFeedbackVo getCatalogFeedbackVo() {
            return catalogFeedbackVo;
        }

        public Builder setCatalogFeedbackVo(CatalogFeedbackVo catalogFeedbackVo) {
            this.catalogFeedbackVo = catalogFeedbackVo;
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

        public AddUserFeedbackCatalogsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.catalogFeedbackVo != null && this.catalogFeedbackVo.getType() != null &&
                    this.catalogFeedbackVo.getDescription() != null &&
                    this.catalogFeedbackVo.getSubject() != null)
                return new AddUserFeedbackCatalogsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


