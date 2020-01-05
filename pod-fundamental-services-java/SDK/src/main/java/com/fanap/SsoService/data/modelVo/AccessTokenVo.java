package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class AccessTokenVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Grant_type, redirect_uri, code and clientInfoVo (client_id and client_secret) are required parameters!";

    private String grant_type;
    private String redirect_uri;
    private String code;
    private String code_verifier;
    private ClientInfoVo clientInfoVo = new ClientInfoVo();

    public AccessTokenVo(Builder builder) {

        this.grant_type = builder.getGrant_type();
        this.redirect_uri = builder.getRedirect_uri();
        this.code = builder.getCode();
        this.code_verifier = builder.getCode_verifier();
        this.clientInfoVo.setClient_id(builder.getClientInfoVo().getClient_id());
        this.clientInfoVo.setClient_secret(builder.getClientInfoVo().getClient_secret());
    }

    public ClientInfoVo getClientInfoVo() {
        return clientInfoVo;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public String getCode() {
        return code;
    }

    public String getCode_verifier() {
        return code_verifier;
    }

    public static class Builder {
        private String grant_type;
        private String redirect_uri;
        private String code;
        private String code_verifier;
        private ClientInfoVo clientInfoVo;

        public Builder() {
        }

        public ClientInfoVo getClientInfoVo() {
            return clientInfoVo;
        }

        public Builder setClientInfoVo(ClientInfoVo clientInfoVo) {
            this.clientInfoVo = clientInfoVo;
            return this;
        }

        public String getGrant_type() {
            return grant_type;
        }

        public Builder setGrant_type(String grant_type) {
            this.grant_type = grant_type;
            return this;
        }

        public String getRedirect_uri() {
            return redirect_uri;
        }

        public Builder setRedirect_uri(String redirect_uri) {
            this.redirect_uri = redirect_uri;
            return this;
        }

        public String getCode() {
            return code;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public String getCode_verifier() {
            return code_verifier;
        }

        public Builder setCode_verifier(String code_verifier) {
            this.code_verifier = code_verifier;
            return this;
        }

        public AccessTokenVo build() throws PodException {
            if (this.getGrant_type() != null && this.getRedirect_uri() != null && this.getCode() != null &&
                    this.getClientInfoVo() != null && this.getClientInfoVo().getClient_id() != null &&
                    this.getClientInfoVo().getClient_secret() != null)
                return new AccessTokenVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
