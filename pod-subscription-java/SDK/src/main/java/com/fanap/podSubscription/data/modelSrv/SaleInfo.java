package com.fanap.podSubscription.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 11/8/2014 @Nozhaco.
 */
public class SaleInfo implements Serializable {
    private long id;
    private double discountPercent;
    private long startDate;
    private long endDate;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
