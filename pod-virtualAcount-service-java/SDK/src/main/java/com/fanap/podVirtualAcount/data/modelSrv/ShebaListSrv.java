package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;

public class ShebaListSrv implements Serializable {
    private long id;
    private String shebaNumber;
    private String name;
    private OwnersSrv[] owners;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        this.shebaNumber = shebaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnersSrv[] getOwners() {
        return owners;
    }

    public void setOwners(OwnersSrv[] owners) {
        this.owners = owners;
    }
}