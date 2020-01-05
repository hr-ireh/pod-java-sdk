package com.fanap.podSubscription.data.modelSrv;

import java.io.Serializable;
import java.util.Map;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class ResultSrv<T> implements Serializable {
    private boolean hasError;
    private Long messageId;
    private String referenceNumber;
    private int errorCode;
    private String message;
    private long count;
    private String ott;
    private T result;
    private Map<String, Object> aggregations;

    public ResultSrv() {

    }

    public ResultSrv(T result) {
        this.result = result;
    }

    public ResultSrv(T result, long count) {
        this.count = count;
        this.result = result;
    }

    public ResultSrv(T result, long count, Map<String, Object> aggregations) {
        this.result = result;
        this.count = count;
        this.aggregations = aggregations;
    }

    public ResultSrv(T result, int errorCode, String message) {
        this.result = result;
        this.message = message;
        this.errorCode = errorCode;
        if (this.message == null || this.message.trim().equals("")) {
            this.message = String.valueOf(errorCode);
        }
    }

    public ResultSrv(Throwable throwable) {
//        this.referenceNumber = ExceptionUtil.getReferenceNumber(throwable);
//        this.result = ExceptionUtil.getErrorResult(throwable);
//        this.message = ExceptionUtil.getErrorMessage(throwable);
//        this.errorCode = ExceptionUtil.getErrorCode(throwable);
        this.hasError = true;
        if (this.message == null || this.message.trim().equals("")) {
            this.message = String.valueOf(errorCode);
        }
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getOtt() {
        return ott;
    }

    public void setOtt(String ott) {
        this.ott = ott;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Map<String, Object> getAggregations() {
        return aggregations;
    }

    public void setAggregations(Map<String, Object> aggregations) {
        this.aggregations = aggregations;
    }
}
