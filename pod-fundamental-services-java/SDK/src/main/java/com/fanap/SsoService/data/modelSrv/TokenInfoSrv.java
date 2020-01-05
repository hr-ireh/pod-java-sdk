package com.fanap.SsoService.data.modelSrv;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class TokenInfoSrv {

    private boolean active;
    private String client_id;
    private String device_uid;
    private long exp;
    private String scope;
    private String sub;

    public boolean isActive() {
        return active;
    }

    public TokenInfoSrv setActive(boolean active) {
        this.active = active;
        return this;
    }

    public String getClient_id() {
        return client_id;
    }

    public TokenInfoSrv setClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public String getDevice_uid() {
        return device_uid;
    }

    public TokenInfoSrv setDevice_uid(String device_uid) {
        this.device_uid = device_uid;
        return this;
    }

    public long getExp() {
        return exp;
    }

    public TokenInfoSrv setExp(long exp) {
        this.exp = exp;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public TokenInfoSrv setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getSub() {
        return sub;
    }

    public TokenInfoSrv setSub(String sub) {
        this.sub = sub;
        return this;
    }
}
