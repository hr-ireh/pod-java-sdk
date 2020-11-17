package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.enums.EnumGrantType;
import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class GetAccessTokenByOtpVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Grant_type, code, clientInfo (client_id and client_secret) are required parameters!";

    private String grant_type;
    private String code;
    private ClientInfoVo clientInfoVo = new ClientInfoVo();

    public GetAccessTokenByOtpVo(GetAccessTokenByOtpVo.Builder builder) {

        this.grant_type = builder.getGrant_type();
        this.code = builder.getCode();
        this.clientInfoVo.setClient_id(builder.getClientInfoVo().getClient_id());
        this.clientInfoVo.setClient_secret(builder.getClientInfoVo().getClient_secret());

    }

    public ClientInfoVo getClientInfoVo() {
        return clientInfoVo;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getCode() {
        return code;
    }

    public static class Builder {
        private String grant_type;
        private String code;
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

        public GetAccessTokenByOtpVo.Builder setGrant_type(EnumGrantType grant_type) {
            this.grant_type = grant_type.getValue();
            return this;
        }

        public String getCode() {
            return code;
        }

        public GetAccessTokenByOtpVo.Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public GetAccessTokenByOtpVo build() throws PodException {
            if (this.getGrant_type() != null && this.getCode() != null &&
                    this.getClientInfoVo() != null &&
                    this.getClientInfoVo().getClient_id() != null && this.getClientInfoVo().getClient_secret() != null)
                return new GetAccessTokenByOtpVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
