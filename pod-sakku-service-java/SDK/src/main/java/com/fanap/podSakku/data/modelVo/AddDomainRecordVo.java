package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.data.modelSrv.DomainRRSet;
import com.fanap.podSakku.exception.PodException;

public class AddDomainRecordVo {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , record and domain are required parameters!";

    private BaseInfoVo baseInfoVo;
    private DomainRRSet record;
    private String domain;


    public AddDomainRecordVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.domain = builder.getDomain();
        this.record = builder.getRecord();
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

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private DomainRRSet record;
        private String domain;

        public String getDomain() {
            return domain;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
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

        public AddDomainRecordVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.record != null && this.domain != null && this.record.getRecords() != null &&
                    this.record.getTtl() != null && this.record.getType() != null)
                return new AddDomainRecordVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

}
