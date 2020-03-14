package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class GetAvailablePortOptionsVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization is required parameters!";

    private BaseInfoVo baseInfoVo;

    public GetAvailablePortOptionsVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public static class Builder {
        private BaseInfoVo baseInfoVo;

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

        public GetAvailablePortOptionsVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null)
                return new GetAvailablePortOptionsVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}
