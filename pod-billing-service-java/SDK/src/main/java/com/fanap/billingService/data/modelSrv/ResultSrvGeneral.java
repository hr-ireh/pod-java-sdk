package com.fanap.billingService.data.modelSrv;

import java.io.Serializable;
import java.util.Map;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class ResultSrvGeneral<T> implements Serializable {

    private T Result;

    public T getResult() {
        return Result;
    }

    public void setResult(T result) {
        Result = result;
    }

    public ResultSrvGeneral() {

    }

    public ResultSrvGeneral(T result) {
        this.Result = result;
    }
}
