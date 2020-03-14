package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.enums.EnumRecordType;
import com.fanap.podSakku.exception.PodException;

public class DeleteDomainRecordVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization, name, type and domain are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String domain;
    private String name;
    private String type;


    public DeleteDomainRecordVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.domain = builder.getDomain();
        this.name = builder.getName();
        this.type = builder.getType();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String domain;
        private String name;
        private String type;

        public String getDomain() {
            return domain;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getType() {
            return type;
        }

        public Builder setType(EnumRecordType type) {
            this.type = type.getValue();
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

        public DeleteDomainRecordVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.domain != null && this.name != null && this.type != null)
                return new DeleteDomainRecordVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

