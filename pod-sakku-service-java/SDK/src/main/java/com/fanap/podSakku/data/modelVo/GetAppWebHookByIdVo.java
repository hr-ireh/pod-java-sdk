package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class GetAppWebHookByIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , vo , id, wid  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private WebhookVo vo;
    private String wid;


    public GetAppWebHookByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.vo = builder.getVo();
        this.wid = TypeConversionUtil.longToString(builder.getWid());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public WebhookVo getVo() {
        return vo;
    }

    public String getWid() {
        return wid;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private WebhookVo vo;
        private Long wid;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public WebhookVo getVo() {
            return vo;
        }

        public Builder setVo(WebhookVo vo) {
            this.vo = vo;
            return this;
        }

        public Long getWid() {
            return wid;
        }

        public Builder setWid(Long wid) {
            this.wid = wid;
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

        public GetAppWebHookByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.wid != null && this.vo != null)
                return new GetAppWebHookByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
