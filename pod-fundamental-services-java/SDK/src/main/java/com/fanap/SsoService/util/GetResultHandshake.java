package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.HandshakeSrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerHandshake;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultHandshake {

    private OnGetResponseListenerHandshake onGetResponseListenerHandshake;
    private Call<HandshakeSrv> call;

    public GetResultHandshake(Call call, OnGetResponseListenerHandshake getResponseListenerHandshake) {
        this.call = call;
        this.onGetResponseListenerHandshake = getResponseListenerHandshake;
    }

    public void get() {
        if (onGetResponseListenerHandshake != null) {
            call.enqueue(new Callback<HandshakeSrv>() {
                @Override
                public void onResponse(Call<HandshakeSrv> call, Response<HandshakeSrv> response) {
                    if (response.code() == 200) {
                        HandshakeSrv handshakeSrv = response.body();
                        try {
                            onGetResponseListenerHandshake.onResponse(handshakeSrv);
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
                        onGetResponseListenerHandshake.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<HandshakeSrv> call, Throwable throwable) {
                    if (onGetResponseListenerHandshake != null)
                        onGetResponseListenerHandshake.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
