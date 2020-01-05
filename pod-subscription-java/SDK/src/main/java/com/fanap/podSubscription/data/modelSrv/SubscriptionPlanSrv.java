package com.fanap.podSubscription.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by M.Vahedi on 3/5/2019.
 */
public class SubscriptionPlanSrv implements Serializable {
    private long id;
    private String periodTypeCode;
    private int periodCount;
    private Long usageCountLimit;
    private Long creationDate;
    private String name;
    private BigDecimal price;
    private Boolean enable;
    private BigDecimal usageAmountLimit;
    private List<GuildSrv> permittedGuildList;
    private List<BusinessSoftSrv> permittedBusinessList;
    private List<ProductSrv> permittedProductList;
    private boolean allGuildsPermitted;
    private boolean allBusinessesPermitted;
    private boolean allProductsPermitted;
    private CurrencySrv currency;
    private GuildSrv invoiceGuild;
    private String typeCode;
    private ProductSrv product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPeriodTypeCode() {
        return periodTypeCode;
    }

    public void setPeriodTypeCode(String periodTypeCode) {
        this.periodTypeCode = periodTypeCode;
    }

    public int getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(int periodCount) {
        this.periodCount = periodCount;
    }

    public Long getUsageCountLimit() {
        return usageCountLimit;
    }

    public void setUsageCountLimit(Long usageCountLimit) {
        this.usageCountLimit = usageCountLimit;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public BigDecimal getUsageAmountLimit() {
        return usageAmountLimit;
    }

    public void setUsageAmountLimit(BigDecimal usageAmountLimit) {
        this.usageAmountLimit = usageAmountLimit;
    }

    public List<GuildSrv> getPermittedGuildList() {
        return permittedGuildList;
    }

    public void setPermittedGuildList(List<GuildSrv> permittedGuildList) {
        this.permittedGuildList = permittedGuildList;
    }

    public List<BusinessSoftSrv> getPermittedBusinessList() {
        return permittedBusinessList;
    }

    public void setPermittedBusinessList(List<BusinessSoftSrv> permittedBusinessList) {
        this.permittedBusinessList = permittedBusinessList;
    }

    public List<ProductSrv> getPermittedProductList() {
        return permittedProductList;
    }

    public void setPermittedProductList(List<ProductSrv> permittedProductList) {
        this.permittedProductList = permittedProductList;
    }

    public boolean isAllGuildsPermitted() {
        return allGuildsPermitted;
    }

    public void setAllGuildsPermitted(boolean allGuildsPermitted) {
        this.allGuildsPermitted = allGuildsPermitted;
    }

    public boolean isAllBusinessesPermitted() {
        return allBusinessesPermitted;
    }

    public void setAllBusinessesPermitted(boolean allBusinessesPermitted) {
        this.allBusinessesPermitted = allBusinessesPermitted;
    }

    public boolean isAllProductsPermitted() {
        return allProductsPermitted;
    }

    public void setAllProductsPermitted(boolean allProductsPermitted) {
        this.allProductsPermitted = allProductsPermitted;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public GuildSrv getInvoiceGuild() {
        return invoiceGuild;
    }

    public void setInvoiceGuild(GuildSrv invoiceGuild) {
        this.invoiceGuild = invoiceGuild;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public ProductSrv getProduct() {
        return product;
    }

    public void setProduct(ProductSrv product) {
        this.product = product;
    }
}
