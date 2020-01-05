package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;

/**
 * Created by M.Vahedi on 1/26/2019.
 */
public class DirectWithdrawSrv implements Serializable {
    private long id;
    private String username;
    private String depositNumber;
    private String wallet;
    private boolean onDemand;
    private Long minAmount;
    private Long maxAmount;
    private Long creationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public boolean isOnDemand() {
        return onDemand;
    }

    public void setOnDemand(boolean onDemand) {
        this.onDemand = onDemand;
    }

    public Long getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    public Long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }
}
