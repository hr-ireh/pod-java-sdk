package com.fanap.podSakku.data.modelSrv;

public class UpdatePortSrv {

    private int containerPort;
    private String protocol;
    private boolean ssl;
    private boolean onlyInternal;
    private boolean basicAuthentication;

    public int getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(int containerPort) {
        this.containerPort = containerPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
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

    public boolean isBasicAuthentication() {
        return basicAuthentication;
    }

    public void setBasicAuthentication(boolean basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }
}
