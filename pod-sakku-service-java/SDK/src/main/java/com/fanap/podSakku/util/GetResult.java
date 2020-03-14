package com.fanap.podSakku.util;

import com.fanap.podSakku.data.modelSrv.ResultSrv;
import com.fanap.podSakku.data.modelVo.FailedResultVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import org.json.JSONObject;
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
    private FailedResultVo failedResultVo = new FailedResultVo();
    private String responseBody;
    private JSONObject jsonObject;

    public GetResult(Call<ResultSrv<T>> call, OnGetResponseListener<T> onGetResponseListener) {
        this.call = call;
        this.onGetResponseListener = onGetResponseListener;
    }

    public void get() {
        if (onGetResponseListener != null) {
            call.enqueue(new Callback<ResultSrv<T>>() {

                @Override
                public void onResponse(Call<ResultSrv<T>> call, Response<ResultSrv<T>> response) {
                    int statusCode = response.code();
                    if (statusCode == 200) {
                        ResultSrv resultSrv = response.body();
                        resultVo.setCode(resultSrv.getCode());
                        resultVo.setError((Boolean) resultSrv.isError());
                        resultVo.setResult((T) resultSrv.getResult());
                        resultVo.setMessage(resultSrv.getMessage());

                        onGetResponseListener.onResponse(resultVo);

                    } else {
                        try {
                            responseBody = response.errorBody().string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        jsonObject = JsonUtil.getJsonObject(responseBody);

//                        failedResultVo.setError((String) resultSrv.isError());
//                        failedResultVo.setMessage(resultSrv.getMessage());
//                        failedResultVo.setPath(resultSrv.getPath());
//                        failedResultVo.setStatus(resultSrv.getStatus());
//                        failedResultVo.setTimestamp(resultSrv.getTimestamp());
                        onGetResponseListener.onFailed(
                                PodException.developerException((int) jsonObject.get("status"),
                                        jsonObject.get("message").toString()));
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
