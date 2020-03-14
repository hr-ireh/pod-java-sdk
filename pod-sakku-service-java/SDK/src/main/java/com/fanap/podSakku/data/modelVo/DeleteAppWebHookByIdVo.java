package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeleteAppWebHookByIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization, id, wid are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String wid;
    private String id;

    public DeleteAppWebHookByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.wid = TypeConversionUtil.longToString(builder.getWid());
        this.id = TypeConversionUtil.longToString(builder.getId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getWid() {
        return wid;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long wid;
        private Long id;

        public Long getWid() {
            return wid;
        }

        public Builder setWid(Long wid) {
            this.wid = wid;
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

        public DeleteAppWebHookByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.wid != null)
                return new DeleteAppWebHookByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
