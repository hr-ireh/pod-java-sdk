package com.fanap.podTools.data.modelSrv;

import java.io.Serializable;
import java.util.Map;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class ResultSrvCreatePreInvoiceSrv<T> implements Serializable {
    private boolean HasError;
    private Long messageId;
    private String referenceNumber;
    private int ErrorCode;
    private String ErrorMessage;
    private long Count;
    private String Ott;
    private T Result;
    private Map<String, Object> aggregations;

    public ResultSrvCreatePreInvoiceSrv() {

    }

    public ResultSrvCreatePreInvoiceSrv(T result) {
        this.Result = result;
    }

    public ResultSrvCreatePreInvoiceSrv(T result, long count) {
        this.Count = count;
        this.Result = result;
    }

    public ResultSrvCreatePreInvoiceSrv(T result, long count, Map<String, Object> aggregations) {
        this.Result = result;
        this.Count = count;
        this.aggregations = aggregations;
    }

    public ResultSrvCreatePreInvoiceSrv(T result, int errorCode, String ErrorMessage) {
        this.Result = result;
        this.ErrorMessage = ErrorMessage;
        this.ErrorCode = errorCode;
        if (this.ErrorMessage == null || this.ErrorMessage.trim().equals("")) {
            this.ErrorMessage = String.valueOf(errorCode);
        }
    }

    public ResultSrvCreatePreInvoiceSrv(Throwable throwable) {
//        this.referenceNumber = ExceptionUtil.getReferenceNumber(throwable);
//        this.result = ExceptionUtil.getErrorResult(throwable);
//        this.message = ExceptionUtil.getErrorMessage(throwable);
//        this.errorCode = ExceptionUtil.getErrorCode(throwable);
        this.HasError = true;
        if (this.ErrorMessage == null || this.ErrorMessage.trim().equals("")) {
            this.ErrorMessage = String.valueOf(ErrorCode);
        }
    }

    public boolean isHasError() {
        return HasError;
    }

    public void setHasError(boolean hasError) {
        this.HasError = hasError;
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
        return ErrorCode;
    }

    public void setErrorCode(int errorCode) {
        this.ErrorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.ErrorMessage = errorMessage;
    }

    public long getCount() {
        return Count;
    }

    public void setCount(long count) {
        this.Count = count;
    }

    public String getOtt() {
        return Ott;
    }

    public void setOtt(String ott) {
        this.Ott = ott;
    }

    public T getResult() {
        return Result;
    }

    public void setResult(T result) {
        this.Result = result;
    }

    public Map<String, Object> getAggregations() {
        return aggregations;
    }

    public void setAggregations(Map<String, Object> aggregations) {
        this.aggregations = aggregations;
    }
}
