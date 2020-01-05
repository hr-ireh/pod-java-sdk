package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.HandshakeSrv;
import com.fanap.SsoService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerHandshake {
    void onResponse(HandshakeSrv result) throws PodException;

    void onFailed(PodException e);
}
