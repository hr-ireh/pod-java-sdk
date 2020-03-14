package com.fanap.podSakku.data.modelVo;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class WebhookContentVo {
    private Long applicationId;
    private Boolean secured;
    private String topics;
    private String url;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Boolean getSecured() {
        return secured;
    }

    public void setSecured(Boolean secured) {
        this.secured = secured;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
