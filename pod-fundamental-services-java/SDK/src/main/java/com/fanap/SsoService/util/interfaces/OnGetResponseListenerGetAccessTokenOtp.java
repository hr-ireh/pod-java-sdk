package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.GetAccessTokenOtpSrv;
import com.fanap.SsoService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerGetAccessTokenOtp {
    void onResponse(GetAccessTokenOtpSrv result);

    void onFailed(PodException e);

}
