package com.fanap.podVirtualAccount.data.modelVo;

import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BaseInfoVo {

    private Enum_Server_type serverType;
    private String token;
    private String token_issuer;
    private String ott;
    public List<String> scVoucherHash;
    public String scApiKey;

    public BaseInfoVo(Builder builder) {

        this.token = builder.getToken();
        this.serverType = builder.getServerType();
        this.token_issuer = TypeConversionUtil.intToString(builder.getToken_issuer());
        this.ott = builder.getOtt();
        this.scVoucherHash = builder.getScVoucherHash();
        this.scApiKey = builder.getScApiKey();
    }


    public String getOtt() {
        return ott;
    }

    public String getToken() {
        return token;
    }

    public String getToken_issuer() {
        return token_issuer;
    }

    public List<String> getScVoucherHash() {
        return scVoucherHash;
    }

    public String getScApiKey() {
        return scApiKey;
    }

    public Enum_Server_type getServerType() {
        return serverType;
    }

    public static class Builder {
        private Enum_Server_type serverType;
        private String token;
        private Integer token_issuer;
        private String ott;
        public List<String> scVoucherHash;
        public String scApiKey;

        public Enum_Server_type getServerType() {
            return serverType;
        }

        public Builder setServerType(Enum_Server_type serverType) {
            this.serverType = serverType;
            return this;
        }

        public List<String> getScVoucherHash() {
            return scVoucherHash;
        }

        public Builder setScVoucherHash(List<String> scVoucherHash) {
            this.scVoucherHash = scVoucherHash;
            return this;
        }

        public String getScApiKey() {
            return scApiKey;
        }

        public Builder setScApiKey(String scApiKey) {
            this.scApiKey = scApiKey;
            return this;
        }

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Integer getToken_issuer() {
            return token_issuer;
        }

        public Builder setToken_issuer(Integer token_issuer) {
            this.token_issuer = token_issuer;
            return this;
        }

        public String getOtt() {
            return ott;
        }

        public Builder setOtt(String ott) {
            this.ott = ott;
            return this;
        }

        public BaseInfoVo build() {
            return new BaseInfoVo(this);
        }
    }

}
