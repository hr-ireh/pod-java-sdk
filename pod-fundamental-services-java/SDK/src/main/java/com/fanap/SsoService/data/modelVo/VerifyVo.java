package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.RSAUtil;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class VerifyVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Otp, identity, keyId, signature and headers are required parameters!";

    private String authorization;
    private String otp;
    private String identity;

    public VerifyVo(Builder builder) {
        this.authorization = builder.getAuthorization();
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
        private String authorization;

        public String getAuthorization() {
            return authorization;
        }

        public String getOtp() {
            return otp;
        }

        public Builder setOtp(String otp) {
            this.otp = otp;
            return this;
        }

        public Builder setAuthorization(String keyId, String privateKey) {
            String header = "host";
            String dataToSign = "host: accounts.pod.ir";
            String signature = null;
            try {
                signature = RSAUtil.signSHA256RSA(dataToSign, RSAUtil.XML2PrivateKey(privateKey));
            } catch (Exception e) {
                e.printStackTrace();
            }
            authorization = "Signature keyId = " + keyId + ",signature =" + signature + ", headers =" + header;
            return this;

        }

        public String getIdentity() {
            return identity;
        }

        public Builder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }


        public VerifyVo build() throws PodException {
            if (this.getIdentity() != null && this.authorization != null && this.otp != null)
                return new VerifyVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
