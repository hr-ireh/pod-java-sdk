package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class RefreshAccessTokenVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Grant_type, refresh_token, clientInfo (client_id and client_secret) are required parameters!";

    private String grant_type;
    private String refresh_token;
    private ClientInfoVo clientInfoVo = new ClientInfoVo();

    public RefreshAccessTokenVo(Builder builder) {

        this.grant_type = builder.getGrant_type();
        this.refresh_token = builder.getRefresh_token();
        this.clientInfoVo.setClient_id(builder.getClientInfoVo().getClient_id());
        this.clientInfoVo.setClient_secret(builder.getClientInfoVo().getClient_secret());

    }

    public ClientInfoVo getClientInfoVo() {
        return clientInfoVo;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public static class Builder {
        private String grant_type;
        private String refresh_token;
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

        public String getRefresh_token() {
            return refresh_token;
        }

        public Builder setRefresh_token(String refresh_token) {
            this.refresh_token = refresh_token;
            return this;
        }

        public RefreshAccessTokenVo build() throws PodException {
            if (this.getGrant_type() != null && this.getRefresh_token() != null &&
                    this.getClientInfoVo() != null &&
                    this.getClientInfoVo().getClient_id() != null && this.getClientInfoVo().getClient_secret() != null)
                return new RefreshAccessTokenVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
