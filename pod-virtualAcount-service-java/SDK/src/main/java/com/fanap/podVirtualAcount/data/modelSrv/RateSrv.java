package com.fanap.podVirtualAcount.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 10/26/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "RateSrv",
        description = "desc"
)*/
public class RateSrv implements Serializable {
    private Double myRate;
    private double rate;
    private long rateCount;

    public Double getMyRate() {
        return myRate;
    }

    public void setMyRate(Double myRate) {
        this.myRate = myRate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public long getRateCount() {
        return rateCount;
    }

    public void setRateCount(long rateCount) {
        this.rateCount = rateCount;
    }
}
