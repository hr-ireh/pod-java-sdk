package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.RevokeTokenSrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerRevokeToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultRevokeToken {

    private OnGetResponseListenerRevokeToken onGetResponseListenerRevokeToken;
    private Call<Void> call;

    public GetResultRevokeToken(Call<Void> call, OnGetResponseListenerRevokeToken onGetResponseListenerRevokeToken) {
        this.call = call;
        this.onGetResponseListenerRevokeToken = onGetResponseListenerRevokeToken;
    }

    public void get() {
        if (onGetResponseListenerRevokeToken != null) {
            call.enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    if (response.code() == 200) {
                        RevokeTokenSrv revokeTokenSrv = new RevokeTokenSrv();
                        revokeTokenSrv.setCode(response.code());
                        revokeTokenSrv.setMessage("The operation was successful");
                        onGetResponseListenerRevokeToken.onResponse(response.body());
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerRevokeToken.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<Void> call, Throwable throwable) {
                    if (onGetResponseListenerRevokeToken != null)
                        onGetResponseListenerRevokeToken.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
