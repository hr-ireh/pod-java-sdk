package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class GetApplicationSettingVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;


    public GetApplicationSettingVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;

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

        public GetApplicationSettingVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null)
                return new GetApplicationSettingVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
