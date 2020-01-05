package com.fanap.billingService.data.modelVo;

import java.math.BigDecimal;

public class InvoiceItemInfoVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";

    private Long invoiceItemId;
    private BigDecimal price;
    private String itemDescription;
    private BigDecimal quantity;


    public Long getInvoiceItemId() {
        return invoiceItemId;
    }

    public InvoiceItemInfoVo setInvoiceItemId(Long invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public InvoiceItemInfoVo setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public InvoiceItemInfoVo setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public InvoiceItemInfoVo setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }


}
