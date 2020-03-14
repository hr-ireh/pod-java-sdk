package com.fanap.podSakku.data.modelVo;

/**
 * Mehdi Akbarian-Rastaghi 4/10/19
 */
public class WebhookVo {

    private String url;
    private boolean Secured;
    private String topics = "*";
    private Long applicationId;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSecured() {
        return Secured;
    }

    public void setSecured(boolean secured) {
        Secured = secured;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
