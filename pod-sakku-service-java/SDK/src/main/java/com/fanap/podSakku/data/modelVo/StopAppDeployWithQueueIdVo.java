package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class StopAppDeployWithQueueIdVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , deployQueueId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String deployQueueId;

    public StopAppDeployWithQueueIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.deployQueueId = builder.getDeployQueueId();

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDeployQueueId() {
        return deployQueueId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String deployQueueId;

        public String getDeployQueueId() {
            return deployQueueId;
        }

        public Builder setDeployQueueId(String deployQueueId) {
            this.deployQueueId = deployQueueId;
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

        public StopAppDeployWithQueueIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.deployQueueId != null)
                return new StopAppDeployWithQueueIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
