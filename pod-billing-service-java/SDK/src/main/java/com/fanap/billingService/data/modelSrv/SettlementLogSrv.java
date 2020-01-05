package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 4/10/2016.
 */

/*@ApiObject(
        name = "SettlementRequestSrv",
        description = "desc"
)*/
public class SettlementLogSrv implements Serializable {
    boolean success;
    String message;
    long date;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
