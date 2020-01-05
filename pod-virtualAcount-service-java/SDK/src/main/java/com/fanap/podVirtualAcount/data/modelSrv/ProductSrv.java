package com.fanap.podVirtualAcount.data.modelSrv;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "ProductSrv",
        description = "desc"
)*/
public class ProductSrv extends ItemSrv {
    private String name;
    private String description;
    private List<String> categoryList;
    private ImageInfoSrv previewInfo;
    private String preview;
    private boolean unlimited;
    private BigDecimal availableCount;
    private BigDecimal price;
    private BigDecimal discount = BigDecimal.ZERO;
    private RateSrv rate;
    private SaleInfo saleInfo;
    private List<AttributeValueSrv> attributeValues;
    private GuildSrv guild;
    private boolean allowUserInvoice;
    private boolean allowUserPrice;
    private String templateCode;
    private List<SubProductSrv> subProducts;
    private ProductGroupSrv productGroup;
    private String content;
    private CurrencySrv currency;
    private ProductSrv parentProduct;
    private Double preferredTaxRate;

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

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public ImageInfoSrv getPreviewInfo() {
        return previewInfo;
    }

    public void setPreviewInfo(ImageInfoSrv previewInfo) {
        this.previewInfo = previewInfo;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public boolean isUnlimited() {
        return unlimited;
    }

    public void setUnlimited(boolean unlimited) {
        this.unlimited = unlimited;
    }

    public BigDecimal getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(BigDecimal availableCount) {
        this.availableCount = availableCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public List<AttributeValueSrv> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValueSrv> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public GuildSrv getGuild() {
        return guild;
    }

    public void setGuild(GuildSrv guild) {
        this.guild = guild;
    }

    public boolean isAllowUserInvoice() {
        return allowUserInvoice;
    }

    public void setAllowUserInvoice(boolean allowUserInvoice) {
        this.allowUserInvoice = allowUserInvoice;
    }

    public boolean isAllowUserPrice() {
        return allowUserPrice;
    }

    public void setAllowUserPrice(boolean allowUserPrice) {
        this.allowUserPrice = allowUserPrice;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public List<SubProductSrv> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<SubProductSrv> subProducts) {
        this.subProducts = subProducts;
    }

    public ProductGroupSrv getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroupSrv productGroup) {
        this.productGroup = productGroup;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public ProductSrv getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(ProductSrv parentProduct) {
        this.parentProduct = parentProduct;
    }

    public Double getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public void setPreferredTaxRate(Double preferredTaxRate) {
        this.preferredTaxRate = preferredTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSrv that = (ProductSrv) o;
        return unlimited == that.unlimited &&
                availableCount == that.availableCount &&
                price == that.price &&
                discount == that.discount &&
                allowUserInvoice == that.allowUserInvoice &&
                allowUserPrice == that.allowUserPrice &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(categoryList, that.categoryList) &&
                Objects.equals(previewInfo, that.previewInfo) &&
                Objects.equals(preview, that.preview) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(saleInfo, that.saleInfo) &&
                Objects.equals(attributeValues, that.attributeValues) &&
                Objects.equals(guild, that.guild) &&
                Objects.equals(templateCode, that.templateCode) &&
                Objects.equals(subProducts, that.subProducts) &&
                Objects.equals(productGroup, that.productGroup) &&
                Objects.equals(content, that.content) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(parentProduct, that.parentProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, categoryList, previewInfo, preview, unlimited, availableCount, price, discount, rate, saleInfo, attributeValues, guild, allowUserInvoice, allowUserPrice, templateCode, subProducts, productGroup, content, currency, parentProduct);
    }
}
