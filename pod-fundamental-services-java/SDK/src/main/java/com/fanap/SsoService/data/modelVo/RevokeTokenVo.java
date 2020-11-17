package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.enums.EnumRevokeTokenType;
import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class RevokeTokenVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token_type_hint, token, clientInfo (client_id and client_secret) are required parameters!";

    private String token_type_hint;
    private String token;
    private ClientInfoVo clientInfoVo = new ClientInfoVo();

    public RevokeTokenVo(Builder builder) {

        this.token_type_hint = builder.getToken_type_hint();
        this.token = builder.getToken();
        this.clientInfoVo.setClient_id(builder.getClientInfoVo().getClient_id());
        this.clientInfoVo.setClient_secret(builder.getClientInfoVo().getClient_secret());
    }

    public ClientInfoVo getClientInfoVo() {
        return clientInfoVo;
    }

    public String getToken_type_hint() {
        return token_type_hint;
    }

    public String getToken() {
        return token;
    }

    public static class Builder {
        private String token_type_hint;
        private String token;
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

        public String getToken_type_hint() {
            return token_type_hint;
        }

        public Builder setToken_type_hint(EnumRevokeTokenType token_type_hint) {
            this.token_type_hint = token_type_hint.getValue();
            return this;
        }

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public RevokeTokenVo build() throws PodException {
            if (this.getToken_type_hint() != null && this.getToken() != null &&
                    this.getClientInfoVo() != null &&
                    this.getClientInfoVo().getClient_id() != null && this.getClientInfoVo().getClient_secret() != null)
                return new RevokeTokenVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
