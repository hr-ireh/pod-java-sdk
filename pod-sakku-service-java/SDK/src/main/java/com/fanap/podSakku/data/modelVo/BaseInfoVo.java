package com.fanap.podSakku.data.modelVo;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BaseInfoVo {

    private String Authorization;

    public BaseInfoVo(Builder builder) {
        this.Authorization = builder.getAuthorization();
    }

    public String getAuthorization() {
        return Authorization;
    }

    public static class Builder {

        private String Authorization;


        public String getAuthorization() {
            return Authorization;
        }

        public Builder setAuthorization(String authorization) {
            Authorization = authorization;
            return this;
        }

        public BaseInfoVo build() {
            return new BaseInfoVo(this);
        }
    }

}
