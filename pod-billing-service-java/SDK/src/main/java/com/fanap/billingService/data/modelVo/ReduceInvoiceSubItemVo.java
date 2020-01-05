package com.fanap.billingService.data.modelVo;

import java.math.BigDecimal;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class ReduceInvoiceSubItemVo {


    private Long id;
    private Long price;
    private String description;
    private BigDecimal quantity;

    public Long getId() {
        return id;
    }

    public Long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public ReduceInvoiceSubItemVo setId(Long id) {
        this.id = id;
        return this;
    }

    public ReduceInvoiceSubItemVo setPrice(Long price) {
        this.price = price;
        return this;
    }

    public ReduceInvoiceSubItemVo setDescription(String description) {
        this.description = description;
        return this;
    }

    public ReduceInvoiceSubItemVo setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }
}




