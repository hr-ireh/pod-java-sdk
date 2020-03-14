package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class TransferAppByIdVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , id, requestVO   are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private TransferRequestVo requestVO;

    public TransferAppByIdVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.requestVO = builder.getRequestVO();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public TransferRequestVo getRequestVO() {
        return requestVO;
    }

    public String getId() {
        return id;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private TransferRequestVo requestVO;

        public TransferRequestVo getRequestVO() {
            return requestVO;
        }

        public Builder setRequestVO(TransferRequestVo requestVO) {
            this.requestVO = requestVO;
            return this;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
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

        public TransferAppByIdVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.requestVO != null)
                return new TransferAppByIdVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
