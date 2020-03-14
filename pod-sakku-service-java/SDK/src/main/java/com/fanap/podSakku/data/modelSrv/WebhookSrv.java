package com.fanap.podSakku.data.modelSrv;

/**
 * Mehdi Akbarian-Rastaghi 4/10/19
 */

public class WebhookSrv {
    private Long id;
    private String url;
    private boolean Secured;
    private String topics;
    private String token;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
