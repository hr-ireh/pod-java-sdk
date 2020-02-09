package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class WithdrawRulePlanSrv implements Serializable {
    private long id;
    private Date creationDate;
    private BigDecimal maxAmount;
    private Integer maxCount;
    private String typeCode;
    private BusinessSoftSrv business;
    private Integer subscriptionDaysAmount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public Integer getSubscriptionDaysAmount() {
        return subscriptionDaysAmount;
    }

    public void setSubscriptionDaysAmount(Integer subscriptionDaysAmount) {
        this.subscriptionDaysAmount = subscriptionDaysAmount;
    }
}
