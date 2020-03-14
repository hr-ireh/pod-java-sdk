package com.fanap.podSakku.data.modelSrv;

/**
 * @author N.Zamiri
 */


public class TaskFailureSrv {
    private String host;
    private String message;
    private String state;
    private long timestamp;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}