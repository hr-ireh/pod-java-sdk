package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class GetUserAppsStatusListVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;


    public GetUserAppsStatusListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getId() {
        return id;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;


        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
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

        public GetUserAppsStatusListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null)
                return new GetUserAppsStatusListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}