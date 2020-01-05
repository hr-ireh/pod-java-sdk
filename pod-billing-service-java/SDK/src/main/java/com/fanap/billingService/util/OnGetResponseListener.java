package com.fanap.billingService.util;

import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
