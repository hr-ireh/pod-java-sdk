package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;
import okhttp3.ResponseBody;

import java.io.*;
import java.sql.Timestamp;

/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class LogsExportVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "token, appId, saveTo  are required parameters!";

    private String appId;
    private String toDate;
    private String fromDate;
    private String token;
    private static String saveTo;


    public LogsExportVo(Builder builder) {
        this.appId = TypeConversionUtil.longToString(builder.getAppId());
        this.toDate = TypeConversionUtil.longToString(builder.getToDate());
        this.fromDate = TypeConversionUtil.longToString(builder.getFromDate());
        this.token = builder.getToken();
        this.saveTo = builder.getSaveTo();
    }

    public String getSaveTo() {
        return saveTo;
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
        private Long toDate;
        private Long fromDate;
        private String token;
        private static String saveTo;

        public String getSaveTo() {
            return saveTo;
        }

        public Builder setSaveTo(String saveTo) {
            this.saveTo = saveTo;
            return this;
        }

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

        public Long getToDate() {
            return toDate;
        }

        public Builder setToDate(Timestamp toDate) {
            this.toDate = toDate.getTime();
            return this;
        }

        public Long getFromDate() {
            return fromDate;
        }

        public Builder setFromDate(Timestamp fromDate) {
            this.fromDate = fromDate.getTime();
            return this;
        }

        public LogsExportVo build() throws PodException {
            if (this.appId != null && this.token != null && this.getSaveTo() != null)
                return new LogsExportVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }

    public static boolean writeResponseBodyToDisk(ResponseBody body) {
        try {

            File futureStudioIconFile = new File(saveTo);

            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                byte[] fileReader = new byte[4096];

                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(futureStudioIconFile);

                while (true) {
                    int read = inputStream.read(fileReader);

                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);

                    fileSizeDownloaded += read;
                }

                outputStream.flush();
                System.out.println("it saved in your file");
                return true;
            } catch (IOException e) {
                return false;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            return false;
        }
    }

}

