package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class UpdateHealthCheckByIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id, hid, updateRequest are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String hid;
    private String id;
    private HealthCheckVo updateRequest;


    public UpdateHealthCheckByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.hid = TypeConversionUtil.longToString(builder.getHid());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.updateRequest = builder.getUpdateRequest();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getHid() {
        return hid;
    }

    public String getId() {
        return id;
    }

    public HealthCheckVo getUpdateRequest() {
        return updateRequest;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long hid;
        private Long id;
        private HealthCheckVo updateRequest;

        public HealthCheckVo getUpdateRequest() {
            return updateRequest;
        }

        public Builder setUpdateRequest(HealthCheckVo updateRequest) {
            this.updateRequest = updateRequest;
            return this;
        }

        public Long getHid() {
            return hid;
        }

        public Builder setHid(Long hid) {
            this.hid = hid;
            return this;
        }

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

        public UpdateHealthCheckByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.hid != null && this.updateRequest != null)
                return new UpdateHealthCheckByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
