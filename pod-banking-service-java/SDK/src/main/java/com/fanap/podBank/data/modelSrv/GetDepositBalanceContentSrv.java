package com.fanap.podBank.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetDepositBalanceContentSrv {
    @JsonProperty("DepositNumber")
    private String DepositNumber;
    @JsonProperty("Amounts")
    private List<AmountSrv> Amounts;
    @JsonProperty("WithdrawableAmounts")
    private List<WithdrawableAmountsSrv> WithdrawableAmounts;

    public String getDepositNumber() {
        return DepositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        DepositNumber = depositNumber;
    }

    public List<AmountSrv> getAmounts() {
        return Amounts;
    }

    public void setAmounts(List<AmountSrv> amounts) {
        Amounts = amounts;
    }

    public List<WithdrawableAmountsSrv> getWithdrawableAmounts() {
        return WithdrawableAmounts;
    }

    public void setWithdrawableAmounts(List<WithdrawableAmountsSrv> withdrawableAmounts) {
        WithdrawableAmounts = withdrawableAmounts;
    }
}
