package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankingResult<T> {
    @JsonProperty("IsSuccess")
    private Boolean IsSuccess;
    @JsonProperty("Message")
    private String Message;
    @JsonProperty("MessageCode")
    private int MessageCode;
    @JsonProperty("Data")
    private T Data;

    public Boolean getIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(Boolean success) {
        IsSuccess = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getMessageCode() {
        return MessageCode;
    }

    public void setMessageCode(int messageCode) {
        MessageCode = messageCode;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
