package com.fanap.podSakku.data.modelSrv;

import java.util.List;

public class GetDomainRecordsSrv {
    private List<String> comments;
    private List<RecordContentSrv> records;
    private boolean reserve;
    private String name;
    private String type;
    private String ttl;

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<RecordContentSrv> getRecords() {
        return records;
    }

    public void setRecords(List<RecordContentSrv> records) {
        this.records = records;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
