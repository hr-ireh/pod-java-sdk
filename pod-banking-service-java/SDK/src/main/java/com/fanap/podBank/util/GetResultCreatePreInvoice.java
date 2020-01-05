package com.fanap.podBank.util;

import com.fanap.podBank.data.modelSrv.ResultSrvCreatePreInvoiceSrv;
import com.fanap.podBank.data.modelVo.ResultVo;
import com.fanap.podBaseService.exception.PodException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultCreatePreInvoice<T> {

    private OnGetResponseListener<T> onGetResponseListener;
    private Call<ResultSrvCreatePreInvoiceSrv<T>> call;
    private ResultVo<T> resultVo = new ResultVo<T>();

    public GetResultCreatePreInvoice(Call<ResultSrvCreatePreInvoiceSrv<T>> call, OnGetResponseListener<T> onGetResponseListener) {
        this.call = call;
        this.onGetResponseListener = onGetResponseListener;
    }

    public void get() {
        if (onGetResponseListener != null) {

            call.enqueue(new Callback<ResultSrvCreatePreInvoiceSrv<T>>() {

                @Override
                public void onResponse(Call<ResultSrvCreatePreInvoiceSrv<T>> call, Response<ResultSrvCreatePreInvoiceSrv<T>> response) {
                    ResultSrvCreatePreInvoiceSrv resultSrvCreatePreInvoice = response.body();
                    if (!resultSrvCreatePreInvoice.isHasError()) {
                        resultVo.setCount(resultSrvCreatePreInvoice.getCount());
                        resultVo.setOtt(resultSrvCreatePreInvoice.getOtt());
                        resultVo.setResult((T) resultSrvCreatePreInvoice.getResult());
                        resultVo.setAggregations(resultSrvCreatePreInvoice.getAggregations());
                        resultVo.setMessageId(resultSrvCreatePreInvoice.getMessageId());
                        resultVo.setReferenceNumber(resultSrvCreatePreInvoice.getReferenceNumber());

                        onGetResponseListener.onResponse(resultVo);

                    } else {
                        onGetResponseListener.onFailed(
                                PodException.developerException(resultSrvCreatePreInvoice.getErrorCode(),
                                        resultSrvCreatePreInvoice.getErrorMessage()));
                    }

                }

                @Override
                public void onFailure(Call<ResultSrvCreatePreInvoiceSrv<T>> call, Throwable throwable) {
                    if (onGetResponseListener != null)
                        onGetResponseListener.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
