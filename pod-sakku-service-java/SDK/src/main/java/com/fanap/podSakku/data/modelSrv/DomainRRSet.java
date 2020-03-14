package com.fanap.podSakku.data.modelSrv;

import java.util.List;


public class DomainRRSet {

    private String name;
    private Integer ttl;
    private RecordType type;
    private List<DomainRecord> records;
    private List<DomainRecordCommentSrv> comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public RecordType getType() {
        return type;
    }

    public List<DomainRecord> getRecords() {
        return records;
    }

    public void setRecords(List<DomainRecord> records) {
        this.records = records;
    }

    public List<DomainRecordCommentSrv> getComments() {
        return comments;
    }

    public void setComments(List<DomainRecordCommentSrv> comments) {
        this.comments = comments;
    }

    public enum RecordType {
        SOA,
        A,
        AAAA,
        CAA,
        CNAME,
        MX,
        PTR,
        SPF,
        SRV,
        TXT,
        LOC,
        NS
    }

    public enum ChangeType {
        DELETE,
        REPLACE
    }

    public void setType(String type) {
        switch (type) {
            case "SOA":
                this.type = RecordType.SOA;
                break;
            case "A":
                this.type = RecordType.A;
                break;
            case "AAAA":
                this.type = RecordType.AAAA;
                break;
            case "CAA":
                this.type = RecordType.CAA;
                break;
            case "CNAME":
                this.type = RecordType.CNAME;
                break;
            case "MX":
                this.type = RecordType.MX;
                break;
            case "PTR":
                this.type = RecordType.PTR;
                break;
            case "SPF":
                this.type = RecordType.SPF;
                break;
            case "SRV":
                this.type = RecordType.SRV;
                break;
            case "TXT":
                this.type = RecordType.TXT;
                break;
            case "LOC":
                this.type = RecordType.LOC;
                break;
            case "NS":
                this.type = RecordType.NS;
                break;
        }
    }

    public void setType(RecordType type) {
        this.type = type;
    }

}
