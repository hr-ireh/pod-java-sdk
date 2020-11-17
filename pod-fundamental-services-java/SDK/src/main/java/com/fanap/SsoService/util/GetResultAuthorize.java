package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.AuthorizeSrv;
import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.exception.PodException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerAuthorize;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultAuthorize {

    private OnGetResponseListenerAuthorize onGetResponseListenerAuthorize;
    private Call<AuthorizeSrv> call;

    public GetResultAuthorize(Call<AuthorizeSrv> call) {
        this.call = call;
    }

    public GetResultAuthorize(Call call, OnGetResponseListenerAuthorize getResponseListenerAuthorize) {
        this.call = call;
        this.onGetResponseListenerAuthorize = getResponseListenerAuthorize;
    }

    public void get() {
        if (onGetResponseListenerAuthorize != null) {
            call.enqueue(new Callback<AuthorizeSrv>() {
                @Override
                public void onResponse(Call<AuthorizeSrv> call, Response<AuthorizeSrv> response) {
                    if (response.code() == 200) {
                        AuthorizeSrv authorizeSrv = response.body();
                        onGetResponseListenerAuthorize.onResponse(authorizeSrv);
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerAuthorize.onFailed(
                                PodException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<AuthorizeSrv> call, Throwable throwable) {
                    if (onGetResponseListenerAuthorize != null)
                        onGetResponseListenerAuthorize.onFailed(PodException.unexpectedException());
                }
            });
        }
    }

    public AuthorizeSrv getResponse() throws PodException {
        try {
            Response<AuthorizeSrv> response = call.execute();

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