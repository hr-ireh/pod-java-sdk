package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;
import sun.dc.pr.PRError;

import java.sql.Timestamp;

public class NLUTransferMoneyContentSrv {
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("subIntent")
    private String subIntent;
    @JsonProperty("originAccount")
    private String originAccount;
    @JsonProperty("destinationAccount")
    private String destinationAccount;
    @JsonProperty("destinationAccountHolder")
    private String destinationAccountHolder;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("timeToGo")
    private Timestamp timeToGo;

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

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getDestinationAccountHolder() {
        return destinationAccountHolder;
    }

    public void setDestinationAccountHolder(String destinationAccountHolder) {
        this.destinationAccountHolder = destinationAccountHolder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(Timestamp timeToGo) {
        this.timeToGo = timeToGo;
    }
}
