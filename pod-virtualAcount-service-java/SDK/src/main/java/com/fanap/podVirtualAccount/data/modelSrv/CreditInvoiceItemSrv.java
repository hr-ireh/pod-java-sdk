package com.fanap.podVirtualAccount.data.modelSrv;

import java.math.BigDecimal;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class CreditInvoiceItemSrv {
    private long id;
    private BigDecimal quantity;
    private CreditPackSrv creditPack;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public CreditPackSrv getCreditPack() {
        return creditPack;
    }

    public void setCreditPack(CreditPackSrv creditPack) {
        this.creditPack = creditPack;
    }
}
