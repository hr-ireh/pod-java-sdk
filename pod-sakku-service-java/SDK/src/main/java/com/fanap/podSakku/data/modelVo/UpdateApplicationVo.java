package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class UpdateApplicationVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId, body are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private UpdateConfigVo body;

    public String getAppId() {
        return appId;
    }

    public UpdateConfigVo getBody() {
        return body;
    }

    public UpdateApplicationVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.body = builder.getBody();

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private UpdateConfigVo body;

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
            return this;
        }

        public UpdateConfigVo getBody() {
            return body;
        }

        public Builder setBody(UpdateConfigVo body) {
            this.body = body;
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

        public UpdateApplicationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null && this.body != null)
                return new UpdateApplicationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
