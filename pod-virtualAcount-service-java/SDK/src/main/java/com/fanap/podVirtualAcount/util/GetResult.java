package com.fanap.podVirtualAcount.util;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAcount.data.modelSrv.ErrorSrv;
import com.fanap.podVirtualAcount.data.modelSrv.ResultSrv;
import com.fanap.podVirtualAcount.data.modelVo.ResultVo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResult<T> {

    private OnGetResponseListener<T> onGetResponseListener;
    private Call<ResultSrv<T>> call;
    private ResultVo<T> resultVo = new ResultVo<T>();

    public GetResult(Call<ResultSrv<T>> call) {
        this.call = call;
    }

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

    public ResultVo<T> getResponse() throws PodException {
        try {
            Response<ResultSrv<T>> response = call.execute();
            ResultSrv resultSrv = response.body();

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
                    String referenceNumber = resultSrv.getReferenceNumber() != null && resultSrv.getReferenceNumber().length() > 0 ? "\nشناسه پیگیری:" + resultSrv.getReferenceNumber() : "";
                    throw PodException.developerException(resultSrv.getErrorCode(), resultSrv.getMessage() + referenceNumber);
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