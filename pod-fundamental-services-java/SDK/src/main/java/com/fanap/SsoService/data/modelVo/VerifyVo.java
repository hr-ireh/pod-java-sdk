package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class VerifyVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Otp, identity, keyId, signature and headers are required parameters!";

    private String authorization;
    private String otp;
    private String identity;

    public VerifyVo(Builder builder) {
        this.authorization = "Signature keyId=\"" + builder.getKeyId() +
                "\",signature=\"" + builder.getSignature() + "\"" +
                ",headers=\"" + builder.getHeaders() + "\"";
        this.identity = builder.getIdentity();
        this.otp = builder.getOtp();
    }

    public String getOtp() {
        return otp;
    }

    public String getIdentity() {
        return identity;
    }

    public String getAuthorization() {
        return authorization;
    }

    public static class Builder {
        private String otp;
        private String identity;
        private String keyId;
        private String signature;
        private String headers;

        public String getOtp() {
            return otp;
        }

        public Builder setOtp(String otp) {
            this.otp = otp;
            return this;
        }

        public String getIdentity() {
            return identity;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

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

        public VerifyVo build() throws PodException {
            if (this.getHeaders() != null && this.getIdentity() != null &&
                    this.getKeyId() != null && this.getOtp() != null &&
                    this.getSignature() != null)
                return new VerifyVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
