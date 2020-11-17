package com.fanap.billingService.util;

import com.fanap.billingService.data.modelSrv.ErrorSrv;
import com.fanap.billingService.data.modelSrv.ResultSrvCreatePreInvoice;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.exception.PodException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultCreatePreInvoice<T> {
    private OnGetResponseListener<T> onGetResponseListener;
    private Call<ResultSrvCreatePreInvoice<T>> call;
    private ResultVo<T> resultVo = new ResultVo<T>();

    public GetResultCreatePreInvoice(Call<ResultSrvCreatePreInvoice<T>> call) {
        this.call = call;
    }

    public GetResultCreatePreInvoice(Call<ResultSrvCreatePreInvoice<T>> call, OnGetResponseListener<T> onGetResponseListener) {
        this.call = call;
        this.onGetResponseListener = onGetResponseListener;
    }

    public void get() {
        if (onGetResponseListener != null) {

            call.enqueue(new Callback<ResultSrvCreatePreInvoice<T>>() {

                @Override
                public void onResponse(Call<ResultSrvCreatePreInvoice<T>> call, Response<ResultSrvCreatePreInvoice<T>> response) {
                    ResultSrvCreatePreInvoice resultSrvCreatePreInvoice = response.body();
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
                public void onFailure(Call<ResultSrvCreatePreInvoice<T>> call, Throwable throwable) {
                    if (onGetResponseListener != null)
                        onGetResponseListener.onFailed(PodException.unexpectedException());
                }
            });
        }
    }

    public ResultVo<T> getResponse() throws PodException {
        try {
            Response<ResultSrvCreatePreInvoice<T>> response = call.execute();
            ResultSrvCreatePreInvoice resultSrv = response.body();

            if (response.code() == 200 && resultSrv != null) {
                if (!resultSrv.isHasError()) {
                    ResultVo<T> resultVo = new ResultVo<>();
                    resultVo.setCount(resultSrv.getCount());
                    resultVo.setOtt(resultSrv.getOtt());
                    resultVo.setMessageId(resultSrv.getMessageId());
                    resultVo.setReferenceNumber(resultSrv.getReferenceNumber());
                    resultVo.setResult((T) resultSrv.getResult());
                    resultVo.setAggregations(resultSrv.getAggregations());
                    return resultVo;
                } else {
                    throw PodException.developerException(resultSrv.getErrorCode(), resultSrv.getErrorMessage());
                }
            } else if (response.errorBody() != null) {
                ResponseBody responseBody = response.errorBody();
                ErrorSrv errorSrv = JacksonUtil.getObject(responseBody.string(), ErrorSrv.class);
                throw PodException.developerException(response.code(), errorSrv.getError() + ". " + errorSrv.getError_description());
            } else {
                throw PodException.unexpectedException();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw PodException.unexpectedException();
        }
    }
}