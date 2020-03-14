package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class DeleteAppCollaboratorVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization, id, cid are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String cid;
    private String id;

    public DeleteAppCollaboratorVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.cid = TypeConversionUtil.longToString(builder.getCid());
        this.id = TypeConversionUtil.longToString(builder.getId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getCid() {
        return cid;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long cid;
        private Long id;

        public Long getCid() {
            return cid;
        }

        public Builder setCid(Long cid) {
            this.cid = cid;
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

        public DeleteAppCollaboratorVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.cid != null)
                return new DeleteAppCollaboratorVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

