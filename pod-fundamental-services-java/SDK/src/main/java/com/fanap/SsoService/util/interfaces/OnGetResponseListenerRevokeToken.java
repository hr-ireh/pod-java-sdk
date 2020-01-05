package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerRevokeToken {
    void onResponse(Void result);

    void onFailed(PodException e);

}
