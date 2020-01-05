package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "BusinessSoftSrv",
        description = "desc"
)*/
public class DealerProductPermissionSrv implements Serializable {
    private ProductSrv product;
    private BusinessDealerSrv businessDealer;
    private boolean enable;

    public ProductSrv getProduct() {
        return product;
    }

    public void setProduct(ProductSrv product) {
        this.product = product;
    }

    public BusinessDealerSrv getBusinessDealer() {
        return businessDealer;
    }

    public void setBusinessDealer(BusinessDealerSrv businessDealer) {
        this.businessDealer = businessDealer;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
