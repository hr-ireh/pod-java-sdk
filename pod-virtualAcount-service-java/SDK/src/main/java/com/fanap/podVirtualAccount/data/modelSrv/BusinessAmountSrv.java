package com.fanap.podVirtualAccount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BusinessAmountSrv implements Serializable {
    private BigDecimal amount;
    private BigDecimal withdrawableAmount;
    private GuildSrv guildSrv;
    private CurrencySrv currencySrv;
    private Boolean isAutoSettle;
    private String number;
    private String uniqueId;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Boolean getIsAutoSettle() {
        return isAutoSettle;
    }

    public void setIsAutoSettle(Boolean autoSettle) {
        isAutoSettle = autoSettle;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getWithdrawableAmount() {
        return withdrawableAmount;
    }

    public void setWithdrawableAmount(BigDecimal withdrawableAmount) {
        this.withdrawableAmount = withdrawableAmount;
    }

    public GuildSrv getGuildSrv() {
        return guildSrv;
    }

    public void setGuildSrv(GuildSrv guildSrv) {
        this.guildSrv = guildSrv;
    }

    public CurrencySrv getCurrencySrv() {
        return currencySrv;
    }

    public void setCurrencySrv(CurrencySrv currencySrv) {
        this.currencySrv = currencySrv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
