package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.GetAccessTokenSrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerGetAccessToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultGetAccessToken {

    private OnGetResponseListenerGetAccessToken onGetResponseListenerGetAccessToken;
    private Call<GetAccessTokenSrv> call;

    public GetResultGetAccessToken(Call call, OnGetResponseListenerGetAccessToken onGetResponseListenerGetAccessToken) {
        this.call = call;
        this.onGetResponseListenerGetAccessToken = onGetResponseListenerGetAccessToken;
    }

    public void get() {
        if (onGetResponseListenerGetAccessToken != null) {
            call.enqueue(new Callback<GetAccessTokenSrv>() {
                @Override
                public void onResponse(Call<GetAccessTokenSrv> call, Response<GetAccessTokenSrv> response) {
                    if (response.code() == 200) {
                        GetAccessTokenSrv getAccessTokenSrv = response.body();
                        onGetResponseListenerGetAccessToken.onResponse(getAccessTokenSrv);
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerGetAccessToken.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<GetAccessTokenSrv> call, Throwable throwable) {
                    if (onGetResponseListenerGetAccessToken != null)
                        onGetResponseListenerGetAccessToken.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
