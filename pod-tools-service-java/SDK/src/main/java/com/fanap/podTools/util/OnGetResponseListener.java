package com.fanap.podTools.util;

import com.fanap.podTools.data.modelVo.ResultVo;
import com.fanap.podTools.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
