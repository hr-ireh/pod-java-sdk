package com.fanap.billingService.data.modelVo;

/**
 * Created By Khojasteh on 2/27/2019
 */
public class ResultVoGeneral<T> {
    private T result;

    public T getResult() {
        return result;
    }

    public ResultVoGeneral<T> setResult(T result) {
        this.result = result;
        return this;
    }
}
