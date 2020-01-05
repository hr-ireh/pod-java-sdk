package com.fanap.podBank.data.modelSrv;

import java.util.List;

public class ShebaInfoSrv {
    public String sheba;
    public List<OwnersSrv> owners;

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public List<OwnersSrv> getOwners() {
        return owners;
    }

    public void setOwners(List<OwnersSrv> owners) {
        owners = owners;
    }
}
