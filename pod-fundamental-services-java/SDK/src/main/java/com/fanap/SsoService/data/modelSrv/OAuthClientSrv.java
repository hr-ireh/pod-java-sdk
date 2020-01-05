package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class OAuthClientSrv {
    private String client_id;
    private String apiToken;
    private String redirect_uri;
    private String scope;
    private String icon;
    private String description;
    private String name;
    private String url;
    private long userId;
    private String loginUrl;
    private String[] roles;
    private String supportNumber;
    private boolean captchaEnabled;
    private boolean signupEnabled;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getSupportNumber() {
        return supportNumber;
    }

    public void setSupportNumber(String supportNumber) {
        this.supportNumber = supportNumber;
    }

    public boolean isCaptchaEnabled() {
        return captchaEnabled;
    }

    public void setCaptchaEnabled(boolean captchaEnabled) {
        this.captchaEnabled = captchaEnabled;
    }

    public boolean isSignupEnabled() {
        return signupEnabled;
    }

    public void setSignupEnabled(boolean signupEnabled) {
        this.signupEnabled = signupEnabled;
    }
}
