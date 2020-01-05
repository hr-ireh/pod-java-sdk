package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 2/20/2016.
 */
/*@ApiObject(
        name = "ProductGroupSrv",
        description = "desc"
)*/
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
