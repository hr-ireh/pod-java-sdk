package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeleteHealthCheckByIdVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id, hid  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String hid;
    private String id;


    public DeleteHealthCheckByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.hid = TypeConversionUtil.longToString(builder.getHid());
        this.id = TypeConversionUtil.longToString(builder.getId());
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

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long hid;
        private Long id;

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

        public DeleteHealthCheckByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.hid != null)
                return new DeleteHealthCheckByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
