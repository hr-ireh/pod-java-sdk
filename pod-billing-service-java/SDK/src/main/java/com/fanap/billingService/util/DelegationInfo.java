package com.fanap.billingService.util;

public class DelegationInfo {
    private Long delegatorId;
    private String delegationHash;

    public DelegationInfo(Long delegatorId, String delegationHash) {
        this.delegationHash = delegationHash;
        this.delegatorId = delegatorId;
    }

    public Long getDelegatorId() {
        return delegatorId;
    }

    public void setDelegatorId(Long delegatorId) {
        this.delegatorId = delegatorId;
    }

    public String getDelegationHash() {
        return delegationHash;
    }

    public void setDelegationHash(String delegationHash) {
        this.delegationHash = delegationHash;
    }
}
