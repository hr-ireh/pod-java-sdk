package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class CommitApplicationContainerVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String containerId;
    private String tag;


    public CommitApplicationContainerVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.containerId = builder.getContainerId();
        this.tag = builder.getTag();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public String getContainerId() {
        return containerId;
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
        private String containerId;
        private String tag;

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
            return this;
        }

        public String getContainerId() {
            return containerId;
        }

        public Builder setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        public String getTag() {
            return tag;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
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

        public CommitApplicationContainerVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null)
                return new CommitApplicationContainerVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
