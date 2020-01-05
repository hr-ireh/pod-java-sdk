package com.fanap.podSubscription.data.modelSrv;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 * Created by Z.gholinia on 7/29/2019.
 */
public class SubscriptionSrv implements Serializable {
    private long id;
    private Long fromDate;
    private Long toDate;
    private Long creationDate;
    private SubscriptionPlanSrv plan;
    private Long usageCount;
    private BigDecimal usedAmount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getFromDate() {
        return fromDate;
    }

    public void setFromDate(Long fromDate) {
        this.fromDate = fromDate;
    }

    public Long getToDate() {
        return toDate;
    }

    public void setToDate(Long toDate) {
        this.toDate = toDate;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public SubscriptionPlanSrv getPlan() {
        return plan;
    }

    public void setPlan(SubscriptionPlanSrv plan) {
        this.plan = plan;
    }

    public Long getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Long usageCount) {
        this.usageCount = usageCount;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }
}
