package com.fanap.podSakku.data.modelSrv;

import java.io.Serializable;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class ResultSrv<T> implements Serializable {
    private boolean error;
    private Long code;
    private String message;
    private T result;
    private String timestamp;
    private int status;
    private String path;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ResultSrv() {

    }

    public ResultSrv(T result) {
        this.result = result;
    }

    public ResultSrv(T result, long code) {
        this.code = code;
        this.result = result;
    }


    public ResultSrv(T result, boolean error, String message) {
        this.result = result;
        this.message = message;
        this.error = error;
        if (this.message == null || this.message.trim().equals("")) {
            this.message = String.valueOf(error);
        }
    }


    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
