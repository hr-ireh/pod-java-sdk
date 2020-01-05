package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

import java.util.List;

public class LoginUrlVo {



        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Grant_type, refresh_token, clientInfo (client_id and client_secret) are required parameters!";

        private String clientId ;
        private String responseType ;
        private String redirectUri ;
        private String scope;

        public LoginUrlVo(Builder builder) {

            this.clientId = builder.getClientId();
            this.responseType = builder.getResponseType();
            this.redirectUri=builder.getRedirectUri();
            this.scope=builder.getScope();
        }

    public String getClientId() {
        return clientId;
    }

    public String getResponseType() {
        return responseType;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getScope() {
        return scope;
    }

    public static class Builder {
            private String clientId ;
            private String responseType ;
            private String redirectUri ;
            private String scope;
            public Builder() {
            }

            public String getClientId() {
                return clientId;
            }

            public Builder setClientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            public String getResponseType() {
                return responseType;
            }

            public Builder setResponseType(String responseType) {
                this.responseType = responseType;
                return this;
            }

            public String getRedirectUri() {
                return redirectUri;
            }

            public Builder setRedirectUri(String redirectUri) {
                this.redirectUri = redirectUri;
                return this;
            }

            public String getScope() {
                return scope;
            }

            public Builder setScope(List<String> scope) {
                this.scope = String.join(" ", scope);
                return this;
            }

            public LoginUrlVo build() throws PodException {
                if (this.clientId != null && this.responseType!= null &&
                        this.redirectUri != null &&
                        this.scope != null)
                    return new LoginUrlVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }
        }


    public String getLink()
    {
        String url = "https://accounts.pod.land/oauth2/authorize/?client_id="+this.clientId+"&response_type="+this.responseType;
        if (this.redirectUri!=null) url += "&redirect_uri="+this.redirectUri;
        if (this.scope!=null) url += "&scope="+this.scope;
        return url;
    }



    }
