package com.fanap.billingService.data.modelVo;

import java.math.BigDecimal;

/**
 * Created by Shahab Askarian on 7/21/2019.
 */
public class ProductInfo {

    private Long productId;
    private BigDecimal price;
    private BigDecimal quantity;
    private String productDescription;

    public Long getProductId() {
        return productId;
    }

    public ProductInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductInfo setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public ProductInfo setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public ProductInfo setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
}
