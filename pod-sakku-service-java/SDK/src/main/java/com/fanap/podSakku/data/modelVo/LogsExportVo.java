package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class LogsExportVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "token , appId  are required parameters!";

    private String appId;
    private String toDate;
    private String fromDate;
    private String token;


    public LogsExportVo(Builder builder) {
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.toDate = builder.getToDate();
        this.fromDate = builder.getFromDate();
        this.token = builder.getToken();
    }

    public String getToDate() {
        return toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public static class Builder {
        private Long appId;
        private String toDate;
        private String fromDate;
        private String token;

        public String getToken() {
            return token;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Long getAppId() {
            return appId;
        }

        public Builder setAppId(Long appId) {
            this.appId = appId;
            return this;
        }

        public String getToDate() {
            return toDate;
        }

        public Builder setToDate(String toDate) {
            this.toDate = toDate;
            return this;
        }

        public String getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(String fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public LogsExportVo build() throws PodException {
            if (this.appId != null && this.token!=null)
                return new LogsExportVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

