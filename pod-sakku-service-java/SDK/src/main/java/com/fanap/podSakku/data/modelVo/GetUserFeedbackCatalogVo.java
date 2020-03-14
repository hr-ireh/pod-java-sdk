package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class GetUserFeedbackCatalogVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization is required parameters!";

    private BaseInfoVo baseInfoVo;
    private String status;


    public GetUserFeedbackCatalogVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.status = TypeConversionUtil.booleanToString(builder.getStatus());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Boolean status;

        public Boolean getStatus() {
            return status;
        }

        public Builder setStatus(Boolean status) {
            this.status = status;
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

        public GetUserFeedbackCatalogVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null)
                return new GetUserFeedbackCatalogVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

