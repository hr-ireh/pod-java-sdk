package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.TokenInfoSrv;
import com.fanap.SsoService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerGetTokenInfo {
    void onResponse(TokenInfoSrv result);

    void onFailed(PodException e);

}
