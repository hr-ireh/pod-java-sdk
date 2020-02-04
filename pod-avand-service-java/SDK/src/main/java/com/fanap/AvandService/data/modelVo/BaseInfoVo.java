package com.fanap.AvandService.data.modelVo;

import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BaseInfoVo {

    //    private Enum_Server_type serverType;
    private String token;
    private String token_issuer;
    private String ott;
    public List<String> scVoucherHash;
    public String scApiKey;

    public BaseInfoVo(Builder builder) {
//        this.serverType = builder.getServerType();
        this.token = builder.getToken();
        this.token_issuer = TypeConversionUtil.intToString(builder.getToken_issuer());
        this.ott = builder.getOtt();
        this.scApiKey = builder.getScApiKey();
        this.scVoucherHash = builder.getScVoucherHash();
    }

//    public Enum_Server_type getServerType() {
//        return serverType;
//    }

    public String getOtt() {
        return ott;
    }

    public String getToken() {
        return token;
    }

    public String getToken_issuer() {
        return token_issuer;
    }

    public String getScApiKey() {
        return scApiKey;
    }

    public List<String> getScVoucherHash() {
        return scVoucherHash;
    }

    public static class Builder {
        //        private Enum_Server_type serverType;
        private String token;
        private Integer token_issuer;
        private String ott;
        public List<String> scVoucherHash;
        public String scApiKey;

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

//        public Builder setServerType(Enum_Server_type serverType) {
//            this.serverType = serverType;
//            return this;
//        }

        public Builder setToken_issuer(Integer token_issuer) {
            this.token_issuer = token_issuer;
            return this;
        }

//        public Enum_Server_type getServerType() {
//            return serverType;
//        }

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

//    public BaseInfoVo setServerType(Enum_Server_type serverType) {
//        this.serverType = serverType;
//        return this;
//    }
}
