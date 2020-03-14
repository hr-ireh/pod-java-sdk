package com.fanap.podSakku.data.modelVo;

import java.util.HashMap;

/**
 * Mehdi AKbarian-Rastaghi 6/18/19
 */

public class ModuleRequestVo {
    private int code;
    private Long appId;
    private HashMap<String, String> metadata;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
    }
}
