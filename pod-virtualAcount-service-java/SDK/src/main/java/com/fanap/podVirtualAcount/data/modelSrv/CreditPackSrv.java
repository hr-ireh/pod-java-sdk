package com.fanap.podVirtualAcount.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by h.mehrara on 8/30/2016 @Nozhaco.
 */
/*@ApiObject(
        name = "CreditPackSrv",
        description = "desc"
)*/
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
