package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class StopApplicationByIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String commit;
    private String tag;


    public StopApplicationByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.commit = TypeConversionUtil.booleanToString(builder.getCommit());
        this.tag = builder.getTag();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCommit() {
        return commit;
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
        private Boolean commit;
        private String tag;

        public Boolean getCommit() {
            return commit;
        }

        public Builder setCommit(Boolean commit) {
            this.commit = commit;
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

        public StopApplicationByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null)
                return new StopApplicationByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
