package com.fanap.AvandService.data.modelSrv;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class ProductGroupSrv implements Serializable {
    private long id;
    private List<String> sharedAttributeCodes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getSharedAttributeCodes() {
        return sharedAttributeCodes;
    }

    public void setSharedAttributeCodes(List<String> sharedAttributeCodes) {
        this.sharedAttributeCodes = sharedAttributeCodes;
    }
}
