package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.RefreshAccessTokenSrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerRefreshAccessToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultGetAccessTokenUsingRefreshToken {

    private OnGetResponseListenerRefreshAccessToken onGetResponseListenerRefreshAccessToken;
    private Call<RefreshAccessTokenSrv> call;

    public GetResultGetAccessTokenUsingRefreshToken(Call call, OnGetResponseListenerRefreshAccessToken onGetResponseListenerRefreshAccessToken) {
        this.call = call;
        this.onGetResponseListenerRefreshAccessToken = onGetResponseListenerRefreshAccessToken;
    }

    public void get() {
        if (onGetResponseListenerRefreshAccessToken != null) {
            call.enqueue(new Callback<RefreshAccessTokenSrv>() {
                @Override
                public void onResponse(Call<RefreshAccessTokenSrv> call, Response<RefreshAccessTokenSrv> response) {
                    if (response.code() == 200) {
                        RefreshAccessTokenSrv refreshAccessTokenSrv = response.body();
                        onGetResponseListenerRefreshAccessToken.onResponse(refreshAccessTokenSrv);
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerRefreshAccessToken.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<RefreshAccessTokenSrv> call, Throwable throwable) {
                    if (onGetResponseListenerRefreshAccessToken != null)
                        onGetResponseListenerRefreshAccessToken.onFailed(PodException.unexpectedException());
                }
            });
        }
    }
}
