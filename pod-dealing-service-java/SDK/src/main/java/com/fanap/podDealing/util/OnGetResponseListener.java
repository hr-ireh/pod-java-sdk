package com.fanap.podDealing.util;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.data.modelVo.ResultVo;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
