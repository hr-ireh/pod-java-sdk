package com.fanap.podVirtualAcount.data.modelSrv;


import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 1/14/2016.
 */
/*@ApiObject(
        name = "UserAmountSrv",
        description = "desc"
)*/
public class UserAmountSrv implements Serializable {
    List<CustomerAmountSrv> customerAmountSrvs;
    List<BusinessAmountSrv> mainBusinessAmountSrvs;
    List<BusinessAmountSrv> blockedBusinessAmountSrvs;
    List<CustomerAmountSrv> blockAmountSrvs;

    public List<CustomerAmountSrv> getCustomerAmountSrvs() {
        return customerAmountSrvs;
    }

    public void setCustomerAmountSrvs(List<CustomerAmountSrv> customerAmountSrvs) {
        this.customerAmountSrvs = customerAmountSrvs;
    }

    public List<BusinessAmountSrv> getMainBusinessAmountSrvs() {
        return mainBusinessAmountSrvs;
    }

    public void setMainBusinessAmountSrvs(List<BusinessAmountSrv> mainBusinessAmountSrvs) {
        this.mainBusinessAmountSrvs = mainBusinessAmountSrvs;
    }

    public List<BusinessAmountSrv> getBlockedBusinessAmountSrvs() {
        return blockedBusinessAmountSrvs;
    }

    public void setBlockedBusinessAmountSrvs(List<BusinessAmountSrv> blockedBusinessAmountSrvs) {
        this.blockedBusinessAmountSrvs = blockedBusinessAmountSrvs;
    }

    public List<CustomerAmountSrv> getBlockAmountSrvs() {
        return blockAmountSrvs;
    }

    public void setBlockAmountSrvs(List<CustomerAmountSrv> blockAmountSrvs) {
        this.blockAmountSrvs = blockAmountSrvs;
    }
}
