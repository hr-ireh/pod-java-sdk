package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class UpdateAppCollaboratorVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , accessRequestVO, id, cid are required parameters!";

    private BaseInfoVo baseInfoVo;
    private AccessRequestContentVo accessRequestVO;
    private String cid;
    private String id;
    private String level;


    public UpdateAppCollaboratorVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.accessRequestVO = builder.getAccessRequestVO();
        this.cid = TypeConversionUtil.longToString(builder.getCid());
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.level = TypeConversionUtil.intToString(builder.getLevel());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public AccessRequestContentVo getAccessRequestVO() {
        return accessRequestVO;
    }

    public String getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getCid() {
        return cid;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private AccessRequestContentVo accessRequestVO;
        private Long cid;
        private Long id;
        private Integer level;

        public Long getCid() {
            return cid;
        }

        public Builder setCid(Long cid) {
            this.cid = cid;
            return this;
        }

        public AccessRequestContentVo getAccessRequestVO() {
            return accessRequestVO;
        }

        public Builder setAccessRequestVO(AccessRequestContentVo accessRequestVO) {
            this.accessRequestVO = accessRequestVO;
            return this;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Integer getLevel() {
            return level;
        }

        public Builder setLevel(Integer level) {
            this.level = level;
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

        public UpdateAppCollaboratorVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.accessRequestVO != null && this.cid != null)
                return new UpdateAppCollaboratorVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
