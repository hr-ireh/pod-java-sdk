package com.fanap.AvandService.data.modelVo;

import java.util.Map;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class ResultVo<T> {

    private boolean hasError;
    private Long messageId;
    private String referenceNumber;
    private Map<String, Object> aggregations;
    private long count;
    private String ott;
    private T result;

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Long getMessageId() {
        return messageId;
    }

    public ResultVo<T> setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public ResultVo<T> setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    public Map<String, Object> getAggregations() {
        return aggregations;
    }

    public ResultVo<T> setAggregations(Map<String, Object> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    public long getCount() {
        return count;
    }

    public ResultVo<T> setCount(long count) {
        this.count = count;
        return this;
    }

    public String getOtt() {
        return ott;
    }

    public ResultVo<T> setOtt(String ott) {
        this.ott = ott;
        return this;
    }

    public T getResult() {
        return result;
    }

    public ResultVo<T> setResult(T result) {
        this.result = result;
        return this;
    }
}
