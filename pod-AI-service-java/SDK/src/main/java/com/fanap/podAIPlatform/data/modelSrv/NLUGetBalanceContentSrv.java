package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NLUGetBalanceContentSrv {
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("subIntent")
    private String subIntent;
    @JsonProperty("originAccount")
    private String originAccount;
    @JsonProperty("numberOfTransaction")
    private String numberOfTransaction;

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getSubIntent() {
        return subIntent;
    }

    public void setSubIntent(String subIntent) {
        this.subIntent = subIntent;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public String getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(String numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }
}
