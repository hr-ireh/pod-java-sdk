package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetShebaAndStatusContentSrv {
    @JsonProperty("Sheba")
    private String Sheba;
    @JsonProperty("AccountOwners")
    private List<AccountOwnersContent> AccountOwners;
    @JsonProperty("AccountStatus")
    private  String AccountStatus;
    @JsonProperty("AccountStatusName")
    private String AccountStatusName;

    public String getSheba() {
        return Sheba;
    }

    public void setSheba(String sheba) {
        this.Sheba = sheba;
    }

    public List<AccountOwnersContent> getAccountOwners() {
        return AccountOwners;
    }

    public void setAccountOwners(List<AccountOwnersContent> accountOwners) {
        AccountOwners = accountOwners;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }

    public String getAccountStatusName() {
        return AccountStatusName;
    }

    public void setAccountStatusName(String accountStatusName) {
        AccountStatusName = accountStatusName;
    }
}
