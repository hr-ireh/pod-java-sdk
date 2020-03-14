package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class AddAppHealthCheckVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , healthCheckVO , id  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private HealthCheckVo healthCheckVO;
    private String id;


    public AddAppHealthCheckVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.healthCheckVO = builder.getHealthCheckVoVO();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public HealthCheckVo getHealthCheckVO() {
        return healthCheckVO;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private HealthCheckVo healthCheckVoVO;
        private Long id;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public HealthCheckVo getHealthCheckVoVO() {
            return healthCheckVoVO;
        }

        public Builder setHealthCheckVoVO(HealthCheckVo healthCheckVoVO) {
            this.healthCheckVoVO = healthCheckVoVO;
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

        public AddAppHealthCheckVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.healthCheckVoVO != null)
                return new AddAppHealthCheckVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
