package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class AddApplicationCollaboratorVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , accessRequestVO, id  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private AccessRequestContentVo accessRequestVO;
    private String id;
    private String level;


    public AddApplicationCollaboratorVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.accessRequestVO = builder.getAccessRequestVO();
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

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private AccessRequestContentVo accessRequestVO;
        private Long id;
        private Integer level;

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

        public AddApplicationCollaboratorVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.accessRequestVO != null)
                return new AddApplicationCollaboratorVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
