package com.fanap.userOperation.data.modelVo;

import java.util.List;

import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BaseInfoVo {


    private String token;
    private String token_issuer;
    private String client_id;
    private String client_secret;
    public List<String> scVoucherHash;
    public String scApiKey;

    public List<String> getScVoucherHash() {
        return scVoucherHash;
    }

    public String getScApiKey() {
        return scApiKey;
    }

    public String getToken() {
        return token;
    }

    public BaseInfoVo setToken(String token) {
        this.token = token;
        return this;
    }

    public String getToken_issuer() {
        return token_issuer;
    }

    public BaseInfoVo setToken_issuer(String token_issuer) {
        this.token_issuer = token_issuer;
        return this;
    }

    public String getClient_id() {
        return client_id;
    }

    public BaseInfoVo setClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public BaseInfoVo setClient_secret(String client_secret) {
        this.client_secret = client_secret;
        return this;
    }


    public BaseInfoVo setScVoucherHash(List<String> scVoucherHash) {
        this.scVoucherHash = scVoucherHash;
        return this;
    }

    public BaseInfoVo setScApiKey(String scApiKey) {
        this.scApiKey = scApiKey;
        return this;
    }
}
