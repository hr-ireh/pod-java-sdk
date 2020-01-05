package com.fanap.billingService.util;

import com.fanap.billingService.data.modelSrv.ResultSrvCreatePreInvoice;
import com.fanap.billingService.data.modelSrv.ResultSrvGeneral;
import com.fanap.billingService.data.modelVo.ResultVoGeneral;
import com.fanap.billingService.exception.PodException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultGeneral<T> {

    private OnGetResponseListenerGeneral<T> onGetResponseListenerGeneral;
    private Call<ResultSrvGeneral<T>> call;
    private ResultVoGeneral<T> resultVoGeneral = new ResultVoGeneral<>();

    public GetResultGeneral(Call<ResultSrvGeneral<T>> call, OnGetResponseListenerGeneral<T> onGetResponseListenerGeneral) {
        this.call = call;
        this.onGetResponseListenerGeneral = onGetResponseListenerGeneral;
    }

    public void get() {
        if (onGetResponseListenerGeneral != null) {

            call.enqueue(new Callback<ResultSrvGeneral<T>>() {

                @Override
                public void onResponse(Call<ResultSrvGeneral<T>> call, Response<ResultSrvGeneral<T>> response) {

                    ResultSrvGeneral resultSrvGeneral = response.body();
                    ResultVoGeneral resultVoGeneral = new ResultVoGeneral();
                    resultVoGeneral.setResult(resultSrvGeneral.getResult());

                    onGetResponseListenerGeneral.onResponse(resultVoGeneral);

                }

                @Override
                public void onFailure(Call<ResultSrvGeneral<T>> call, Throwable throwable) {
                    if (onGetResponseListenerGeneral != null)
                        onGetResponseListenerGeneral.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
