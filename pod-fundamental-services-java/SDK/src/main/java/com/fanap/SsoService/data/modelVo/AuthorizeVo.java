package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class AuthorizeVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Identity, response_type, keyId, signature and headers are required parameters!";

    private String identity;
    private String authorization;
    private String response_type;
    private String state;
    private String referrerType;
    private String referrer;
    private String scope;

    public AuthorizeVo(Builder builder) {
        this.identity = builder.getIdentity();
        this.authorization = "Signature keyId=\"" + builder.getKeyId() +
                "\",signature=\"" + builder.getSignature() + "\"" +
                ",headers=\"" + builder.getHeaders() + "\"";
        this.response_type = builder.getResponse_type();
        this.state = builder.getState();
        this.referrerType = builder.getReferrerType();
        this.referrer = builder.getReferrer();
        this.scope=builder.getScope();
    }

    public String getIdentity() {
        return identity;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getResponse_type() {
        return response_type;
    }

    public String getState() {
        return state;
    }

    public String getReferrerType() {
        return referrerType;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getScope() {
        return scope;
    }

    public static class Builder {
        private String identity;
        private String keyId;
        private String signature;
        private String headers;
        private String response_type;
        private String state;
        private String referrerType;
        private String referrer;
        private String scope;

        public String getKeyId() {
            return keyId;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        public String getSignature() {
            return signature;
        }

        public Builder setSignature(String signature) {
            this.signature = signature;
            return this;
        }

        public String getHeaders() {
            return headers;
        }

        public Builder setHeaders(String headers) {
            this.headers = headers;
            return this;
        }

        public String getIdentity() {
            return identity;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        public String getResponse_type() {
            return response_type;
        }

        public Builder setResponse_type(String response_type) {
            this.response_type = response_type;
            return this;
        }

        public String getState() {
            return state;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public String getReferrerType() {
            return referrerType;
        }

        public Builder setReferrerType(String referrerType) {
            this.referrerType = referrerType;
            return this;
        }

        public String getReferrer() {
            return referrer;
        }

        public Builder setReferrer(String referrer) {
            this.referrer = referrer;
            return this;
        }

        public String getScope() {
            return scope;
        }

        public Builder setScope(String scope) {
            this.scope = scope;
            return this;
        }

        public AuthorizeVo build() throws PodException {
            if (this.getIdentity() != null  &&
                    this.getResponse_type() != null)
                return new AuthorizeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
