package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.enums.EnumReferrerType;
import com.fanap.SsoService.enums.EnumResponseType;
import com.fanap.SsoService.enums.EnumScopeType;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.RSAUtil;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class AuthorizeVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Identity, response_type, keyId, signature and headers are required parameters!";

    private String identity;
    private String identityType;
    private String loginAsUserId;
    private String clientId;
    private String redirectUri;
    private String callbackUri;
    private String codeChallenge;
    private String codeChallengeMethod;
    private String authorization;
    private String response_type;
    private String state;
    private String referrerType;
    private String referrer;
    private String scope;

    public AuthorizeVo(Builder builder) {
        this.identity = builder.getIdentity();
        this.authorization = builder.getAuthorization();
        this.response_type = builder.getResponse_type();
        this.state = builder.getState();
        this.referrerType = builder.getReferrerType();
        this.referrer = builder.getReferrer();
        this.scope = builder.getScope();
        this.clientId = builder.getClientId();
        this.redirectUri = builder.getRedirectUri();
        this.callbackUri = builder.getCallbackUri();
        this.codeChallenge = builder.getCodeChallenge();
        this.codeChallengeMethod = builder.getCodeChallengeMethod();
        this.identityType = builder.getIdentityType();
        this.loginAsUserId = builder.getLoginAsUserId();
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

    public String getIdentityType() {
        return identityType;
    }

    public String getLoginAsUserId() {
        return loginAsUserId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getCallbackUri() {
        return callbackUri;
    }

    public String getCodeChallenge() {
        return codeChallenge;
    }

    public String getCodeChallengeMethod() {
        return codeChallengeMethod;
    }

    public static class Builder {
        private String identity;
        private String response_type;
        private String state;
        private String referrerType;
        private String referrer;
        private String scope;
        private String identityType;
        private String loginAsUserId;
        private String clientId;
        private String redirectUri;
        private String callbackUri;
        private String codeChallenge;
        private String codeChallengeMethod;
        private String authorization;

        public String getIdentityType() {
            return identityType;
        }

        public Builder setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        public String getLoginAsUserId() {
            return loginAsUserId;
        }

        public Builder setLoginAsUserId(String loginAsUserId) {
            this.loginAsUserId = loginAsUserId;
            return this;
        }

        public String getClientId() {
            return clientId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public String getCallbackUri() {
            return callbackUri;
        }

        public Builder setCallbackUri(String callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }

        public String getCodeChallenge() {
            return codeChallenge;
        }

        public Builder setCodeChallenge(String codeChallenge) {
            this.codeChallenge = codeChallenge;
            return this;
        }

        public String getCodeChallengeMethod() {
            return codeChallengeMethod;
        }

        public Builder setCodeChallengeMethod(String codeChallengeMethod) {
            this.codeChallengeMethod = codeChallengeMethod;
            return this;
        }

        public String getAuthorization() {
            return authorization;
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

        public String getResponse_type() {
            return response_type;
        }

        public Builder setResponse_type(EnumResponseType response_type) {
            this.response_type = response_type.getValue();
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

        public Builder setReferrerType(EnumReferrerType enumReferrerType) {
            this.referrerType = enumReferrerType.getValue();
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

        public Builder setScope(EnumScopeType scope) {
            this.scope = scope.getValue();
            return this;
        }

        public AuthorizeVo build() throws PodException {
            if (this.getIdentity() != null &&
                    this.getResponse_type() != null && this.authorization != null)
                return new AuthorizeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
