package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class CreateApplicationWebhooksVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId, webhookVO  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private WebhookContentVo webhookVO;


    public CreateApplicationWebhooksVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.webhookVO = builder.getWebhookVO();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public WebhookContentVo getWebhookVO() {
        return webhookVO;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private WebhookContentVo webhookVO;

        public WebhookContentVo getWebhookVO() {
            return webhookVO;
        }

        public Builder setWebhookVO(WebhookContentVo webhookVO) {
            this.webhookVO = webhookVO;
            return this;
        }

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
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

        public CreateApplicationWebhooksVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.webhookVO != null)
                return new CreateApplicationWebhooksVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
