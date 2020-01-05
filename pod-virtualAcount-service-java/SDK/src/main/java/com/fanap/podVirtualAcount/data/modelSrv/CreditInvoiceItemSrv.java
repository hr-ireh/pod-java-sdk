package com.fanap.podVirtualAcount.data.modelSrv;

import java.math.BigDecimal;

/**
 * Created by Heidari on 3/7/18.
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
