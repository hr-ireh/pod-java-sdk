package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.enums.EnumUserDomainState;

import java.util.List;

/**
 * Mehdi Akbarian-Rastaghi 9/2/19
 */


public class UserDomainSrv {
    private String domain;
    private List<NameServerSrv> nameServer;
    private CertSrv cert;
    private EnumUserDomainState state;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<NameServerSrv> getNameServer() {
        return nameServer;
    }

    public void setNameServer(List<NameServerSrv> nameServer) {
        this.nameServer = nameServer;
    }

    public CertSrv getCert() {
        return cert;
    }

    public void setCert(CertSrv cert) {
        this.cert = cert;
    }

    public EnumUserDomainState getState() {
        return state;
    }

    public void setState(EnumUserDomainState state) {
        this.state = state;
    }
}
