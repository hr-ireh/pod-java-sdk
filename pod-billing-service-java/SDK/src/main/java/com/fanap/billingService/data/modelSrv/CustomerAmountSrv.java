package com.fanap.billingService.data.modelSrv;



import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by h.mehrara on 1/14/2016.
 */
public class CustomerAmountSrv implements Serializable {
    private BigDecimal amount;
    private CurrencySrv currencySrv;
    private Boolean isAutoSettle;
    private String wallet;
    private String walletName;
    private Boolean active;
    private String uniqueId;
    private boolean block;

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

    public CurrencySrv getCurrencySrv() {
        return currencySrv;
    }

    public void setCurrencySrv(CurrencySrv currencySrv) {
        this.currencySrv = currencySrv;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }
}
