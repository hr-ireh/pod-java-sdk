package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.VerifySrv;
import com.fanap.SsoService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerVerify {
    void onResponse(VerifySrv result) throws PodException;

    void onFailed(PodException e);

}
