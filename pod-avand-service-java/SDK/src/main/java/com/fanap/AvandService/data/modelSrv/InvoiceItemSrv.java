package com.fanap.AvandService.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class InvoiceItemSrv implements Serializable {
    private long id;
    private ProductSrv productSrv;
    private BigDecimal amount;
    private String description;
    private BigDecimal quantity;
    private List<VoucherUsageSrv> voucherUsageSrvs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProductSrv getProductSrv() {
        return productSrv;
    }

    public void setProductSrv(ProductSrv productSrv) {
        this.productSrv = productSrv;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public List<VoucherUsageSrv> getVoucherUsageSrvs() {
        return voucherUsageSrvs;
    }

    public void setVoucherUsageSrvs(List<VoucherUsageSrv> voucherUsageSrvs) {
        this.voucherUsageSrvs = voucherUsageSrvs;
    }
}
