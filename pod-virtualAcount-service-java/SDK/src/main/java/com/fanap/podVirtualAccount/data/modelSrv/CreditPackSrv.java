package com.fanap.podVirtualAccount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class CreditPackSrv implements Serializable {
    private long id;
    private String name;
    private String description;
    private BigDecimal amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
