package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class StartApplicationByIdVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String committed;
    private String force;
    private String tag;


    public StartApplicationByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.committed = TypeConversionUtil.booleanToString(builder.getCommitted());
        this.force = TypeConversionUtil.booleanToString(builder.getForce());
        this.tag = builder.getTag();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCommitted() {
        return committed;
    }

    public String getForce() {
        return force;
    }

    public String getTag() {
        return tag;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private Boolean committed;
        private Boolean force;
        private String tag;

        public Boolean getCommitted() {
            return committed;
        }

        public Builder setCommitted(Boolean committed) {
            this.committed = committed;
            return this;
        }

        public Boolean getForce() {
            return force;
        }

        public Builder setForce(Boolean force) {
            this.force = force;
            return this;
        }

        public String getTag() {
            return tag;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
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

        public StartApplicationByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null)
                return new StartApplicationByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
