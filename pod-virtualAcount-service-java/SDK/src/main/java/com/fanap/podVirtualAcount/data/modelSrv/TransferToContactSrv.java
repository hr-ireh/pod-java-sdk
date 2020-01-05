package com.fanap.podVirtualAcount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by M.Vahedi on 2/27/2018.
 */
public class TransferToContactSrv  implements Serializable {
    private ContactSrv destContact;
    private String uniqueId;
    private long id;
    private BigDecimal amount;
    private Date date;
    private CurrencySrv currency;
    private String wallet;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContactSrv getDestContact() {
        return destContact;
    }

    public void setDestContact(ContactSrv destContact) {
        this.destContact = destContact;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


}
