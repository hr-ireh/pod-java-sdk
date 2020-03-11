package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AIPlatformResult<T> {
    @JsonProperty("hasError")
    private Boolean hasError;
    @JsonProperty("statusCode")
    private int statusCode;
    @JsonProperty("data")
    private T data;
    @JsonProperty("StatusMessage")
    private String StatusMessage;
    @JsonProperty("Request")
    private String Request;

    public Boolean getHasError() {
        return hasError;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
    }

    public String getRequest() {
        return Request;
    }

    public void setRequest(String request) {
        Request = request;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
