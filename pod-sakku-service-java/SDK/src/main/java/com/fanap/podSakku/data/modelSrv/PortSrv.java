package com.fanap.podSakku.data.modelSrv;


public class PortSrv {
    private String type;
    private int container;
    private int lbPort;
    private boolean ssl;
    private boolean onlyInternal;
    private String endpoint;
    private boolean basicAuthentication;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public int getLbPort() {
        return lbPort;
    }

    public void setLbPort(int lbPort) {
        this.lbPort = lbPort;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public boolean isOnlyInternal() {
        return onlyInternal;
    }

    public void setOnlyInternal(boolean onlyInternal) {
        this.onlyInternal = onlyInternal;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public boolean isBasicAuthentication() {
        return basicAuthentication;
    }

    public void setBasicAuthentication(boolean basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }
}
