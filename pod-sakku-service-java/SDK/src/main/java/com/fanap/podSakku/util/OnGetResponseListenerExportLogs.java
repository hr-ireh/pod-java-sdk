package com.fanap.podSakku.util;

import com.fanap.podSakku.exception.PodException;

public interface OnGetResponseListenerExportLogs {
     void onResponse(String result);

    void onFailed(PodException e);
}
