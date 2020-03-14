package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.DomainRRSet;
import com.fanap.podSakku.enums.EnumRecordType;
import com.fanap.podSakku.exception.PodException;

public class UpdateDomainRecordVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , record, name, type and domain are required parameters!";

    private BaseInfoVo baseInfoVo;
    private DomainRRSet record;
    private String domain;
    private String name;
    private String type;


    public UpdateDomainRecordVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.domain = builder.getDomain();
        this.record = builder.getRecord();
        this.name = builder.getName();
        this.type = builder.getType();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public DomainRRSet getRecord() {
        return record;
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
        private DomainRRSet record;
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

        public DomainRRSet getRecord() {
            return record;
        }

        public Builder setRecord(DomainRRSet record) {
            this.record = record;
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

        public UpdateDomainRecordVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.record != null && this.domain != null && this.name != null &&
                    this.type != null)
                return new UpdateDomainRecordVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}
