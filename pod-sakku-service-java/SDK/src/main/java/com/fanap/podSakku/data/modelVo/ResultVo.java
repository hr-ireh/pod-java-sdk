package com.fanap.podSakku.data.modelVo;

/**
 * Created By Khojasteh on 2/27/2019
 */
public class ResultVo<T> {
    private Long code;
    private boolean error;
    private String message;
    private T result;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
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

    public ResultVo<T> setResult(T result) {
        this.result = result;
        return this;
    }
}
