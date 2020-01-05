package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class BusinessDealerSrv implements Serializable {
    private BusinessSoftSrv business;
    private BusinessSoftSrv dealer;
    private boolean enable;

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public BusinessSoftSrv getDealer() {
        return dealer;
    }

    public void setDealer(BusinessSoftSrv dealer) {
        this.dealer = dealer;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
