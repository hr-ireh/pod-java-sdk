package com.fanap.podSakku.data.modelSrv;

public class DomainRecordCommentSrv {

    private String content;
    private String account;
    private Integer modified_at;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getModified_at() {
        return modified_at;
    }

    public void setModified_at(Integer modified_at) {
        this.modified_at = modified_at;
    }
}
