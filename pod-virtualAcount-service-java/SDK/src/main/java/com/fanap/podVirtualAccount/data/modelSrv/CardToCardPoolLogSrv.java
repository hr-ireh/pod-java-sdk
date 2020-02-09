package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class CardToCardPoolLogSrv implements Serializable {

    private String message;
    private boolean success;
    private Date date;
    private String errorCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
