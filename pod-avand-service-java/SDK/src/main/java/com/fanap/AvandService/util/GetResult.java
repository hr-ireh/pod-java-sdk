package com.fanap.AvandService.util;

import com.fanap.AvandService.data.modelSrv.ResultSrv;
import com.fanap.AvandService.data.modelVo.ResultVo;
import com.fanap.podBaseService.exception.PodException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResult<T> {

    private OnGetResponseListener<T> onGetResponseListener;
    private Call<ResultSrv<T>> call;
    private ResultVo<T> resultVo = new ResultVo<T>();

    public GetResult(Call<ResultSrv<T>> call, OnGetResponseListener<T> onGetResponseListener) {
        this.call = call;
        this.onGetResponseListener = onGetResponseListener;
    }

    public void get() {
        if (onGetResponseListener != null) {

            call.enqueue(new Callback<ResultSrv<T>>() {

                @Override
                public void onResponse(Call<ResultSrv<T>> call, Response<ResultSrv<T>> response) {
                    ResultSrv resultSrv = response.body();
                    if (!resultSrv.isHasError()) {
                        resultVo.setCount(resultSrv.getCount());
                        resultVo.setOtt(resultSrv.getOtt());
                        resultVo.setResult((T) resultSrv.getResult());
                        resultVo.setAggregations(resultSrv.getAggregations());
                        resultVo.setMessageId(resultSrv.getMessageId());
                        resultVo.setReferenceNumber(resultSrv.getReferenceNumber());

                        onGetResponseListener.onResponse(resultVo);

                    } else {
                        onGetResponseListener.onFailed(
                                PodException.developerException(resultSrv.getErrorCode(),
                                        resultSrv.getMessage()));
                    }

                }

                @Override
                public void onFailure(Call<ResultSrv<T>> call, Throwable throwable) {
                    if (onGetResponseListener != null)
                        onGetResponseListener.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
