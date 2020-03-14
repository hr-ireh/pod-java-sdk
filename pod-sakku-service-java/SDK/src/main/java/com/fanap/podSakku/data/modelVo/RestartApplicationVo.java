package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class RestartApplicationVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , appId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String appId;
    private String commitStart;
    private String commitStop;
    private String tagStart;
    private String tagStop;


    public RestartApplicationVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.commitStart = TypeConversionUtil.booleanToString(builder.getCommitStart());
        this.commitStop = TypeConversionUtil.booleanToString(builder.getCommitStop());
        this.tagStart = builder.getTagStart();
        this.tagStop = builder.getTagStop();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getCommitStart() {
        return commitStart;
    }

    public String getCommitStop() {
        return commitStop;
    }

    public String getTagStart() {
        return tagStart;
    }

    public String getTagStop() {
        return tagStop;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long appId;
        private Boolean commitStart;
        private Boolean commitStop;
        private String tagStart;
        private String tagStop;

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
            return this;
        }

        public Boolean getCommitStart() {
            return commitStart;
        }

        public Builder setCommitStart(Boolean commitStart) {
            this.commitStart = commitStart;
            return this;
        }

        public Boolean getCommitStop() {
            return commitStop;
        }

        public Builder setCommitStop(Boolean commitStop) {
            this.commitStop = commitStop;
            return this;
        }

        public String getTagStart() {
            return tagStart;
        }

        public Builder setTagStart(String tagStart) {
            this.tagStart = tagStart;
            return this;
        }

        public String getTagStop() {
            return tagStop;
        }

        public Builder setTagStop(String tagStop) {
            this.tagStop = tagStop;
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

        public RestartApplicationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.appId != null)
                return new RestartApplicationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
