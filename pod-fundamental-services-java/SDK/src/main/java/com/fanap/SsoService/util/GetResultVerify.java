package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.VerifySrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerVerify;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultVerify {

    private OnGetResponseListenerVerify onGetResponseListenerVerify;
    private Call<VerifySrv> call;

    public GetResultVerify(Call<VerifySrv> call) {
        this.call = call;
    }

    public GetResultVerify(Call call, OnGetResponseListenerVerify getResponseListenerVerify) {
        this.call = call;
        this.onGetResponseListenerVerify = getResponseListenerVerify;
    }

    public void get() {
        if (onGetResponseListenerVerify != null) {
            call.enqueue(new Callback<VerifySrv>() {
                @Override
                public void onResponse(Call<VerifySrv> call, Response<VerifySrv> response) {
                    if (response.code() == 200) {
                        VerifySrv verifySrv = response.body();
                        try {
                            onGetResponseListenerVerify.onResponse(verifySrv);
                        } catch (PodException e) {
                            e.printStackTrace();
                        }
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerVerify.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<VerifySrv> call, Throwable throwable) {
                    if (onGetResponseListenerVerify != null)
                        onGetResponseListenerVerify.onFailed(PodException.unexpectedException());
                }
            });
        }
    }

    public VerifySrv getResponse() throws PodException {
        try {
            Response<VerifySrv> response = call.execute();

            if (response.code() == 200) {
                return response.body();
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