package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.enums.EnumResponseType;
import com.fanap.SsoService.enums.EnumScopeType;
import com.fanap.SsoService.exception.PodException;

import java.util.ArrayList;
import java.util.List;

public class LoginUrlVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Grant_type, refresh_token, clientInfo (client_id and client_secret) are required parameters!";

    private String clientId;
    private String responseType;
    private String redirectUri;
    private String scope;
    private String state;

    public LoginUrlVo(Builder builder) {

        this.clientId = builder.getClientId();
        this.responseType = builder.getResponseType();
        this.redirectUri = builder.getRedirectUri();
        this.scope = builder.getScope();
        this.state = builder.getState();
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

    public String getState() {
        return state;
    }

    public static class Builder {
        private String clientId;
        private String responseType;
        private String redirectUri;
        private String scope;
        private String state;

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

        ///  استفاده نمایید “token” یا “id_token” و برای اپلیکیشن های موبایل از , “code” برای احرازهویت در اپلیکیشن های وب از
        public Builder setResponseType(EnumResponseType enumResponseType) {
            this.responseType = enumResponseType.getValue();
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

        public Builder setScope(List<EnumScopeType> scopes) {
            List<String> stringScope = new ArrayList<>();
            for (EnumScopeType scope : scopes) {
                stringScope.add(scope.getValue());
            }
            this.scope = String.join(" ", stringScope);
            return this;
        }

        public String getState() {
            return state;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public LoginUrlVo build() throws PodException {
            if (this.clientId != null && this.responseType != null &&
                    this.redirectUri != null &&
                    this.scope != null)
                return new LoginUrlVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


    public String getLink() {
        String url = "https://accounts.pod.ir/oauth2/authorize/?client_id=" + this.clientId + "&response_type=" + this.responseType;
        if (this.redirectUri != null) {
            url += "&redirect_uri=" + this.redirectUri;
        }
        if (this.state != null) {
            url += "&state=" + this.state;
        }
        if (this.scope != null) {
            url += "&scope=" + this.scope;
        }
        return url;
    }
}
