package com.fanap.podVirtualAccount.util;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
