package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class UpdateAppWebHookByIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id, vo, wid are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String wid;
    private WebhookContentVo vo;


    public UpdateAppWebHookByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.wid = TypeConversionUtil.longToString(builder.getWid());
        this.vo = builder.getVo();
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

    public WebhookContentVo getVo() {
        return vo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private Long wid;
        private WebhookContentVo vo;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Long getWid() {
            return wid;
        }

        public Builder setWid(Long wid) {
            this.wid = wid;
            return this;
        }

        public WebhookContentVo getVo() {
            return vo;
        }

        public Builder setVo(WebhookContentVo vo) {
            this.vo = vo;
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

        public UpdateAppWebHookByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.vo != null && this.wid != null)
                return new UpdateAppWebHookByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
