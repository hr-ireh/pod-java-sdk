package com.fanap.podSakku.data.modelSrv;


/**
 * @author N.Zamiri
 */

public class AddHealthCheckSrv {

    private String scheme;
    private String endpoint;
    private long initialDelay;
    private long checkRate;
    private int responseCode;
    private String responseString;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public long getInitialDelay() {
        return initialDelay;
    }

    public void setInitialDelay(long initialDelay) {
        this.initialDelay = initialDelay;
    }

    public long getCheckRate() {
        return checkRate;
    }

    public void setCheckRate(long checkRate) {
        this.checkRate = checkRate;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }
}
