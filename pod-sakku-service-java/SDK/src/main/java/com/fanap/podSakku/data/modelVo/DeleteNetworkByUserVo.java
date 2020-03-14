package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeleteNetworkByUserVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , force and name  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String force;
    private String name;


    public DeleteNetworkByUserVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.name = builder.getName();
        this.force = TypeConversionUtil.booleanToString(builder.getForce());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getForce() {
        return force;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Boolean force;
        private String name;

        public Boolean getForce() {
            return force;
        }

        public Builder setForce(Boolean force) {
            this.force = force;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
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

        public DeleteNetworkByUserVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.force != null && this.name != null)
                return new DeleteNetworkByUserVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

