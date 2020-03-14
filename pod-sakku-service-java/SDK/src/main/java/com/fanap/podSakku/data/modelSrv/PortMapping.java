package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.enums.EnumProtocol;

public class PortMapping {
    private transient int host;
    //private int lbPort;
    private int port;

    private EnumProtocol protocol = EnumProtocol.HTTP;

    private boolean ssl = false;

    private boolean onlyInternal = false;
    private boolean basicAuthentication;

    public int getHost() {
        return host;
    }

    public void setHost(int host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public EnumProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(EnumProtocol protocol) {
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
