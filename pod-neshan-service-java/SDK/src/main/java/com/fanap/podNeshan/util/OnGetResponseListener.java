package com.fanap.podNeshan.util;

import com.fanap.podNeshan.data.modelVo.ResultVo;
import com.fanap.podNeshan.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
