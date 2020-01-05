package com.fanap.userOperation.util;

import com.fanap.userOperation.data.modelVo.ResultVo;
import com.fanap.userOperation.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
