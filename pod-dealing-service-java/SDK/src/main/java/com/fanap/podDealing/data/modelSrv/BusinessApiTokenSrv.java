package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by S.heidari on 11/19/2018.
 */
public class BusinessApiTokenSrv implements Serializable {
    private static final long serialVersionUID = 5134699632642333428L;
    private BusinessSoftSrv business;
    private String apiToken;
    private String clientId;

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
